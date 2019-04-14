package hdu.ailab.admin.dao;

import hdu.ailab.admin.bean.equipid_num;
import hdu.ailab.admin.bean.equipment_lab;
import hdu.ailab.admin.bean.borrowequip;
import hdu.ailab.admin.bean.returnequip;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface equipment_labMapper {
    int insert(equipment_lab record);

    int insertSelective(equipment_lab record);

    @Select("select equipment_id from equipment_lab where lab_id " +
            "= #{id} group by equipment_id")
    List<Integer> getEquipmentIdByLabId(@Param("id") Integer id);

    @Select("select * from equipment_lab where equipment_id = #{equipment_id} and lab_id = #{lab_id}")
    List<equipment_lab> getEquipment(@Param("equipment_id") Integer equipment_id,
                                 @Param("lab_id") Integer lab_id);

    @Select("select * from equipment_lab where equipment_use_people = #{people} ")
    List<equipment_lab> getEquipmentByUsePeople(@Param("people") String name);

    @Select("select equipment_name,equipment_lab.equipment_number,equipment_rfid,\n" +
            "       staff_use_equipment.staff_id,staff_name,staff_phone,use_boorrow_time,\n" +
            "       use_will_return_time\n" +
            "from equipment inner join equipment_lab on equipment.equipment_id = equipment_lab.equipment_id\n" +
            "inner join staff_use_equipment on equipment_lab.equipment_number = staff_use_equipment.equipment_number\n" +
            "inner join staff on staff_use_equipment.staff_id = staff.staff_id\n" +
            "where lab_id = #{lab_id} and use_real_return_time is null")
    List<borrowequip> getBorrow(@Param("lab_id") Integer id);

    @Select("select equipment_name,equipment_lab.equipment_number,equipment_rfid,\n" +
            "       staff_use_equipment.staff_id,staff_name,staff_phone,use_boorrow_time,\n" +
            "       use_will_return_time,use_real_return_time\n" +
            "from equipment inner join equipment_lab on equipment.equipment_id = equipment_lab.equipment_id\n" +
            "inner join staff_use_equipment on equipment_lab.equipment_number = staff_use_equipment.equipment_number\n" +
            "inner join staff on staff_use_equipment.staff_id = staff.staff_id\n" +
            "where lab_id = 10 and use_real_return_time is not null\n" +
            "\n")
    List<returnequip> getReturn(@Param("lab_id") Integer id);

    @Select("select equipment_id,equipment_number from equipment_lab where equipment_rfid =#{rfid}")
    equipid_num getIdNumByRfid(@Param("rfid") Integer rfid);

    @Select("select equipment_number from equipment_lab where equipment_rfid =#{rfid}")
    Integer getNumByRfid(@Param("rfid") Integer rfid);

    @Select("select * from equipment_lab where equipment_rfid = #{rfid}")
    equipment_lab getEquipByRfid(@Param("rfid") Integer rfid);
}

