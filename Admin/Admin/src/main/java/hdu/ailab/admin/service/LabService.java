package hdu.ailab.admin.service;

import hdu.ailab.admin.bean.lab;

import java.util.List;

public interface LabService {

    Integer getLabId(String mac);

    lab getLabById(Integer id);

    List<lab> getLab();
}
