package hdu.ailab.admin.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import hdu.ailab.admin.bean.*;
import hdu.ailab.admin.rto.equipment.borrowinfo;
import hdu.ailab.admin.rto.equipment.equipinfo;
import hdu.ailab.admin.rto.equipment.useinfo;
import hdu.ailab.admin.rto.page;
import hdu.ailab.admin.service.*;
import hdu.ailab.admin.util.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@RestController
@RequestMapping(value = "/equip")
public class EquipmentController {

    @Autowired
    EquipmentLabService equipmentLabService;

    @Autowired
    EquipmentService equipmentService;

    @Autowired
    LabService labService;

    @Autowired
    StaffService staffService;

    @Autowired
    StaffAdminLabService staffAdminLabService;

    @Autowired
    StaffUseEquipmentService staffUseEquipmentService;

    /**
     * 管理员查看所属实验室设备
     * @param pageinfo
     * @param mac
     * @return
     */
    @GetMapping("/getlabequip")
    public Message getLabequipByLab(page pageinfo,String mac){
        PageHelper.startPage(pageinfo.getPageNum(),pageinfo.getPageSize());

        Integer LabId = Confirm_Identity(mac);

        List<Integer> equipid = equipmentLabService.getEquipmentId(LabId);
        HashSet<Integer> set_temp = new HashSet();
        Iterator<Integer> equip_iter = equipid.iterator();
        while (equip_iter.hasNext()){
            set_temp.add(equip_iter.next());
        }

        List<equipinfo> target = new LinkedList<>();
        Iterator<Integer> set_iter = set_temp.iterator();
        while (set_iter.hasNext()){
            Integer equipmentid = set_iter.next();
            equipment result1 = equipmentService.getEquip(equipmentid);
            List<equipment_lab> result2 = equipmentLabService.getEquipment(equipmentid,LabId);
            equipinfo temp = new equipinfo();
            temp.setEquip(result1);
            temp.setEquilist(result2);
            target.add(temp);
        }
        PageInfo<equipinfo> pageInfo = new PageInfo<>(target);
        return new Message().ok(6666,"success get").addData("result",pageInfo);
    }

    /**
     * 管理员查看负责的设备
     * @param pageinfo
     * @param id
     * @return
     */
    @GetMapping("/getstaffequip")
    public Message getLabequipByStaff(page pageinfo,Integer id){
        PageHelper.startPage(pageinfo.getPageNum(),pageinfo.getPageSize());

        String staff_name = staffService.getName(id);
        List<equipment_lab> target = equipmentLabService.getEquipment(staff_name);

        PageInfo<equipment_lab> pageInfo = new PageInfo<>(target);
        return new Message().ok(6666,"success get").addData("result",pageInfo);
    }

    /**
     * 管理员查看所属实验室设备借出归还情况
     * @param pageinfo
     * @param id
     * @param use
     * @return
     */
    @GetMapping("/getuse")
    public Message getUse(page pageinfo,Integer id,Integer use){
        PageHelper.startPage(pageinfo.getPageNum(),pageinfo.getPageSize());

        List<Integer> labid_list = getLabListByid(id);
        Iterator<Integer> iter = labid_list.iterator();

        List<useinfo> target = new LinkedList<>();
        while (iter.hasNext()){
            Integer labid_temp = iter.next();
            lab lab_temp = labService.getLabById(labid_temp);
            useinfo newinfo = new useinfo();
            newinfo.setLabname(lab_temp.getLabName());
            newinfo.setLablocation(lab_temp.getLabBuilding()+"教"+
                    lab_temp.getLabFloor()+"层"+lab_temp.getLabRoom());
            if (use.equals(0)){
                List<borrowequip> newborrow = equipmentLabService.getBorrow(labid_temp);
                newinfo.setBorrowlist(newborrow);
                newinfo.setReturnlist(null);
            } else {
                List<returnequip> newreturn = equipmentLabService.getReturn(labid_temp);
                newinfo.setReturnlist(newreturn);
                newinfo.setBorrowlist(null);
            }
            target.add(newinfo);
        }
        PageInfo<useinfo> pageInfo = new PageInfo<>(target);
        return new Message().ok(6666,"success get").addData("result",pageInfo);
    }

    /**
     * 登记借用设备
     * @param binfo
     * @return
     */
    @PostMapping("/borrow")
    public Message borrow(borrowinfo binfo){
        Integer uuid = staffService.existStaff(binfo.getStaffid());
        if (uuid == null){
            return new Message().error(2222,"无此人信息");
        } else {
            equipid_num temp = equipmentLabService.getIdNum(binfo.getRfid());
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            try {
                Date borrowdate = format.parse(binfo.getBorrowdate());
                Date willreturndate = format.parse(binfo.getWillreturndate());
                staff_use_equipment newone = new staff_use_equipment();
                newone.setEquipmentId(temp.getEquipmentId());
                newone.setEquipmentNumber(temp.getEquipmentNumber());
                newone.setStaffId(binfo.getStaffid());
                newone.setUuid(uuid);
                newone.setUseBoorrowTime(borrowdate);
                newone.setUseWillReturnTime(willreturndate);
                newone.setUseRealReturnTime(null);
                if (staffUseEquipmentService.addUse(newone)){
                    return new Message().ok(6666,"success add");
                } else {
                    return new Message().error(2222,"faild add");
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return new Message().error(2222,"faild add");
        }
    }

    /**
     * 登记归还设备
     * @param rfid
     * @param realreturndate
     * @return
     */
    @PostMapping("/return")
    public Message returnequip(Integer rfid,String realreturndate){
        Integer num = equipmentLabService.getNum(rfid);
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = format.parse(realreturndate);
            if (staffUseEquipmentService.updateUse(num,date)){
                return new Message().ok(6666,"success return");
            } else {
                return new Message().error(2222,"设备验证失败");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new Message().error(2222,"faild return");

    }

    @PostMapping("/confirmstaff")
    public boolean ConfirmStaff(Integer id){
        Integer uuid = staffService.existStaff(id);
        if (uuid == null){
            return false;
        } else {
            return true;
        }
    }

    @PostMapping("/confirmequip")
    public boolean ConfirmEquip(Integer rfid){
        Integer num = equipmentLabService.getNum(rfid);
        if (staffUseEquipmentService.checkexist(num)){
            return true;
        } else {
            return false;
        }
    }

    /**
     * 根据管理员工号获取管理实验室id列表
     * @param id
     * @return
     */
    private List<Integer> getLabListByid(Integer id){
        return staffAdminLabService.getLabId(id);
    }


    /**
     * 根据mac地址验证实验室Id
     * @param mac
     * @return
     */
    private Integer Confirm_Identity(String mac){
        Integer LabId = labService.getLabId(mac);
        return LabId;
    }
}
