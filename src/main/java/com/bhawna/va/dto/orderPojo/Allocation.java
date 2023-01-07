
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
    "AllocatedOn",
    "AllocationDependencyId",
    "AllocationId",
    "AllocationType",
    "AsnDetailId",
    "AsnId",
    "BatchNumber",
    "CalculatedValues",
    "CarrierCode",
    "CommittedDeliveryDate",
    "CommittedShipDate",
    "CountryOfOrigin",
    "CreatedBy",
    "CreatedTimestamp",
    "EarliestDeliveryDate",
    "EarliestShipDate",
    "Extended",
    "GroupId",
    "InventoryAttribute1",
    "InventoryAttribute2",
    "InventoryAttribute3",
    "InventoryAttribute4",
    "InventoryAttribute5",
    "InventorySegmentId",
    "InventoryTypeId",
    "IsVirtual",
    "ItemId",
    "LatestReleaseDate",
    "LatestShipDate",
    "OrgId",
    "PK",
    "PoDetailId",
    "PoId",
    "ProductStatusId",
    "Quantity",
    "ReservationRequestDetailId",
    "ReservationRequestId",
    "ServiceLevelCode",
    "ShipFromLocationId",
    "ShipToLocationId",
    "ShipViaId",
    "Status",
    "SubstitutionRatio",
    "SubstitutionTypeId",
    "Translations",
    "UOM",
    "UpdatedBy",
    "UpdatedTimestamp",
    "entityName",
    "messages"
})
public class Allocation implements Serializable
{

    @JsonProperty("Actions")
    private Actions_____ actions;
    @JsonProperty("AllocatedOn")
    private String allocatedOn;
    @JsonProperty("AllocationDependencyId")
    private String allocationDependencyId;
    @JsonProperty("AllocationId")
    private String allocationId;
    @JsonProperty("AllocationType")
    private String allocationType;
    @JsonProperty("AsnDetailId")
    private String asnDetailId;
    @JsonProperty("AsnId")
    private String asnId;
    @JsonProperty("BatchNumber")
    private String batchNumber;
    @JsonProperty("CalculatedValues")
    private CalculatedValues_ calculatedValues;
    @JsonProperty("CarrierCode")
    private String carrierCode;
    @JsonProperty("CommittedDeliveryDate")
    private String committedDeliveryDate;
    @JsonProperty("CommittedShipDate")
    private String committedShipDate;
    @JsonProperty("CountryOfOrigin")
    private String countryOfOrigin;
    @JsonProperty("CreatedBy")
    private String createdBy;
    @JsonProperty("CreatedTimestamp")
    private String createdTimestamp;
    @JsonProperty("EarliestDeliveryDate")
    private String earliestDeliveryDate;
    @JsonProperty("EarliestShipDate")
    private String earliestShipDate;
    @JsonProperty("Extended")
    private Extended____ extended;
    @JsonProperty("GroupId")
    private String groupId;
    @JsonProperty("InventoryAttribute1")
    private String inventoryAttribute1;
    @JsonProperty("InventoryAttribute2")
    private String inventoryAttribute2;
    @JsonProperty("InventoryAttribute3")
    private String inventoryAttribute3;
    @JsonProperty("InventoryAttribute4")
    private String inventoryAttribute4;
    @JsonProperty("InventoryAttribute5")
    private String inventoryAttribute5;
    @JsonProperty("InventorySegmentId")
    private String inventorySegmentId;
    @JsonProperty("InventoryTypeId")
    private String inventoryTypeId;
    @JsonProperty("IsVirtual")
    private Boolean isVirtual;
    @JsonProperty("ItemId")
    private String itemId;
    @JsonProperty("LatestReleaseDate")
    private String latestReleaseDate;
    @JsonProperty("LatestShipDate")
    private String latestShipDate;
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
    @JsonProperty("Quantity")
    private Integer quantity;
    @JsonProperty("ReservationRequestDetailId")
    private String reservationRequestDetailId;
    @JsonProperty("ReservationRequestId")
    private String reservationRequestId;
    @JsonProperty("ServiceLevelCode")
    private String serviceLevelCode;
    @JsonProperty("ShipFromLocationId")
    private String shipFromLocationId;
    @JsonProperty("ShipToLocationId")
    private String shipToLocationId;
    @JsonProperty("ShipViaId")
    private String shipViaId;
    @JsonProperty("Status")
    private Status status;
    @JsonProperty("SubstitutionRatio")
    private Integer substitutionRatio;
    @JsonProperty("SubstitutionTypeId")
    private String substitutionTypeId;
    @JsonProperty("Translations")
    private Translations___ translations;
    @JsonProperty("UOM")
    private String uOM;
    @JsonProperty("UpdatedBy")
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp")
    private String updatedTimestamp;
    @JsonProperty("entityName")
    private String entityName;
    @JsonProperty("messages")
    private Messages__ messages;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -5294662846612887127L;

    @JsonProperty("Actions")
    public Actions_____ getActions() {
        return actions;
    }

    @JsonProperty("Actions")
    public void setActions(Actions_____ actions) {
        this.actions = actions;
    }

    @JsonProperty("AllocatedOn")
    public String getAllocatedOn() {
        return allocatedOn;
    }

    @JsonProperty("AllocatedOn")
    public void setAllocatedOn(String allocatedOn) {
        this.allocatedOn = allocatedOn;
    }

    @JsonProperty("AllocationDependencyId")
    public String getAllocationDependencyId() {
        return allocationDependencyId;
    }

    @JsonProperty("AllocationDependencyId")
    public void setAllocationDependencyId(String allocationDependencyId) {
        this.allocationDependencyId = allocationDependencyId;
    }

    @JsonProperty("AllocationId")
    public String getAllocationId() {
        return allocationId;
    }

    @JsonProperty("AllocationId")
    public void setAllocationId(String allocationId) {
        this.allocationId = allocationId;
    }

    @JsonProperty("AllocationType")
    public String getAllocationType() {
        return allocationType;
    }

    @JsonProperty("AllocationType")
    public void setAllocationType(String allocationType) {
        this.allocationType = allocationType;
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

    @JsonProperty("CalculatedValues")
    public CalculatedValues_ getCalculatedValues() {
        return calculatedValues;
    }

    @JsonProperty("CalculatedValues")
    public void setCalculatedValues(CalculatedValues_ calculatedValues) {
        this.calculatedValues = calculatedValues;
    }

    @JsonProperty("CarrierCode")
    public String getCarrierCode() {
        return carrierCode;
    }

    @JsonProperty("CarrierCode")
    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
    }

    @JsonProperty("CommittedDeliveryDate")
    public String getCommittedDeliveryDate() {
        return committedDeliveryDate;
    }

    @JsonProperty("CommittedDeliveryDate")
    public void setCommittedDeliveryDate(String committedDeliveryDate) {
        this.committedDeliveryDate = committedDeliveryDate;
    }

    @JsonProperty("CommittedShipDate")
    public String getCommittedShipDate() {
        return committedShipDate;
    }

    @JsonProperty("CommittedShipDate")
    public void setCommittedShipDate(String committedShipDate) {
        this.committedShipDate = committedShipDate;
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

    @JsonProperty("EarliestDeliveryDate")
    public String getEarliestDeliveryDate() {
        return earliestDeliveryDate;
    }

    @JsonProperty("EarliestDeliveryDate")
    public void setEarliestDeliveryDate(String earliestDeliveryDate) {
        this.earliestDeliveryDate = earliestDeliveryDate;
    }

    @JsonProperty("EarliestShipDate")
    public String getEarliestShipDate() {
        return earliestShipDate;
    }

    @JsonProperty("EarliestShipDate")
    public void setEarliestShipDate(String earliestShipDate) {
        this.earliestShipDate = earliestShipDate;
    }

    @JsonProperty("Extended")
    public Extended____ getExtended() {
        return extended;
    }

    @JsonProperty("Extended")
    public void setExtended(Extended____ extended) {
        this.extended = extended;
    }

    @JsonProperty("GroupId")
    public String getGroupId() {
        return groupId;
    }

    @JsonProperty("GroupId")
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    @JsonProperty("InventoryAttribute1")
    public String getInventoryAttribute1() {
        return inventoryAttribute1;
    }

    @JsonProperty("InventoryAttribute1")
    public void setInventoryAttribute1(String inventoryAttribute1) {
        this.inventoryAttribute1 = inventoryAttribute1;
    }

    @JsonProperty("InventoryAttribute2")
    public String getInventoryAttribute2() {
        return inventoryAttribute2;
    }

    @JsonProperty("InventoryAttribute2")
    public void setInventoryAttribute2(String inventoryAttribute2) {
        this.inventoryAttribute2 = inventoryAttribute2;
    }

    @JsonProperty("InventoryAttribute3")
    public String getInventoryAttribute3() {
        return inventoryAttribute3;
    }

    @JsonProperty("InventoryAttribute3")
    public void setInventoryAttribute3(String inventoryAttribute3) {
        this.inventoryAttribute3 = inventoryAttribute3;
    }

    @JsonProperty("InventoryAttribute4")
    public String getInventoryAttribute4() {
        return inventoryAttribute4;
    }

    @JsonProperty("InventoryAttribute4")
    public void setInventoryAttribute4(String inventoryAttribute4) {
        this.inventoryAttribute4 = inventoryAttribute4;
    }

    @JsonProperty("InventoryAttribute5")
    public String getInventoryAttribute5() {
        return inventoryAttribute5;
    }

    @JsonProperty("InventoryAttribute5")
    public void setInventoryAttribute5(String inventoryAttribute5) {
        this.inventoryAttribute5 = inventoryAttribute5;
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

    @JsonProperty("IsVirtual")
    public Boolean getIsVirtual() {
        return isVirtual;
    }

    @JsonProperty("IsVirtual")
    public void setIsVirtual(Boolean isVirtual) {
        this.isVirtual = isVirtual;
    }

    @JsonProperty("ItemId")
    public String getItemId() {
        return itemId;
    }

    @JsonProperty("ItemId")
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    @JsonProperty("LatestReleaseDate")
    public String getLatestReleaseDate() {
        return latestReleaseDate;
    }

    @JsonProperty("LatestReleaseDate")
    public void setLatestReleaseDate(String latestReleaseDate) {
        this.latestReleaseDate = latestReleaseDate;
    }

    @JsonProperty("LatestShipDate")
    public String getLatestShipDate() {
        return latestShipDate;
    }

    @JsonProperty("LatestShipDate")
    public void setLatestShipDate(String latestShipDate) {
        this.latestShipDate = latestShipDate;
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

    @JsonProperty("Quantity")
    public Integer getQuantity() {
        return quantity;
    }

    @JsonProperty("Quantity")
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("ReservationRequestDetailId")
    public String getReservationRequestDetailId() {
        return reservationRequestDetailId;
    }

    @JsonProperty("ReservationRequestDetailId")
    public void setReservationRequestDetailId(String reservationRequestDetailId) {
        this.reservationRequestDetailId = reservationRequestDetailId;
    }

    @JsonProperty("ReservationRequestId")
    public String getReservationRequestId() {
        return reservationRequestId;
    }

    @JsonProperty("ReservationRequestId")
    public void setReservationRequestId(String reservationRequestId) {
        this.reservationRequestId = reservationRequestId;
    }

    @JsonProperty("ServiceLevelCode")
    public String getServiceLevelCode() {
        return serviceLevelCode;
    }

    @JsonProperty("ServiceLevelCode")
    public void setServiceLevelCode(String serviceLevelCode) {
        this.serviceLevelCode = serviceLevelCode;
    }

    @JsonProperty("ShipFromLocationId")
    public String getShipFromLocationId() {
        return shipFromLocationId;
    }

    @JsonProperty("ShipFromLocationId")
    public void setShipFromLocationId(String shipFromLocationId) {
        this.shipFromLocationId = shipFromLocationId;
    }

    @JsonProperty("ShipToLocationId")
    public String getShipToLocationId() {
        return shipToLocationId;
    }

    @JsonProperty("ShipToLocationId")
    public void setShipToLocationId(String shipToLocationId) {
        this.shipToLocationId = shipToLocationId;
    }

    @JsonProperty("ShipViaId")
    public String getShipViaId() {
        return shipViaId;
    }

    @JsonProperty("ShipViaId")
    public void setShipViaId(String shipViaId) {
        this.shipViaId = shipViaId;
    }

    @JsonProperty("Status")
    public Status getStatus() {
        return status;
    }

    @JsonProperty("Status")
    public void setStatus(Status status) {
        this.status = status;
    }

    @JsonProperty("SubstitutionRatio")
    public Integer getSubstitutionRatio() {
        return substitutionRatio;
    }

    @JsonProperty("SubstitutionRatio")
    public void setSubstitutionRatio(Integer substitutionRatio) {
        this.substitutionRatio = substitutionRatio;
    }

    @JsonProperty("SubstitutionTypeId")
    public String getSubstitutionTypeId() {
        return substitutionTypeId;
    }

    @JsonProperty("SubstitutionTypeId")
    public void setSubstitutionTypeId(String substitutionTypeId) {
        this.substitutionTypeId = substitutionTypeId;
    }

    @JsonProperty("Translations")
    public Translations___ getTranslations() {
        return translations;
    }

    @JsonProperty("Translations")
    public void setTranslations(Translations___ translations) {
        this.translations = translations;
    }

    @JsonProperty("UOM")
    public String getUOM() {
        return uOM;
    }

    @JsonProperty("UOM")
    public void setUOM(String uOM) {
        this.uOM = uOM;
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
    public Messages__ getMessages() {
        return messages;
    }

    @JsonProperty("messages")
    public void setMessages(Messages__ messages) {
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
