package hdu.ailab.admin.bean;

import java.util.Date;

public class staff_use_equipment {
    private Integer equipmentId;

    private Integer uuid;

    private Integer equipmentNumber;

    private Integer staffId;

    private Date useBoorrowTime;

    private Date useWillReturnTime;

    private Integer useRealReturnTime;

    public Integer getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(Integer equipmentId) {
        this.equipmentId = equipmentId;
    }

    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    public Integer getEquipmentNumber() {
        return equipmentNumber;
    }

    public void setEquipmentNumber(Integer equipmentNumber) {
        this.equipmentNumber = equipmentNumber;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
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

    public Integer getUseRealReturnTime() {
        return useRealReturnTime;
    }

    public void setUseRealReturnTime(Integer useRealReturnTime) {
        this.useRealReturnTime = useRealReturnTime;
    }
}