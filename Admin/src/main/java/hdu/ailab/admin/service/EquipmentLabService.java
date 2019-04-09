package hdu.ailab.admin.service;


import hdu.ailab.admin.bean.equipid_num;
import hdu.ailab.admin.bean.equipment_lab;
import hdu.ailab.admin.bean.borrowequip;
import hdu.ailab.admin.bean.returnequip;

import java.util.List;

public interface EquipmentLabService {

    List<Integer> getEquipmentId(Integer id);

    List<equipment_lab> getEquipment(Integer equipment_id, Integer lab_id);

    List<equipment_lab> getEquipment(String name);

    List<borrowequip> getBorrow(Integer id);

    List<returnequip> getReturn(Integer id);

    equipid_num getIdNum(Integer rfid);

    Integer getNum(Integer rfid);
}
