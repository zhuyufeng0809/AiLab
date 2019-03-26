package hdu.ailab.admin.service.impl;

import hdu.ailab.admin.dao.collegeMapper;
import hdu.ailab.admin.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollegeServiceImpl implements CollegeService {

    @Autowired
    collegeMapper collegeMapper;
    public String getName(Integer id){
        return collegeMapper.getCollegeNameById(id);
    }
}
