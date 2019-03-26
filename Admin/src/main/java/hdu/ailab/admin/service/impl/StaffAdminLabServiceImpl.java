package hdu.ailab.admin.service.impl;

import hdu.ailab.admin.dao.staff_admin_labMapper;
import hdu.ailab.admin.service.StaffAdminLabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffAdminLabServiceImpl implements StaffAdminLabService {

    @Autowired
    staff_admin_labMapper staff_admin_labMapper;

    @Override
    public List<Integer> getStaffId(Integer LabId){
        return staff_admin_labMapper.getStaffIdByLabId(LabId);
    }

}
