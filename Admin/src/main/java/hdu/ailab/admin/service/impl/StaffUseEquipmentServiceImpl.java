package hdu.ailab.admin.service.impl;

import hdu.ailab.admin.bean.staff_use_equipment;
import hdu.ailab.admin.dao.staff_use_equipmentMapper;
import hdu.ailab.admin.service.StaffUseEquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class StaffUseEquipmentServiceImpl implements StaffUseEquipmentService {

    @Autowired
    staff_use_equipmentMapper staff_use_equipmentMapper;

    @Override
    public boolean addUse(staff_use_equipment record){
        if (staff_use_equipmentMapper.insertborrow(record).equals(1)){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean updateUse(Integer num, Date returndate){
        if (staff_use_equipmentMapper.updatereturn(num,returndate).equals(1)){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean checkexist(Integer num){
        if (staff_use_equipmentMapper.checkexist(num).equals(1)){
            return true;
        } else {
            return false;
        }
    }
}
