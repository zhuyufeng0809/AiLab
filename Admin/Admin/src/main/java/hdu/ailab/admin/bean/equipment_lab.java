package hdu.ailab.admin.bean;

import java.util.Date;

public class equipment_lab {
    private Integer equipmentId;

    private Integer labId;

    private Integer equipmentNumber;

    private String equipmentState;

    private Date equipmentPurchaseDate;

    private Date equipmentEntryAccountDate;

    private Integer equipmentServiceLife;

    private Integer equipmentUsedLife;

    private String equipmentPresentSituation;

    private String equipmentUseDirection;

    private String equipmentUsePeople;

    private String equipmentUseUnit;

    private String equipmentLocation;

    private String equipmentFundingSource;

    private String equipmentSource;

    private Date equipmentTransferDate;

    private String equipmentSubject;

    private String equipmentSubjectType;

    private Integer equipmentFileNumber;

    private Integer equipmentRfid;

    public Integer getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(Integer equipmentId) {
        this.equipmentId = equipmentId;
    }

    public Integer getLabId() {
        return labId;
    }

    public void setLabId(Integer labId) {
        this.labId = labId;
    }

    public Integer getEquipmentNumber() {
        return equipmentNumber;
    }

    public void setEquipmentNumber(Integer equipmentNumber) {
        this.equipmentNumber = equipmentNumber;
    }

    public String getEquipmentState() {
        return equipmentState;
    }

    public void setEquipmentState(String equipmentState) {
        this.equipmentState = equipmentState == null ? null : equipmentState.trim();
    }

    public Date getEquipmentPurchaseDate() {
        return equipmentPurchaseDate;
    }

    public void setEquipmentPurchaseDate(Date equipmentPurchaseDate) {
        this.equipmentPurchaseDate = equipmentPurchaseDate;
    }

    public Date getEquipmentEntryAccountDate() {
        return equipmentEntryAccountDate;
    }

    public void setEquipmentEntryAccountDate(Date equipmentEntryAccountDate) {
        this.equipmentEntryAccountDate = equipmentEntryAccountDate;
    }

    public Integer getEquipmentServiceLife() {
        return equipmentServiceLife;
    }

    public void setEquipmentServiceLife(Integer equipmentServiceLife) {
        this.equipmentServiceLife = equipmentServiceLife;
    }

    public Integer getEquipmentUsedLife() {
        return equipmentUsedLife;
    }

    public void setEquipmentUsedLife(Integer equipmentUsedLife) {
        this.equipmentUsedLife = equipmentUsedLife;
    }

    public String getEquipmentPresentSituation() {
        return equipmentPresentSituation;
    }

    public void setEquipmentPresentSituation(String equipmentPresentSituation) {
        this.equipmentPresentSituation = equipmentPresentSituation == null ? null : equipmentPresentSituation.trim();
    }

    public String getEquipmentUseDirection() {
        return equipmentUseDirection;
    }

    public void setEquipmentUseDirection(String equipmentUseDirection) {
        this.equipmentUseDirection = equipmentUseDirection == null ? null : equipmentUseDirection.trim();
    }

    public String getEquipmentUsePeople() {
        return equipmentUsePeople;
    }

    public void setEquipmentUsePeople(String equipmentUsePeople) {
        this.equipmentUsePeople = equipmentUsePeople == null ? null : equipmentUsePeople.trim();
    }

    public String getEquipmentUseUnit() {
        return equipmentUseUnit;
    }

    public void setEquipmentUseUnit(String equipmentUseUnit) {
        this.equipmentUseUnit = equipmentUseUnit == null ? null : equipmentUseUnit.trim();
    }

    public String getEquipmentLocation() {
        return equipmentLocation;
    }

    public void setEquipmentLocation(String equipmentLocation) {
        this.equipmentLocation = equipmentLocation == null ? null : equipmentLocation.trim();
    }

    public String getEquipmentFundingSource() {
        return equipmentFundingSource;
    }

    public void setEquipmentFundingSource(String equipmentFundingSource) {
        this.equipmentFundingSource = equipmentFundingSource == null ? null : equipmentFundingSource.trim();
    }

    public String getEquipmentSource() {
        return equipmentSource;
    }

    public void setEquipmentSource(String equipmentSource) {
        this.equipmentSource = equipmentSource == null ? null : equipmentSource.trim();
    }

    public Date getEquipmentTransferDate() {
        return equipmentTransferDate;
    }

    public void setEquipmentTransferDate(Date equipmentTransferDate) {
        this.equipmentTransferDate = equipmentTransferDate;
    }

    public String getEquipmentSubject() {
        return equipmentSubject;
    }

    public void setEquipmentSubject(String equipmentSubject) {
        this.equipmentSubject = equipmentSubject == null ? null : equipmentSubject.trim();
    }

    public String getEquipmentSubjectType() {
        return equipmentSubjectType;
    }

    public void setEquipmentSubjectType(String equipmentSubjectType) {
        this.equipmentSubjectType = equipmentSubjectType == null ? null : equipmentSubjectType.trim();
    }

    public Integer getEquipmentFileNumber() {
        return equipmentFileNumber;
    }

    public void setEquipmentFileNumber(Integer equipmentFileNumber) {
        this.equipmentFileNumber = equipmentFileNumber;
    }

    public Integer getEquipmentRfid() {
        return equipmentRfid;
    }

    public void setEquipmentRfid(Integer equipmentRfid) {
        this.equipmentRfid = equipmentRfid;
    }
}