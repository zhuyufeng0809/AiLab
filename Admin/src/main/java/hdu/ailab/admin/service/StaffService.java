package hdu.ailab.admin.service;

import hdu.ailab.admin.bean.staff;

public interface StaffService {

    staff getStaff(Integer id);

    staff getStaff(String phone);
}
