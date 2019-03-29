package hdu.ailab.admin.dao;

import hdu.ailab.admin.bean.major_college;

public interface major_collegeMapper {
    int insert(major_college record);

    int insertSelective(major_college record);
}