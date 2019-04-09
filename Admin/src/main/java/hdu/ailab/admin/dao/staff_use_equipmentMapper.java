package hdu.ailab.admin.dao;

import hdu.ailab.admin.bean.staff_use_equipment;
import org.apache.ibatis.annotations.*;

import java.util.Date;

@Mapper
public interface staff_use_equipmentMapper {
    int insert(staff_use_equipment record);

    int insertSelective(staff_use_equipment record);

    @Insert("insert into staff_use_equipment (equipment_id,\n" +
            "                                 uuid,\n" +
            "                                 equipment_number,\n" +
            "                                 staff_id,\n" +
            "                                 use_boorrow_time,\n" +
            "                                 use_will_return_time,\n" +
            "                                 use_real_return_time)\n" +
            "values (#{equipmentId},#{uuid},#{equipmentNumber},#{staffId},#{useBoorrowTime},#{useWillReturnTime},#{useRealReturnTime})")
    Integer insertborrow(staff_use_equipment record);

    @Update("update staff_use_equipment set use_real_return_time = #{date} where equipment_number = #{number}")
    Integer updatereturn(@Param("number") Integer number,@Param("date") Date returndate);

    @Select("select count(*) from staff_use_equipment where equipment_number = #{number}")
    Integer checkexist(@Param("number") Integer number);
}