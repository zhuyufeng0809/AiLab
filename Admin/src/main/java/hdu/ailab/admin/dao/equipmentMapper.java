package hdu.ailab.admin.dao;

import hdu.ailab.admin.bean.equipment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface equipmentMapper {
    int insert(equipment record);

    int insertSelective(equipment record);

    @Select("select * from equipment where equipment_id = #{id}")
    equipment getEquipById(@Param("id") Integer id);
}