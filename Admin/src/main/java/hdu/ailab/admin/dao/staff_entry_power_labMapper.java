package hdu.ailab.admin.dao;

import hdu.ailab.admin.bean.staff_entry_power_lab;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface staff_entry_power_labMapper {

    @Insert("insert into staff_entry_power_lab values (#{staffId},#{labId},#{entryPowerName}," +
            "#{entryPowerPhone},#{entryPowerUserFace},#{entryPowerFingerPrint},#{entryPowerTime})")
    Integer insert(staff_entry_power_lab record);

    int insertSelective(staff_entry_power_lab record);
}