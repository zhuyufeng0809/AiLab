package hdu.ailab.admin.bean;

public class lab {
    private Integer labId;

    private String labName;

    private String labBuilding;

    private String labFloor;

    private String labRoom;

    private Integer labNumber;

    private String labType;

    private String labInfo;

    private String labMac;

    public Integer getLabId() {
        return labId;
    }

    public void setLabId(Integer labId) {
        this.labId = labId;
    }

    public String getLabName() {
        return labName;
    }

    public void setLabName(String labName) {
        this.labName = labName == null ? null : labName.trim();
    }

    public String getLabBuilding() {
        return labBuilding;
    }

    public void setLabBuilding(String labBuilding) {
        this.labBuilding = labBuilding == null ? null : labBuilding.trim();
    }

    public String getLabFloor() {
        return labFloor;
    }

    public void setLabFloor(String labFloor) {
        this.labFloor = labFloor == null ? null : labFloor.trim();
    }

    public String getLabRoom() {
        return labRoom;
    }

    public void setLabRoom(String labRoom) {
        this.labRoom = labRoom == null ? null : labRoom.trim();
    }

    public Integer getLabNumber() {
        return labNumber;
    }

    public void setLabNumber(Integer labNumber) {
        this.labNumber = labNumber;
    }

    public String getLabType() {
        return labType;
    }

    public void setLabType(String labType) {
        this.labType = labType == null ? null : labType.trim();
    }

    public String getLabInfo() {
        return labInfo;
    }

    public void setLabInfo(String labInfo) {
        this.labInfo = labInfo == null ? null : labInfo.trim();
    }

    public String getLabMac() {
        return labMac;
    }

    public void setLabMac(String labMac) {
        this.labMac = labMac == null ? null : labMac.trim();
    }
}