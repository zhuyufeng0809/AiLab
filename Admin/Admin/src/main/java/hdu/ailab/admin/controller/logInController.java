package hdu.ailab.admin.controller;

import hdu.ailab.admin.bean.staff;
import hdu.ailab.admin.service.logInService;
import hdu.ailab.admin.util.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/login")
public class logInController {
/*
    @Autowired
    logInService logInService;

    @GetMapping("/judgefirst/{staffId}/{staffPassword}")
    public Message judgeFirstLogIn(@PathVariable Integer staffId,@PathVariable String staffPassword){
        staff targetStaff = logInService.getStaff(staffId,staffPassword);
        if (targetStaff == null){
            return new Message().ok(1001,"first login");
        } else {
            if (staffPassword.equals(targetStaff.getStaffPassword())){
                return new Message().ok(1002,"success login");
            } else {
                return new Message().error(1003,"staffId or staffPassword error");
            }
        }
    }
    */
}
