package hdu.ailab.admin.service.impl;

import hdu.ailab.admin.bean.staff;
import hdu.ailab.admin.dao.staffMapper;
import hdu.ailab.admin.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
