
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
    "AsnDetailId",
    "AsnId",
    "BatchNumber",
    "ConsolidatationLocationId",
    "CountryOfOrigin",
    "CreatedBy",
    "CreatedTimestamp",
    "Extended",
    "InventorySegmentId",
    "InventoryTypeId",
    "IsForceAllocate",
    "ItemAttribute1",
    "ItemAttribute2",
    "ItemAttribute3",
    "ItemAttribute4",
    "ItemAttribute5",
    "OrgId",
    "PK",
    "PoDetailId",
    "PoId",
    "ProductStatusId",
    "ReqCapacityPerUnit",
    "ShipFromLocationId",
    "ShipThroughLocationId",
    "Translations",
    "UpdatedBy",
    "UpdatedTimestamp",
    "entityName",
    "messages"
})
public class OrderLinePromisingInfo implements Serializable
{

    @JsonProperty("Actions")
    private Actions__________________ actions;
    @JsonProperty("AsnDetailId")
    private String asnDetailId;
    @JsonProperty("AsnId")
    private String asnId;
    @JsonProperty("BatchNumber")
    private String batchNumber;
    @JsonProperty("ConsolidatationLocationId")
    private String consolidatationLocationId;
    @JsonProperty("CountryOfOrigin")
    private String countryOfOrigin;
    @JsonProperty("CreatedBy")
    private String createdBy;
    @JsonProperty("CreatedTimestamp")
    private String createdTimestamp;
    @JsonProperty("Extended")
    private Extended__________________ extended;
    @JsonProperty("InventorySegmentId")
    private String inventorySegmentId;
    @JsonProperty("InventoryTypeId")
    private String inventoryTypeId;
    @JsonProperty("IsForceAllocate")
    private Boolean isForceAllocate;
    @JsonProperty("ItemAttribute1")
    private String itemAttribute1;
    @JsonProperty("ItemAttribute2")
    private String itemAttribute2;
    @JsonProperty("ItemAttribute3")
    private String itemAttribute3;
    @JsonProperty("ItemAttribute4")
    private String itemAttribute4;
    @JsonProperty("ItemAttribute5")
    private String itemAttribute5;
    @JsonProperty("OrgId")
    private String orgId;
    @JsonProperty("PK")
    private String pK;
    @JsonProperty("PoDetailId")
    private String poDetailId;
    @JsonProperty("PoId")
    private String poId;
    @JsonProperty("ProductStatusId")
    private String productStatusId;
    @JsonProperty("ReqCapacityPerUnit")
    private Integer reqCapacityPerUnit;
    @JsonProperty("ShipFromLocationId")
    private String shipFromLocationId;
    @JsonProperty("ShipThroughLocationId")
    private String shipThroughLocationId;
    @JsonProperty("Translations")
    private Translations________________ translations;
    @JsonProperty("UpdatedBy")
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp")
    private String updatedTimestamp;
    @JsonProperty("entityName")
    private String entityName;
    @JsonProperty("messages")
    private Messages_______________ messages;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 2415716074898043874L;

    @JsonProperty("Actions")
    public Actions__________________ getActions() {
        return actions;
    }

    @JsonProperty("Actions")
    public void setActions(Actions__________________ actions) {
        this.actions = actions;
    }

    @JsonProperty("AsnDetailId")
    public String getAsnDetailId() {
        return asnDetailId;
    }

    @JsonProperty("AsnDetailId")
    public void setAsnDetailId(String asnDetailId) {
        this.asnDetailId = asnDetailId;
    }

    @JsonProperty("AsnId")
    public String getAsnId() {
        return asnId;
    }

    @JsonProperty("AsnId")
    public void setAsnId(String asnId) {
        this.asnId = asnId;
    }

    @JsonProperty("BatchNumber")
    public String getBatchNumber() {
        return batchNumber;
    }

    @JsonProperty("BatchNumber")
    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    @JsonProperty("ConsolidatationLocationId")
    public String getConsolidatationLocationId() {
        return consolidatationLocationId;
    }

    @JsonProperty("ConsolidatationLocationId")
    public void setConsolidatationLocationId(String consolidatationLocationId) {
        this.consolidatationLocationId = consolidatationLocationId;
    }

    @JsonProperty("CountryOfOrigin")
    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    @JsonProperty("CountryOfOrigin")
    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
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

    @JsonProperty("Extended")
    public Extended__________________ getExtended() {
        return extended;
    }

    @JsonProperty("Extended")
    public void setExtended(Extended__________________ extended) {
        this.extended = extended;
    }

    @JsonProperty("InventorySegmentId")
    public String getInventorySegmentId() {
        return inventorySegmentId;
    }

    @JsonProperty("InventorySegmentId")
    public void setInventorySegmentId(String inventorySegmentId) {
        this.inventorySegmentId = inventorySegmentId;
    }

    @JsonProperty("InventoryTypeId")
    public String getInventoryTypeId() {
        return inventoryTypeId;
    }

    @JsonProperty("InventoryTypeId")
    public void setInventoryTypeId(String inventoryTypeId) {
        this.inventoryTypeId = inventoryTypeId;
    }

    @JsonProperty("IsForceAllocate")
    public Boolean getIsForceAllocate() {
        return isForceAllocate;
    }

    @JsonProperty("IsForceAllocate")
    public void setIsForceAllocate(Boolean isForceAllocate) {
        this.isForceAllocate = isForceAllocate;
    }

    @JsonProperty("ItemAttribute1")
    public String getItemAttribute1() {
        return itemAttribute1;
    }

    @JsonProperty("ItemAttribute1")
    public void setItemAttribute1(String itemAttribute1) {
        this.itemAttribute1 = itemAttribute1;
    }

    @JsonProperty("ItemAttribute2")
    public String getItemAttribute2() {
        return itemAttribute2;
    }

    @JsonProperty("ItemAttribute2")
    public void setItemAttribute2(String itemAttribute2) {
        this.itemAttribute2 = itemAttribute2;
    }

    @JsonProperty("ItemAttribute3")
    public String getItemAttribute3() {
        return itemAttribute3;
    }

    @JsonProperty("ItemAttribute3")
    public void setItemAttribute3(String itemAttribute3) {
        this.itemAttribute3 = itemAttribute3;
    }

    @JsonProperty("ItemAttribute4")
    public String getItemAttribute4() {
        return itemAttribute4;
    }

    @JsonProperty("ItemAttribute4")
    public void setItemAttribute4(String itemAttribute4) {
        this.itemAttribute4 = itemAttribute4;
    }

    @JsonProperty("ItemAttribute5")
    public String getItemAttribute5() {
        return itemAttribute5;
    }

    @JsonProperty("ItemAttribute5")
    public void setItemAttribute5(String itemAttribute5) {
        this.itemAttribute5 = itemAttribute5;
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

    @JsonProperty("PoDetailId")
    public String getPoDetailId() {
        return poDetailId;
    }

    @JsonProperty("PoDetailId")
    public void setPoDetailId(String poDetailId) {
        this.poDetailId = poDetailId;
    }

    @JsonProperty("PoId")
    public String getPoId() {
        return poId;
    }

    @JsonProperty("PoId")
    public void setPoId(String poId) {
        this.poId = poId;
    }

    @JsonProperty("ProductStatusId")
    public String getProductStatusId() {
        return productStatusId;
    }

    @JsonProperty("ProductStatusId")
    public void setProductStatusId(String productStatusId) {
        this.productStatusId = productStatusId;
    }

    @JsonProperty("ReqCapacityPerUnit")
    public Integer getReqCapacityPerUnit() {
        return reqCapacityPerUnit;
    }

    @JsonProperty("ReqCapacityPerUnit")
    public void setReqCapacityPerUnit(Integer reqCapacityPerUnit) {
        this.reqCapacityPerUnit = reqCapacityPerUnit;
    }

    @JsonProperty("ShipFromLocationId")
    public String getShipFromLocationId() {
        return shipFromLocationId;
    }

    @JsonProperty("ShipFromLocationId")
    public void setShipFromLocationId(String shipFromLocationId) {
        this.shipFromLocationId = shipFromLocationId;
    }

    @JsonProperty("ShipThroughLocationId")
    public String getShipThroughLocationId() {
        return shipThroughLocationId;
    }

    @JsonProperty("ShipThroughLocationId")
    public void setShipThroughLocationId(String shipThroughLocationId) {
        this.shipThroughLocationId = shipThroughLocationId;
    }

    @JsonProperty("Translations")
    public Translations________________ getTranslations() {
        return translations;
    }

    @JsonProperty("Translations")
    public void setTranslations(Translations________________ translations) {
        this.translations = translations;
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

    @JsonProperty("entityName")
    public String getEntityName() {
        return entityName;
    }

    @JsonProperty("entityName")
    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    @JsonProperty("messages")
    public Messages_______________ getMessages() {
        return messages;
    }

    @JsonProperty("messages")
    public void setMessages(Messages_______________ messages) {
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
