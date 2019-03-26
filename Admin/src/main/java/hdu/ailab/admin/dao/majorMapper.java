package hdu.ailab.admin.dao;

import hdu.ailab.admin.bean.major;

public interface majorMapper {
    int insert(major record);

    int insertSelective(major record);
}