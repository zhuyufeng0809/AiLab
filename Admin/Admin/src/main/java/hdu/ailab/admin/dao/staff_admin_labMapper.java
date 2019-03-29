package hdu.ailab.admin.dao;

import hdu.ailab.admin.bean.staff_admin_lab;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface staff_admin_labMapper {

    @Insert("insert into staff_admin_lab values(#{StaffId},#{LabId})")
    Integer insert(@Param("LabId") Integer LabId,@Param("StaffId")Integer StaffId);

    int insertSelective(staff_admin_lab record);

    @Delete("delete from staff_admin_lab where lab_id = #{LabId} and staff_id = #{StaffId}")
    Integer delect(@Param("LabId") Integer LabId,@Param("StaffId")Integer StaffId);

    @Select("select staff_id from staff_admin_lab where lab_id = #{LabId}")
    List<Integer> getStaffIdByLabId(@Param("LabId") Integer LabId);

    @Select("select lab_id from staff_admin_lab where staff_id = #{StaffId}")
    List<Integer> getLabIdByStaffId(@Param("StaffId")Integer StaffId);
}