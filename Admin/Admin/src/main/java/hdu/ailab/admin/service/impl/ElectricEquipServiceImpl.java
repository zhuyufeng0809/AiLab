package hdu.ailab.admin.service.impl;

import hdu.ailab.admin.bean.electric_equip;
import hdu.ailab.admin.dao.electric_equipMapper;
import hdu.ailab.admin.service.ElectricEquipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ElectricEquipServiceImpl implements ElectricEquipService {

    @Autowired
    electric_equipMapper electric_equipMapper;

    public boolean addElectricEquip(electric_equip new_e){
        Integer result = electric_equipMapper.insert(new_e);
        if (result.equals(1)){
            return true;
        } else {
            return false;
        }
    }
}
