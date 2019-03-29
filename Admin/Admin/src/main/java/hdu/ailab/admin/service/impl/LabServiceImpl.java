package hdu.ailab.admin.service.impl;

import hdu.ailab.admin.bean.lab;
import hdu.ailab.admin.dao.labMapper;
import hdu.ailab.admin.service.LabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LabServiceImpl implements LabService {

    @Autowired
    labMapper labMapper;

    @Override
    public Integer getLabId(String mac){
        return labMapper.getIdByMac(mac);
    }

    @Override
    public lab getLabById(Integer id){
        return labMapper.getLabById(id);
    }

    @Override
    public List<lab> getLab(){
        return labMapper.getLab();
    }
}
