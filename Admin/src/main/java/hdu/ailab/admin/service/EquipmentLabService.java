package hdu.ailab.admin.service;


import hdu.ailab.admin.bean.equipment_lab;

import java.util.List;

public interface EquipmentLabService {

    List<Integer> getEquipmentId(Integer id);

    List<equipment_lab> getEquipment(Integer equipment_id, Integer lab_id);

    List<equipment_lab> getEquipment(String name);
}
