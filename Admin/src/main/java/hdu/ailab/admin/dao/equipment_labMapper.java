package hdu.ailab.admin.dao;

import hdu.ailab.admin.bean.equipment_lab;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface equipment_labMapper {
    int insert(equipment_lab record);

    int insertSelective(equipment_lab record);

    @Select("select equipment_id from equipment_lab where lab_id " +
            "= #{id} group by equipment_id")
    List<Integer> getEquipmentIdByLabId(@Param("id") Integer id);

    @Select("select * from equipment_lab where equipment_id = #{equipment_id} and lab_id = #{lab_id}")
    List<equipment_lab> getEquipment(@Param("equipment_id") Integer equipment_id,
                                 @Param("lab_id") Integer lab_id);

    @Select("select * from equipment_lab where equipment_use_people = #{people} ")
    List<equipment_lab> getEquipmentByUsePeople(@Param("people") String name);
}