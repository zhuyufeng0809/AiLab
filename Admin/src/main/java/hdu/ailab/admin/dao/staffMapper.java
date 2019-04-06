package hdu.ailab.admin.dao;

import hdu.ailab.admin.bean.staff;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface staffMapper {
    int insert(staff record);

    int insertSelective(staff record);

    @Select("select * from staff where staff_id = #{id}")
    staff getStaffById(@Param("id") Integer sid);

    @Select("select * from staff where staff_phone = #{phone}")
    staff getStaffByPhone(@Param("phone") String phone);

    @Select("select * from staff where staff_type in (3,4)")
    List<staff> getStaff();

    @Update("update staff set staff_type = #{role} where staff_id = #{id}")
    Integer updateRoleById(@Param("id") Integer id,@Param("role") Integer role);

    @Select("select staff_name from staff where staff_id = #{id}")
    String getNameById(@Param("id") Integer id);
}