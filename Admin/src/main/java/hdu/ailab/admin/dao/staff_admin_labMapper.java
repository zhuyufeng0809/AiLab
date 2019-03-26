package hdu.ailab.admin.dao;

import hdu.ailab.admin.bean.staff_admin_lab;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface staff_admin_labMapper {
    int insert(staff_admin_lab record);

    int insertSelective(staff_admin_lab record);

    @Select("select staff_id from staff_admin_lab where lab_id = #{LabId}")
    List<Integer> getStaffIdByLabId(@Param("LabId") Integer LabId);
}