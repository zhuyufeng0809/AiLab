package hdu.ailab.admin.dao;

import hdu.ailab.admin.bean.lab_college;

public interface lab_collegeMapper {
    int insert(lab_college record);

    int insertSelective(lab_college record);
}