package hdu.ailab.admin.service;

import hdu.ailab.admin.bean.lab;

public interface LabService {

    Integer getLabId(String mac);

    lab getLabById(Integer id);
}
