package hdu.ailab.admin.service;

import hdu.ailab.admin.bean.staff_use_equipment;

import java.util.Date;

public interface StaffUseEquipmentService {
    boolean addUse(staff_use_equipment record);
    boolean updateUse(Integer num, Date returndate);
    boolean checkexist(Integer num);
}
