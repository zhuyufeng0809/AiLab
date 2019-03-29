package hdu.ailab.admin.dao;

import hdu.ailab.admin.bean.electric_equip;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

@Mapper
public interface electric_equipMapper {

    @Insert("insert into electric_equip values (#{electricId},#{electricName}," +
            "#{electricMode},#{electricTime},#{electricPort},#{electricType}," +
            "#{electricBrand},#{electricVersion},#{electricInfo})")
    Integer insert(electric_equip record);
    int insertSelective(electric_equip record);

}