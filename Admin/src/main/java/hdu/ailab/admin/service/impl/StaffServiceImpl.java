package hdu.ailab.admin.service.impl;

import hdu.ailab.admin.bean.staff;
import hdu.ailab.admin.dao.staffMapper;
import hdu.ailab.admin.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    staffMapper staffMapper;

    @Override
    public staff getStaff(Integer id){
        return staffMapper.getStaffById(id);
    }

    @Override
    public staff getStaff(String phone){
        return staffMapper.getStaffByPhone(phone);
    }

    @Override
    public List<staff> getStaffs(){
        return staffMapper.getStaff();
    }

    @Override
    public boolean updateStaff(Integer id,Integer role){
        Integer result = staffMapper.updateRoleById(id,role);
        if (result == 1){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getName(Integer id){
        return staffMapper.getNameById(id);
    }

    @Override
    public Integer existStaff(Integer id){
        return staffMapper.existStaff(id);
    }
}
