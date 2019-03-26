package hdu.ailab.admin.dao;

import hdu.ailab.admin.bean.electric_lab;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface electric_labMapper {

    @Insert("insert into electric_lab values (#{electricId},#{labId})")
    Integer insert(electric_lab record);
    int insertSelective(electric_lab record);
}