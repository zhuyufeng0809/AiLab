package hdu.ailab.admin.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import hdu.ailab.admin.bean.equipment;
import hdu.ailab.admin.bean.equipment_lab;
import hdu.ailab.admin.rto.equipment.equipinfo;
import hdu.ailab.admin.rto.page;
import hdu.ailab.admin.service.EquipmentLabService;
import hdu.ailab.admin.service.EquipmentService;
import hdu.ailab.admin.service.LabService;
import hdu.ailab.admin.service.StaffService;
import hdu.ailab.admin.util.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
     * 根据mac地址验证实验室Id
     * @param mac
     * @return
     */
    private Integer Confirm_Identity(String mac){
        Integer LabId = labService.getLabId(mac);
        return LabId;
    }
}
