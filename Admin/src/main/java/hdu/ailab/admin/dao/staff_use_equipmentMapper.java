package hdu.ailab.admin.dao;

import hdu.ailab.admin.bean.staff_use_equipment;

public interface staff_use_equipmentMapper {
    int insert(staff_use_equipment record);

    int insertSelective(staff_use_equipment record);
}