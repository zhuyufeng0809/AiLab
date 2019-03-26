package hdu.ailab.admin.bean;

public class staff {
    private Integer uuid;

    private Integer staffId;

    private String staffName;

    private String staffPassword;

    private String staffState;

    private Integer staffType;

    private String staffEmail;

    private String staffPhone;

    private String staffFacePictureDir;

    private byte[] staffFaceFeature;

    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
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
        this.staffName = staffName == null ? null : staffName.trim();
    }

    public String getStaffPassword() {
        return staffPassword;
    }

    public void setStaffPassword(String staffPassword) {
        this.staffPassword = staffPassword == null ? null : staffPassword.trim();
    }

    public String getStaffState() {
        return staffState;
    }

    public void setStaffState(String staffState) {
        this.staffState = staffState == null ? null : staffState.trim();
    }

    public Integer getStaffType() {
        return staffType;
    }

    public void setStaffType(Integer staffType) {
        this.staffType = staffType;
    }

    public String getStaffEmail() {
        return staffEmail;
    }

    public void setStaffEmail(String staffEmail) {
        this.staffEmail = staffEmail == null ? null : staffEmail.trim();
    }

    public String getStaffPhone() {
        return staffPhone;
    }

    public void setStaffPhone(String staffPhone) {
        this.staffPhone = staffPhone == null ? null : staffPhone.trim();
    }

    public String getStaffFacePictureDir() {
        return staffFacePictureDir;
    }

    public void setStaffFacePictureDir(String staffFacePictureDir) {
        this.staffFacePictureDir = staffFacePictureDir == null ? null : staffFacePictureDir.trim();
    }

    public byte[] getStaffFaceFeature() {
        return staffFaceFeature;
    }

    public void setStaffFaceFeature(byte[] staffFaceFeature) {
        this.staffFaceFeature = staffFaceFeature;
    }
}