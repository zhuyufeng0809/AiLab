package hdu.ailab.admin.service.impl;

import hdu.ailab.admin.bean.staff_entry_power_lab;
import hdu.ailab.admin.dao.staff_entry_power_labMapper;
import hdu.ailab.admin.service.StaffEntryPowerLabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffEntryPowerLabServiceImpl implements StaffEntryPowerLabService {

    @Autowired
    staff_entry_power_labMapper staff_entry_power_labMapper;

    @Override
    public boolean addEntryPower(staff_entry_power_lab newone){
        Integer result = staff_entry_power_labMapper.insert(newone);
        if (result.equals(1)){
            return true;
        } else {
            return false;
        }
    }
}
