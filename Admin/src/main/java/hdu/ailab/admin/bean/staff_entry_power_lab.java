package hdu.ailab.admin.bean;

import java.util.Date;

public class staff_entry_power_lab {
    private Integer staffId;

    private Integer labId;

    private String entryPowerName;

    private String entryPowerPhone;

    private String entryPowerUserFace;

    private String entryPowerFingerPrint;

    private Date entryPowerTime;

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public Integer getLabId() {
        return labId;
    }

    public void setLabId(Integer labId) {
        this.labId = labId;
    }

    public String getEntryPowerName() {
        return entryPowerName;
    }

    public void setEntryPowerName(String entryPowerName) {
        this.entryPowerName = entryPowerName == null ? null : entryPowerName.trim();
    }

    public String getEntryPowerPhone() {
        return entryPowerPhone;
    }

    public void setEntryPowerPhone(String entryPowerPhone) {
        this.entryPowerPhone = entryPowerPhone == null ? null : entryPowerPhone.trim();
    }

    public String getEntryPowerUserFace() {
        return entryPowerUserFace;
    }

    public void setEntryPowerUserFace(String entryPowerUserFace) {
        this.entryPowerUserFace = entryPowerUserFace == null ? null : entryPowerUserFace.trim();
    }

    public String getEntryPowerFingerPrint() {
        return entryPowerFingerPrint;
    }

    public void setEntryPowerFingerPrint(String entryPowerFingerPrint) {
        this.entryPowerFingerPrint = entryPowerFingerPrint == null ? null : entryPowerFingerPrint.trim();
    }

    public Date getEntryPowerTime() {
        return entryPowerTime;
    }

    public void setEntryPowerTime(Date entryPowerTime) {
        this.entryPowerTime = entryPowerTime;
    }
}