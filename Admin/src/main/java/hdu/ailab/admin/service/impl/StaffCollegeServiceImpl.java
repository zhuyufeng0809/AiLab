package hdu.ailab.admin.service.impl;

import hdu.ailab.admin.dao.staff_collegeMapper;
import hdu.ailab.admin.service.StaffCollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffCollegeServiceImpl implements StaffCollegeService {

    @Autowired
    staff_collegeMapper staff_collegeMapper;

    public Integer getId(Integer id){
        return staff_collegeMapper.getCollegeIdById(id);
    }
}
