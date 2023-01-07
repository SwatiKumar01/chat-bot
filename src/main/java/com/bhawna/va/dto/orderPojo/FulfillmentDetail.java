
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
    "CalculatedValues",
    "CarrierCode",
    "CreatedBy",
    "CreatedTimestamp",
    "Eta",
    "Extended",
    "FulfillmentDate",
    "FulfillmentDetailId",
    "FulfillmentId",
    "GcNumber",
    "GcPIN",
    "GiftCardNumber",
    "GiftCardPIN",
    "ItemId",
    "OrgId",
    "PK",
    "PackageDetailId",
    "PackageId",
    "Quantity",
    "ReleaseId",
    "ReleaseLineId",
    "ReturnTrackingNumber",
    "SerialNumber",
    "ServiceLevelCode",
    "ShipViaId",
    "ShipmentId",
    "StatusId",
    "TrackingNumber",
    "TrackingURL",
    "Translations",
    "UOM",
    "UpdatedBy",
    "UpdatedTimestamp",
    "entityName",
    "messages"
})
public class FulfillmentDetail implements Serializable
{

    @JsonProperty("Actions")
    private Actions______ actions;
    @JsonProperty("CalculatedValues")
    private CalculatedValues___ calculatedValues;
    @JsonProperty("CarrierCode")
    private String carrierCode;
    @JsonProperty("CreatedBy")
    private String createdBy;
    @JsonProperty("CreatedTimestamp")
    private String createdTimestamp;
    @JsonProperty("Eta")
    private String eta;
    @JsonProperty("Extended")
    private Extended______ extended;
    @JsonProperty("FulfillmentDate")
    private String fulfillmentDate;
    @JsonProperty("FulfillmentDetailId")
    private String fulfillmentDetailId;
    @JsonProperty("FulfillmentId")
    private String fulfillmentId;
    @JsonProperty("GcNumber")
    private String gcNumber;
    @JsonProperty("GcPIN")
    private String gcPIN;
    @JsonProperty("GiftCardNumber")
    private String giftCardNumber;
    @JsonProperty("GiftCardPIN")
    private String giftCardPIN;
    @JsonProperty("ItemId")
    private String itemId;
    @JsonProperty("OrgId")
    private String orgId;
    @JsonProperty("PK")
    private String pK;
    @JsonProperty("PackageDetailId")
    private String packageDetailId;
    @JsonProperty("PackageId")
    private String packageId;
    @JsonProperty("Quantity")
    private Integer quantity;
    @JsonProperty("ReleaseId")
    private String releaseId;
    @JsonProperty("ReleaseLineId")
    private String releaseLineId;
    @JsonProperty("ReturnTrackingNumber")
    private String returnTrackingNumber;
    @JsonProperty("SerialNumber")
    private String serialNumber;
    @JsonProperty("ServiceLevelCode")
    private String serviceLevelCode;
    @JsonProperty("ShipViaId")
    private String shipViaId;
    @JsonProperty("ShipmentId")
    private String shipmentId;
    @JsonProperty("StatusId")
    private String statusId;
    @JsonProperty("TrackingNumber")
    private String trackingNumber;
    @JsonProperty("TrackingURL")
    private String trackingURL;
    @JsonProperty("Translations")
    private Translations____ translations;
    @JsonProperty("UOM")
    private String uOM;
    @JsonProperty("UpdatedBy")
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp")
    private String updatedTimestamp;
    @JsonProperty("entityName")
    private String entityName;
    @JsonProperty("messages")
    private Messages___ messages;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 8704230926619378903L;

    @JsonProperty("Actions")
    public Actions______ getActions() {
        return actions;
    }

    @JsonProperty("Actions")
    public void setActions(Actions______ actions) {
        this.actions = actions;
    }

    @JsonProperty("CalculatedValues")
    public CalculatedValues___ getCalculatedValues() {
        return calculatedValues;
    }

    @JsonProperty("CalculatedValues")
    public void setCalculatedValues(CalculatedValues___ calculatedValues) {
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

    @JsonProperty("Eta")
    public String getEta() {
        return eta;
    }

    @JsonProperty("Eta")
    public void setEta(String eta) {
        this.eta = eta;
    }

    @JsonProperty("Extended")
    public Extended______ getExtended() {
        return extended;
    }

    @JsonProperty("Extended")
    public void setExtended(Extended______ extended) {
        this.extended = extended;
    }

    @JsonProperty("FulfillmentDate")
    public String getFulfillmentDate() {
        return fulfillmentDate;
    }

    @JsonProperty("FulfillmentDate")
    public void setFulfillmentDate(String fulfillmentDate) {
        this.fulfillmentDate = fulfillmentDate;
    }

    @JsonProperty("FulfillmentDetailId")
    public String getFulfillmentDetailId() {
        return fulfillmentDetailId;
    }

    @JsonProperty("FulfillmentDetailId")
    public void setFulfillmentDetailId(String fulfillmentDetailId) {
        this.fulfillmentDetailId = fulfillmentDetailId;
    }

    @JsonProperty("FulfillmentId")
    public String getFulfillmentId() {
        return fulfillmentId;
    }

    @JsonProperty("FulfillmentId")
    public void setFulfillmentId(String fulfillmentId) {
        this.fulfillmentId = fulfillmentId;
    }

    @JsonProperty("GcNumber")
    public String getGcNumber() {
        return gcNumber;
    }

    @JsonProperty("GcNumber")
    public void setGcNumber(String gcNumber) {
        this.gcNumber = gcNumber;
    }

    @JsonProperty("GcPIN")
    public String getGcPIN() {
        return gcPIN;
    }

    @JsonProperty("GcPIN")
    public void setGcPIN(String gcPIN) {
        this.gcPIN = gcPIN;
    }

    @JsonProperty("GiftCardNumber")
    public String getGiftCardNumber() {
        return giftCardNumber;
    }

    @JsonProperty("GiftCardNumber")
    public void setGiftCardNumber(String giftCardNumber) {
        this.giftCardNumber = giftCardNumber;
    }

    @JsonProperty("GiftCardPIN")
    public String getGiftCardPIN() {
        return giftCardPIN;
    }

    @JsonProperty("GiftCardPIN")
    public void setGiftCardPIN(String giftCardPIN) {
        this.giftCardPIN = giftCardPIN;
    }

    @JsonProperty("ItemId")
    public String getItemId() {
        return itemId;
    }

    @JsonProperty("ItemId")
    public void setItemId(String itemId) {
        this.itemId = itemId;
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

    @JsonProperty("PackageDetailId")
    public String getPackageDetailId() {
        return packageDetailId;
    }

    @JsonProperty("PackageDetailId")
    public void setPackageDetailId(String packageDetailId) {
        this.packageDetailId = packageDetailId;
    }

    @JsonProperty("PackageId")
    public String getPackageId() {
        return packageId;
    }

    @JsonProperty("PackageId")
    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    @JsonProperty("Quantity")
    public Integer getQuantity() {
        return quantity;
    }

    @JsonProperty("Quantity")
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("ReleaseId")
    public String getReleaseId() {
        return releaseId;
    }

    @JsonProperty("ReleaseId")
    public void setReleaseId(String releaseId) {
        this.releaseId = releaseId;
    }

    @JsonProperty("ReleaseLineId")
    public String getReleaseLineId() {
        return releaseLineId;
    }

    @JsonProperty("ReleaseLineId")
    public void setReleaseLineId(String releaseLineId) {
        this.releaseLineId = releaseLineId;
    }

    @JsonProperty("ReturnTrackingNumber")
    public String getReturnTrackingNumber() {
        return returnTrackingNumber;
    }

    @JsonProperty("ReturnTrackingNumber")
    public void setReturnTrackingNumber(String returnTrackingNumber) {
        this.returnTrackingNumber = returnTrackingNumber;
    }

    @JsonProperty("SerialNumber")
    public String getSerialNumber() {
        return serialNumber;
    }

    @JsonProperty("SerialNumber")
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @JsonProperty("ServiceLevelCode")
    public String getServiceLevelCode() {
        return serviceLevelCode;
    }

    @JsonProperty("ServiceLevelCode")
    public void setServiceLevelCode(String serviceLevelCode) {
        this.serviceLevelCode = serviceLevelCode;
    }

    @JsonProperty("ShipViaId")
    public String getShipViaId() {
        return shipViaId;
    }

    @JsonProperty("ShipViaId")
    public void setShipViaId(String shipViaId) {
        this.shipViaId = shipViaId;
    }

    @JsonProperty("ShipmentId")
    public String getShipmentId() {
        return shipmentId;
    }

    @JsonProperty("ShipmentId")
    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }

    @JsonProperty("StatusId")
    public String getStatusId() {
        return statusId;
    }

    @JsonProperty("StatusId")
    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    @JsonProperty("TrackingNumber")
    public String getTrackingNumber() {
        return trackingNumber;
    }

    @JsonProperty("TrackingNumber")
    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    @JsonProperty("TrackingURL")
    public String getTrackingURL() {
        return trackingURL;
    }

    @JsonProperty("TrackingURL")
    public void setTrackingURL(String trackingURL) {
        this.trackingURL = trackingURL;
    }

    @JsonProperty("Translations")
    public Translations____ getTranslations() {
        return translations;
    }

    @JsonProperty("Translations")
    public void setTranslations(Translations____ translations) {
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
    public Messages___ getMessages() {
        return messages;
    }

    @JsonProperty("messages")
    public void setMessages(Messages___ messages) {
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
