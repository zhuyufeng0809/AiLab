package hdu.ailab.admin.service;

import java.util.List;

public interface StaffAdminLabService {

    List<Integer> getStaffId(Integer LabId);

    List<Integer> getLabId(Integer StaffId);

    boolean addAdmin(Integer LabId,Integer StaffId);

    boolean deleteAdmin(Integer LabId,Integer StaffId);
}
