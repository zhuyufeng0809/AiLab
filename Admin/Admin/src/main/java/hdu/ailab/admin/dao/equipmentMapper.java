package hdu.ailab.admin.dao;

import hdu.ailab.admin.bean.equipment;

public interface equipmentMapper {
    int insert(equipment record);

    int insertSelective(equipment record);
}