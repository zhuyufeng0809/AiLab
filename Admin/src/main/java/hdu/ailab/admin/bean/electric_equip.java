package hdu.ailab.admin.bean;

import java.util.Date;

public class electric_equip {
    private Integer electricId;

    private String electricName;

    private Integer electricMode;

    private Date electricTime;

    private String electricPort;

    private Integer electricType;

    private String electricBrand;

    private String electricVersion;

    private String electricInfo;

    public Integer getElectricId() {
        return electricId;
    }

    public void setElectricId(Integer electricId) {
        this.electricId = electricId;
    }

    public String getElectricName() {
        return electricName;
    }

    public void setElectricName(String electricName) {
        this.electricName = electricName == null ? null : electricName.trim();
    }

    public Integer getElectricMode() {
        return electricMode;
    }

    public void setElectricMode(Integer electricMode) {
        this.electricMode = electricMode;
    }

    public Date getElectricTime() {
        return electricTime;
    }

    public void setElectricTime(Date electricTime) {
        this.electricTime = electricTime;
    }

    public String getElectricPort() {
        return electricPort;
    }

    public void setElectricPort(String electricPort) {
        this.electricPort = electricPort == null ? null : electricPort.trim();
    }

    public Integer getElectricType() {
        return electricType;
    }

    public void setElectricType(Integer electricType) {
        this.electricType = electricType;
    }

    public String getElectricBrand() {
        return electricBrand;
    }

    public void setElectricBrand(String electricBrand) {
        this.electricBrand = electricBrand == null ? null : electricBrand.trim();
    }

    public String getElectricVersion() {
        return electricVersion;
    }

    public void setElectricVersion(String electricVersion) {
        this.electricVersion = electricVersion == null ? null : electricVersion.trim();
    }

    public String getElectricInfo() {
        return electricInfo;
    }

    public void setElectricInfo(String electricInfo) {
        this.electricInfo = electricInfo == null ? null : electricInfo.trim();
    }
}