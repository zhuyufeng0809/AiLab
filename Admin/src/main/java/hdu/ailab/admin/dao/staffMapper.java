package hdu.ailab.admin.dao;

import hdu.ailab.admin.bean.staff;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface staffMapper {
    int insert(staff record);

    int insertSelective(staff record);

    @Select("select * from staff where staff_id = #{id}")
    staff getStaffById(@Param("id") Integer sid);

    @Select("select * from staff where staff_phone = #{phone}")
    staff getStaffByPhone(@Param("phone") String phone);
}