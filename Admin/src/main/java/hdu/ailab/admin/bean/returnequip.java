package hdu.ailab.admin.bean;

import java.util.Date;

public class returnequip {

    private String equipmentName;
    private Integer equipmentNumber;
    private Integer equipmentRfid;
    private Integer staffId;
    private String staffName;
    private String staffPhone;
    private Date useBoorrowTime;
    private Date useWillReturnTime;
    private Date useRealReturnTime;

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public Integer getEquipmentNumber() {
        return equipmentNumber;
    }

    public void setEquipmentNumber(Integer equipmentNumber) {
        this.equipmentNumber = equipmentNumber;
    }

    public Integer getEquipmentRfid() {
        return equipmentRfid;
    }

    public void setEquipmentRfid(Integer equipmentRfid) {
        this.equipmentRfid = equipmentRfid;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffPhone() {
        return staffPhone;
    }

    public void setStaffPhone(String staffPhone) {
        this.staffPhone = staffPhone;
    }

    public Date getUseBoorrowTime() {
        return useBoorrowTime;
    }

    public void setUseBoorrowTime(Date useBoorrowTime) {
        this.useBoorrowTime = useBoorrowTime;
    }

    public Date getUseWillReturnTime() {
        return useWillReturnTime;
    }

    public void setUseWillReturnTime(Date useWillReturnTime) {
        this.useWillReturnTime = useWillReturnTime;
    }

    public Date getUseRealReturnTime() {
        return useRealReturnTime;
    }

    public void setUseRealReturnTime(Date useRealReturnTime) {
        this.useRealReturnTime = useRealReturnTime;
    }
}
