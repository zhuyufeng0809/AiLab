package hdu.ailab.admin.controller;

import hdu.ailab.admin.bean.*;
import hdu.ailab.admin.rto.new_electric_equip;
import hdu.ailab.admin.rto.new_entry_power;
import hdu.ailab.admin.service.*;
import hdu.ailab.admin.util.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping(value = "/ipc")
public class IpcController {

    @Autowired
    LabService labService;

    @Autowired
    StaffAdminLabService staffAdminLabService;

    @Autowired
    StaffService staffService;

    @Autowired
    StaffCollegeService staffCollegeService;

    @Autowired
    CollegeService collegeService;

    @Autowired
    ElectricEquipService electricEquipService;

    @Autowired
    ElectricLabService electricLabService;

    @Autowired
    StaffEntryPowerLabService staffEntryPowerLabService;


    /**
     * 工控机获取管理员信息
     * @param mac
     * @return
     */
    @GetMapping("/getAdmin/{mac}")
    public Message getAdminInformation(@PathVariable("mac") String mac){
        Integer LabId = Confirm_Identity(mac);
        if (LabId == null){
            return new Message().error(2222,"无此实验室或者Mac地址错误");
        }
        List<Integer> StaffId = staffAdminLabService.getStaffId(LabId);
        if (StaffId == null){
            return new Message().error(2222,"此实验室无管理员");
        }
        ArrayList data = new ArrayList();
        for (int i = 0; i < StaffId.size(); i++){
            staff staff_temp = staffService.getStaff(StaffId.get(i));
            if (staff_temp == null){
                return new Message().error(2222,"无此管理员信息");
            }
            Integer collegeid_temp = staffCollegeService.getId(StaffId.get(i));
            if (collegeid_temp == null){
                return new Message().error(2222,"无此管理员学院信息");
            }
            HashMap<String,Object> map = new HashMap<>();
            map.put("admin_id",staff_temp.getStaffId());
            map.put("admin_password",staff_temp.getStaffPassword());
            map.put("admin_name",staff_temp.getStaffName());
            map.put("admin_phone",staff_temp.getStaffPhone());
            map.put("admin_college",collegeService.getName(collegeid_temp));
            data.add(map);
        }
        return new Message().ok(6666,"success get admin").addData("result",data);
    }


    /**
     * 工控机获取实验室信息
     * @param mac
     * @return
     */
    @GetMapping("/getLab/{mac}")
    public Message getLabInformation(@PathVariable("mac") String mac){
        Integer LabId = Confirm_Identity(mac);
        if (LabId == null){
            return new Message().error(2222,"无此实验室或者Mac地址错误");
        }
        lab lab_temp = labService.getLabById(LabId);
        HashMap<String,Object> map = new HashMap<>();
        String lab_location = lab_temp.getLabBuilding()+"教"+lab_temp.getLabFloor()
                +"层"+lab_temp.getLabRoom();
        map.put("lab_name",lab_temp.getLabName());
        map.put("lab_location",lab_location);
        map.put("lab_number",lab_temp.getLabNumber());
        map.put("lab_type",lab_temp.getLabType());
        map.put("lab_info",lab_temp.getLabInfo());

        return new Message().ok(6666,"success get lab").addData("result",map);
    }

    /**
     * 后台同步电器信息
     * @param newone
     * @return
     */
    @PostMapping("/getElectric")
    public Message getElectricInformation(new_electric_equip newone){
        String mac = newone.getMac();
        Integer LabId = Confirm_Identity(mac);
        if (LabId == null){
            return new Message().error(2222,"无此实验室或者Mac地址错误");
        }

        DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");

        electric_equip new_e = new electric_equip();
        new_e.setElectricId(newone.getElectric_id());
        new_e.setElectricName(newone.getElectric_name());
        new_e.setElectricMode(newone.getElectric_mode());
        try {
            new_e.setElectricTime(format1.parse(newone.getElectric_time()));
        } catch (ParseException e) {
            e.printStackTrace();
            return new Message().error(2222,"日期格式错误");
        }
        new_e.setElectricPort(newone.getElectric_port());
        new_e.setElectricType(newone.getElectric_type());
        new_e.setElectricBrand(newone.getElectric_brand());
        new_e.setElectricVersion(newone.getElectric_version());
        new_e.setElectricInfo(newone.getElectric_info());

        electric_lab new_e_l = new electric_lab();
        new_e_l.setElectricId(newone.getElectric_id());
        new_e_l.setLabId(LabId);

        boolean result1 = electricEquipService.addElectricEquip(new_e);
        boolean result2 = electricLabService.addElectricLab(new_e_l);

        if (result1 == true && result2 == true){
            return new Message().ok(6666,"success add");
        } else {
            return new Message().error(2222,"failed add ");
        }
    }

    /**
     * 后台同步门禁信息
     * @param newone
     * @return
     */
    @PostMapping("/getEntryPower")
    public Message getEntryPowerInformation(new_entry_power newone){
        String mac = newone.getMac();
        Integer LabId = Confirm_Identity(mac);
        if (LabId == null){
            return new Message().error(2222,"无此实验室或者Mac地址错误");
        }

        DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");

        staff staff_temp = staffService.getStaff(newone.getEntry_power_phone());

        if (staff_temp == null){
            return new Message().error(2222,"无此学工记录或者学工电话填写错误");
        }

        staff_entry_power_lab target = new staff_entry_power_lab();
        target.setStaffId(staff_temp.getStaffId());
        target.setLabId(LabId);
        target.setEntryPowerName(newone.getEntry_power_name());
        target.setEntryPowerPhone(newone.getEntry_power_phone());
        target.setEntryPowerUserFace(newone.getEntry_power_user_face());
        target.setEntryPowerFingerPrint(newone.getEntry_power_finger_print());
        try {
            target.setEntryPowerTime(format1.parse(newone.getEntry_power_time()));
        } catch (ParseException e) {
            e.printStackTrace();
            return new Message().error(2222,"日期格式错误");
        }

        boolean result = staffEntryPowerLabService.addEntryPower(target);
        if (result){
            return new Message().ok(6666,"success add");
        } else {
            return new Message().error(2222,"failed add ");
        }
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
