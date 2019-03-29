package hdu.ailab.admin.dao;

import hdu.ailab.admin.bean.staff_college;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface staff_collegeMapper {
    int insert(staff_college record);

    int insertSelective(staff_college record);

    @Select("select college_id from staff_college where staff_id = #{id}")
    Integer getCollegeIdById(@Param("id") Integer id);
}