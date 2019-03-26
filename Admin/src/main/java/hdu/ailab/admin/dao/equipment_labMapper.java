package hdu.ailab.admin.dao;

import hdu.ailab.admin.bean.equipment_lab;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface equipment_labMapper {
    int insert(equipment_lab record);

    int insertSelective(equipment_lab record);
}