package hdu.ailab.admin.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import hdu.ailab.admin.bean.lab;
import hdu.ailab.admin.bean.staff;
import hdu.ailab.admin.rto.admin.labinfo;
import hdu.ailab.admin.rto.admin.staffinfo;
import hdu.ailab.admin.rto.page;
import hdu.ailab.admin.service.LabService;
import hdu.ailab.admin.service.StaffAdminLabService;
import hdu.ailab.admin.service.StaffService;
import hdu.ailab.admin.util.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping(value = "/admin")
public class AdminController {

    @Autowired
    StaffService staffService;

    @Autowired
    LabService labService;

    @Autowired
    StaffAdminLabService staffAdminLabService;

    /**
     * 超级管理员获取全部教师信息
     * @param requestPage
     * @return
     */

    @GetMapping("/getstaff")
    public Message getStaffInformation(page requestPage){
        PageHelper.startPage(requestPage.getPageNum(),requestPage.getPageSize());
        List<staff> mystaff = staffService.getStaffs();
        if (mystaff.size() == 0){
            return new Message().error(2222,"无学工信息");
        }
        List<staffinfo> target = new LinkedList<>();
        Iterator<staff> iter = mystaff.iterator();
        while (iter.hasNext()){
            staffinfo temp = new staffinfo();
            staff staff_temp = iter.next();
            temp.setStaffId(staff_temp.getStaffId());
            temp.setStaffName(staff_temp.getStaffName());
            temp.setStaffState(staff_temp.getStaffState());
            temp.setStaffPhone(staff_temp.getStaffPhone());
            temp.setStaffEmail(staff_temp.getStaffEmail());
            temp.setStaffType(staff_temp.getStaffType());
            ((LinkedList<staffinfo>) target).addLast(temp);
        }
        PageInfo<staffinfo> pageInfo = new PageInfo<>(target);
        return new Message().ok(6666,"success get").addData("result",pageInfo);
    }

    /**
     * 超级管理员更改管理员权限
     * @param id
     * @param role
     * @return
     */

    @PostMapping("/changerole")
    public Message addAdmin(Integer id,Integer role){
            boolean result = staffService.updateStaff(id,role);
            if (result){
                return new Message().ok(6666,"success change");
            } else {
                return new Message().error(2222,"faild cahnge");
            }
    }

    /**
     * 管理员获取全部实验室信息
     * @param requestPage
     * @param id
     * @return
     */

    @GetMapping("/getlab")
    public Message getLabInformation(page requestPage,Integer id){
        PageHelper.startPage(requestPage.getPageNum(),requestPage.getPageSize());
        List<lab> mylab = labService.getLab();
        if (mylab.size() == 0){
            return new Message().error(2222,"no lab info");
        }
        List<Integer> target = staffAdminLabService.getLabId(id);
        List<labinfo> result = new LinkedList<>();
        Iterator<lab> iter = mylab.iterator();
        while (iter.hasNext()){
            labinfo temp = new labinfo();
            lab lab_temp = iter.next();
            temp.setLabName(lab_temp.getLabName());
            String location = lab_temp.getLabBuilding()+"教"+
                    lab_temp.getLabFloor()+"层"+lab_temp.getLabRoom();
            temp.setLabLocation(location);
            temp.setLabNumber(lab_temp.getLabNumber());
            temp.setLabType(lab_temp.getLabType());
            temp.setLabInfo(lab_temp.getLabInfo());
            temp.setLabMac(lab_temp.getLabMac());
            if (target.contains(lab_temp.getLabId())){
                temp.setLabAdmin(true);
            } else {
                temp.setLabAdmin(false);
            }
            ((LinkedList<labinfo>) result).addLast(temp);
        }
        PageInfo<labinfo> pageInfo = new PageInfo<>(result);
        return new Message().ok(6666,"success get").addData("result",pageInfo);
    }

    /**
     * 管理员添加管理的实验室
     * @param mac
     * @param StaffId
     * @return
     */

    @PostMapping("/addadmin")
    public Message addAdminLab(String mac,Integer StaffId){
        Integer LabId = Confirm_Identity(mac);
        boolean result = staffAdminLabService.addAdmin(LabId,StaffId);
        if (result){
            return new Message().ok(6666,"success add");
        } else {
            return new Message().error(2222,"faild add");
        }
    }

    /**
     * 管理员删除管理的实验室
     * @param mac
     * @param StaffId
     * @return
     */
    @PostMapping("/deleteadmin")
    public Message deleteAdmin(String mac,Integer StaffId){
        Integer LabId = Confirm_Identity(mac);
        boolean result = staffAdminLabService.deleteAdmin(LabId,StaffId);
        if (result){
            return new Message().ok(6666,"success delete");
        } else {
            return new Message().error(2222,"faild delete");
        }
    }

    /**
     * 根据mac地址验证实验室Id
     * @param mac
     * @return
     */
    private Integer Confirm_Identity(String mac){
        Integer LabId = labService.getLabId(mac);
        System.out.println(LabId);
        return LabId;
    }

}
