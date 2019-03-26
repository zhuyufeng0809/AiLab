package hdu.ailab.admin.service.impl;

import hdu.ailab.admin.bean.electric_lab;
import hdu.ailab.admin.dao.electric_labMapper;
import hdu.ailab.admin.service.ElectricLabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ElectricLabServiceImpl implements ElectricLabService {

    @Autowired
    electric_labMapper electric_labMapper;

    @Override
    public boolean addElectricLab(electric_lab newone){
        Integer result = electric_labMapper.insert(newone);;
        if (result.equals(1)){
            return true;
        } else {
            return false;
        }
    }

}
