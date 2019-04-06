package hdu.ailab.admin.service.impl;

import hdu.ailab.admin.bean.equipment;
import hdu.ailab.admin.dao.equipmentMapper;
import hdu.ailab.admin.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquipmentServiceImpl implements EquipmentService {

    @Autowired
    equipmentMapper equipmentMapper;

    @Override
    public equipment getEquip(Integer id){
        return equipmentMapper.getEquipById(id);
    }
}
