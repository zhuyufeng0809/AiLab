package hdu.ailab.admin.service.impl;

import hdu.ailab.admin.bean.equipment_lab;
import hdu.ailab.admin.bean.returnequip;
import hdu.ailab.admin.dao.equipment_labMapper;
import hdu.ailab.admin.bean.borrowequip;
import hdu.ailab.admin.service.EquipmentLabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentLabServiceImpl implements EquipmentLabService {

    @Autowired
    equipment_labMapper equipment_labMapper;

    @Override
    public List<Integer> getEquipmentId(Integer id){
        return equipment_labMapper.getEquipmentIdByLabId(id);
    }

    @Override
    public List<equipment_lab> getEquipment(Integer equipment_id, Integer lab_id){
        return equipment_labMapper.getEquipment(equipment_id,lab_id);
    }

    @Override
    public List<equipment_lab> getEquipment(String name){
        return equipment_labMapper.getEquipmentByUsePeople(name);
    }

    @Override
    public List<borrowequip> getBorrow(Integer id){
        return equipment_labMapper.getBorrow(id);
    }

    @Override
    public List<returnequip> getReturn(Integer id){
        return equipment_labMapper.getReturn(id);
    }
}
