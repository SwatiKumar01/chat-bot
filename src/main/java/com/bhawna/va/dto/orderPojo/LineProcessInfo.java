
package com.bhawna.va.dto.orderPojo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Actions",
    "BatchRequirementType",
    "CreatedBy",
    "CreatedTimestamp",
    "CriticalDimension1",
    "CriticalDimension2",
    "CriticalDimension3",
    "CubeMultipleQty",
    "DeliveryReferenceNumber",
    "ExportInfoCode",
    "Extended",
    "IsSerialNumberRequired",
    "ItemBreakAttribute",
    "ItemPrice",
    "LPNBreakAttribute",
    "OrgId",
    "PK",
    "PickLocAssignmentType",
    "PickTicketControlNumber",
    "PickUpReferenceNumber",
    "Price",
    "PriceTicketType",
    "SingleUnit",
    "Translations",
    "UnitVolume",
    "UnitWeight",
    "UpdatedBy",
    "UpdatedTimestamp",
    "VASProcessType",
    "WaveProcessType",
    "entityName",
    "messages"
})
public class LineProcessInfo implements Serializable
{

    @JsonProperty("Actions")
    private Actions_______ actions;
    @JsonProperty("BatchRequirementType")
    private String batchRequirementType;
    @JsonProperty("CreatedBy")
    private String createdBy;
    @JsonProperty("CreatedTimestamp")
    private String createdTimestamp;
    @JsonProperty("CriticalDimension1")
    private Integer criticalDimension1;
    @JsonProperty("CriticalDimension2")
    private Integer criticalDimension2;
    @JsonProperty("CriticalDimension3")
    private Integer criticalDimension3;
    @JsonProperty("CubeMultipleQty")
    private Integer cubeMultipleQty;
    @JsonProperty("DeliveryReferenceNumber")
    private String deliveryReferenceNumber;
    @JsonProperty("ExportInfoCode")
    private String exportInfoCode;
    @JsonProperty("Extended")
    private Extended_______ extended;
    @JsonProperty("IsSerialNumberRequired")
    private Boolean isSerialNumberRequired;
    @JsonProperty("ItemBreakAttribute")
    private String itemBreakAttribute;
    @JsonProperty("ItemPrice")
    private Integer itemPrice;
    @JsonProperty("LPNBreakAttribute")
    private String lPNBreakAttribute;
    @JsonProperty("OrgId")
    private String orgId;
    @JsonProperty("PK")
    private String pK;
    @JsonProperty("PickLocAssignmentType")
    private String pickLocAssignmentType;
    @JsonProperty("PickTicketControlNumber")
    private String pickTicketControlNumber;
    @JsonProperty("PickUpReferenceNumber")
    private String pickUpReferenceNumber;
    @JsonProperty("Price")
    private Integer price;
    @JsonProperty("PriceTicketType")
    private String priceTicketType;
    @JsonProperty("SingleUnit")
    private Boolean singleUnit;
    @JsonProperty("Translations")
    private Translations_____ translations;
    @JsonProperty("UnitVolume")
    private Integer unitVolume;
    @JsonProperty("UnitWeight")
    private Integer unitWeight;
    @JsonProperty("UpdatedBy")
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp")
    private String updatedTimestamp;
    @JsonProperty("VASProcessType")
    private String vASProcessType;
    @JsonProperty("WaveProcessType")
    private String waveProcessType;
    @JsonProperty("entityName")
    private String entityName;
    @JsonProperty("messages")
    private Messages____ messages;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -2790164502755835745L;

    @JsonProperty("Actions")
    public Actions_______ getActions() {
        return actions;
    }

    @JsonProperty("Actions")
    public void setActions(Actions_______ actions) {
        this.actions = actions;
    }

    @JsonProperty("BatchRequirementType")
    public String getBatchRequirementType() {
        return batchRequirementType;
    }

    @JsonProperty("BatchRequirementType")
    public void setBatchRequirementType(String batchRequirementType) {
        this.batchRequirementType = batchRequirementType;
    }

    @JsonProperty("CreatedBy")
    public String getCreatedBy() {
        return createdBy;
    }

    @JsonProperty("CreatedBy")
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @JsonProperty("CreatedTimestamp")
    public String getCreatedTimestamp() {
        return createdTimestamp;
    }

    @JsonProperty("CreatedTimestamp")
    public void setCreatedTimestamp(String createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    @JsonProperty("CriticalDimension1")
    public Integer getCriticalDimension1() {
        return criticalDimension1;
    }

    @JsonProperty("CriticalDimension1")
    public void setCriticalDimension1(Integer criticalDimension1) {
        this.criticalDimension1 = criticalDimension1;
    }

    @JsonProperty("CriticalDimension2")
    public Integer getCriticalDimension2() {
        return criticalDimension2;
    }

    @JsonProperty("CriticalDimension2")
    public void setCriticalDimension2(Integer criticalDimension2) {
        this.criticalDimension2 = criticalDimension2;
    }

    @JsonProperty("CriticalDimension3")
    public Integer getCriticalDimension3() {
        return criticalDimension3;
    }

    @JsonProperty("CriticalDimension3")
    public void setCriticalDimension3(Integer criticalDimension3) {
        this.criticalDimension3 = criticalDimension3;
    }

    @JsonProperty("CubeMultipleQty")
    public Integer getCubeMultipleQty() {
        return cubeMultipleQty;
    }

    @JsonProperty("CubeMultipleQty")
    public void setCubeMultipleQty(Integer cubeMultipleQty) {
        this.cubeMultipleQty = cubeMultipleQty;
    }

    @JsonProperty("DeliveryReferenceNumber")
    public String getDeliveryReferenceNumber() {
        return deliveryReferenceNumber;
    }

    @JsonProperty("DeliveryReferenceNumber")
    public void setDeliveryReferenceNumber(String deliveryReferenceNumber) {
        this.deliveryReferenceNumber = deliveryReferenceNumber;
    }

    @JsonProperty("ExportInfoCode")
    public String getExportInfoCode() {
        return exportInfoCode;
    }

    @JsonProperty("ExportInfoCode")
    public void setExportInfoCode(String exportInfoCode) {
        this.exportInfoCode = exportInfoCode;
    }

    @JsonProperty("Extended")
    public Extended_______ getExtended() {
        return extended;
    }

    @JsonProperty("Extended")
    public void setExtended(Extended_______ extended) {
        this.extended = extended;
    }

    @JsonProperty("IsSerialNumberRequired")
    public Boolean getIsSerialNumberRequired() {
        return isSerialNumberRequired;
    }

    @JsonProperty("IsSerialNumberRequired")
    public void setIsSerialNumberRequired(Boolean isSerialNumberRequired) {
        this.isSerialNumberRequired = isSerialNumberRequired;
    }

    @JsonProperty("ItemBreakAttribute")
    public String getItemBreakAttribute() {
        return itemBreakAttribute;
    }

    @JsonProperty("ItemBreakAttribute")
    public void setItemBreakAttribute(String itemBreakAttribute) {
        this.itemBreakAttribute = itemBreakAttribute;
    }

    @JsonProperty("ItemPrice")
    public Integer getItemPrice() {
        return itemPrice;
    }

    @JsonProperty("ItemPrice")
    public void setItemPrice(Integer itemPrice) {
        this.itemPrice = itemPrice;
    }

    @JsonProperty("LPNBreakAttribute")
    public String getLPNBreakAttribute() {
        return lPNBreakAttribute;
    }

    @JsonProperty("LPNBreakAttribute")
    public void setLPNBreakAttribute(String lPNBreakAttribute) {
        this.lPNBreakAttribute = lPNBreakAttribute;
    }

    @JsonProperty("OrgId")
    public String getOrgId() {
        return orgId;
    }

    @JsonProperty("OrgId")
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    @JsonProperty("PK")
    public String getPK() {
        return pK;
    }

    @JsonProperty("PK")
    public void setPK(String pK) {
        this.pK = pK;
    }

    @JsonProperty("PickLocAssignmentType")
    public String getPickLocAssignmentType() {
        return pickLocAssignmentType;
    }

    @JsonProperty("PickLocAssignmentType")
    public void setPickLocAssignmentType(String pickLocAssignmentType) {
        this.pickLocAssignmentType = pickLocAssignmentType;
    }

    @JsonProperty("PickTicketControlNumber")
    public String getPickTicketControlNumber() {
        return pickTicketControlNumber;
    }

    @JsonProperty("PickTicketControlNumber")
    public void setPickTicketControlNumber(String pickTicketControlNumber) {
        this.pickTicketControlNumber = pickTicketControlNumber;
    }

    @JsonProperty("PickUpReferenceNumber")
    public String getPickUpReferenceNumber() {
        return pickUpReferenceNumber;
    }

    @JsonProperty("PickUpReferenceNumber")
    public void setPickUpReferenceNumber(String pickUpReferenceNumber) {
        this.pickUpReferenceNumber = pickUpReferenceNumber;
    }

    @JsonProperty("Price")
    public Integer getPrice() {
        return price;
    }

    @JsonProperty("Price")
    public void setPrice(Integer price) {
        this.price = price;
    }

    @JsonProperty("PriceTicketType")
    public String getPriceTicketType() {
        return priceTicketType;
    }

    @JsonProperty("PriceTicketType")
    public void setPriceTicketType(String priceTicketType) {
        this.priceTicketType = priceTicketType;
    }

    @JsonProperty("SingleUnit")
    public Boolean getSingleUnit() {
        return singleUnit;
    }

    @JsonProperty("SingleUnit")
    public void setSingleUnit(Boolean singleUnit) {
        this.singleUnit = singleUnit;
    }

    @JsonProperty("Translations")
    public Translations_____ getTranslations() {
        return translations;
    }

    @JsonProperty("Translations")
    public void setTranslations(Translations_____ translations) {
        this.translations = translations;
    }

    @JsonProperty("UnitVolume")
    public Integer getUnitVolume() {
        return unitVolume;
    }

    @JsonProperty("UnitVolume")
    public void setUnitVolume(Integer unitVolume) {
        this.unitVolume = unitVolume;
    }

    @JsonProperty("UnitWeight")
    public Integer getUnitWeight() {
        return unitWeight;
    }

    @JsonProperty("UnitWeight")
    public void setUnitWeight(Integer unitWeight) {
        this.unitWeight = unitWeight;
    }

    @JsonProperty("UpdatedBy")
    public String getUpdatedBy() {
        return updatedBy;
    }

    @JsonProperty("UpdatedBy")
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @JsonProperty("UpdatedTimestamp")
    public String getUpdatedTimestamp() {
        return updatedTimestamp;
    }

    @JsonProperty("UpdatedTimestamp")
    public void setUpdatedTimestamp(String updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }

    @JsonProperty("VASProcessType")
    public String getVASProcessType() {
        return vASProcessType;
    }

    @JsonProperty("VASProcessType")
    public void setVASProcessType(String vASProcessType) {
        this.vASProcessType = vASProcessType;
    }

    @JsonProperty("WaveProcessType")
    public String getWaveProcessType() {
        return waveProcessType;
    }

    @JsonProperty("WaveProcessType")
    public void setWaveProcessType(String waveProcessType) {
        this.waveProcessType = waveProcessType;
    }

    @JsonProperty("entityName")
    public String getEntityName() {
        return entityName;
    }

    @JsonProperty("entityName")
    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    @JsonProperty("messages")
    public Messages____ getMessages() {
        return messages;
    }

    @JsonProperty("messages")
    public void setMessages(Messages____ messages) {
        this.messages = messages;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
