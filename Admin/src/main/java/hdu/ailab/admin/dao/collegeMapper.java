package hdu.ailab.admin.dao;

import hdu.ailab.admin.bean.college;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface collegeMapper {
    int insert(college record);

    int insertSelective(college record);

    @Select("select college_name from college where college_id =#{id}")
    String getCollegeNameById(@Param("id") Integer id);
}