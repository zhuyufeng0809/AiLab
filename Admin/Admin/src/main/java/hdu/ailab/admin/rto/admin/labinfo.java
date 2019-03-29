package hdu.ailab.admin.rto.admin;

public class labinfo {
    private String labName;
    private String labLocation;
    private Integer labNumber;
    private String labType;
    private String labInfo;
    private String labMac;

    public boolean isLabAdmin() {
        return labAdmin;
    }

    public void setLabAdmin(boolean labAdmin) {
        this.labAdmin = labAdmin;
    }

    private boolean labAdmin;

    public String getLabName() {
        return labName;
    }

    public void setLabName(String labName) {
        this.labName = labName;
    }

    public String getLabLocation() {
        return labLocation;
    }

    public void setLabLocation(String labLocation) {
        this.labLocation = labLocation;
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
        this.labType = labType;
    }

    public String getLabInfo() {
        return labInfo;
    }

    public void setLabInfo(String labInfo) {
        this.labInfo = labInfo;
    }

    public String getLabMac() {
        return labMac;
    }

    public void setLabMac(String labMac) {
        this.labMac = labMac;
    }
}
