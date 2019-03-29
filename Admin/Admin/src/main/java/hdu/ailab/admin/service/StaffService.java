package hdu.ailab.admin.service;

import hdu.ailab.admin.bean.staff;

import java.util.List;

public interface StaffService {

    staff getStaff(Integer id);

    staff getStaff(String phone);

    List<staff> getStaffs();

    boolean updateStaff(Integer id,Integer role);
}
