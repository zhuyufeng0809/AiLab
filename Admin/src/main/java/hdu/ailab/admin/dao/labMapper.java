package hdu.ailab.admin.dao;

import hdu.ailab.admin.bean.lab;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface labMapper {
    int insert(lab record);

    int insertSelective(lab record);

    @Select("select lab_id from lab where lab_mac = #{mac}")
    Integer getIdByMac(@Param("mac") String mac);

    @Select("select * from lab where lab_id = #{id}")
    lab getLabById(@Param("id") Integer id);
}