package hdu.ailab.admin.bean;

public class equipment {
    private Integer equipmentId;

    private String equipmentName;

    private Integer equipmentTypeNum;

    private String equipmentType;

    private Integer equipmentPrice;

    private Integer equipmentTotalPrice;

    private String equipmentUnit;

    private Integer equipmentModel;

    private String equipmentSpecification;

    private String equipmentManufacturer;

    private String equipmentCentralizedAuditOpinion;

    private String equipmentBookkeepingType;

    public Integer getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(Integer equipmentId) {
        this.equipmentId = equipmentId;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName == null ? null : equipmentName.trim();
    }

    public Integer getEquipmentTypeNum() {
        return equipmentTypeNum;
    }

    public void setEquipmentTypeNum(Integer equipmentTypeNum) {
        this.equipmentTypeNum = equipmentTypeNum;
    }

    public String getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(String equipmentType) {
        this.equipmentType = equipmentType == null ? null : equipmentType.trim();
    }

    public Integer getEquipmentPrice() {
        return equipmentPrice;
    }

    public void setEquipmentPrice(Integer equipmentPrice) {
        this.equipmentPrice = equipmentPrice;
    }

    public Integer getEquipmentTotalPrice() {
        return equipmentTotalPrice;
    }

    public void setEquipmentTotalPrice(Integer equipmentTotalPrice) {
        this.equipmentTotalPrice = equipmentTotalPrice;
    }

    public String getEquipmentUnit() {
        return equipmentUnit;
    }

    public void setEquipmentUnit(String equipmentUnit) {
        this.equipmentUnit = equipmentUnit == null ? null : equipmentUnit.trim();
    }

    public Integer getEquipmentModel() {
        return equipmentModel;
    }

    public void setEquipmentModel(Integer equipmentModel) {
        this.equipmentModel = equipmentModel;
    }

    public String getEquipmentSpecification() {
        return equipmentSpecification;
    }

    public void setEquipmentSpecification(String equipmentSpecification) {
        this.equipmentSpecification = equipmentSpecification == null ? null : equipmentSpecification.trim();
    }

    public String getEquipmentManufacturer() {
        return equipmentManufacturer;
    }

    public void setEquipmentManufacturer(String equipmentManufacturer) {
        this.equipmentManufacturer = equipmentManufacturer == null ? null : equipmentManufacturer.trim();
    }

    public String getEquipmentCentralizedAuditOpinion() {
        return equipmentCentralizedAuditOpinion;
    }

    public void setEquipmentCentralizedAuditOpinion(String equipmentCentralizedAuditOpinion) {
        this.equipmentCentralizedAuditOpinion = equipmentCentralizedAuditOpinion == null ? null : equipmentCentralizedAuditOpinion.trim();
    }

    public String getEquipmentBookkeepingType() {
        return equipmentBookkeepingType;
    }

    public void setEquipmentBookkeepingType(String equipmentBookkeepingType) {
        this.equipmentBookkeepingType = equipmentBookkeepingType == null ? null : equipmentBookkeepingType.trim();
    }
}