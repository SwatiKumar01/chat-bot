
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
    "AVSReasonComments",
    "Actions",
    "Address",
    "AddressId",
    "AddressName",
    "AvsReason",
    "CreatedBy",
    "CreatedTimestamp",
    "Extended",
    "IsAddressVerified",
    "OrderId",
    "OrgId",
    "PK",
    "Translations",
    "UpdatedBy",
    "UpdatedTimestamp",
    "entityName",
    "messages"
})
public class ShipToAddress implements Serializable
{

    @JsonProperty("AVSReasonComments")
    private String aVSReasonComments;
    @JsonProperty("Actions")
    private Actions___________________________ actions;
    @JsonProperty("Address")
    private Address_ address;
    @JsonProperty("AddressId")
    private String addressId;
    @JsonProperty("AddressName")
    private String addressName;
    @JsonProperty("AvsReason")
    private AvsReason_ avsReason;
    @JsonProperty("CreatedBy")
    private String createdBy;
    @JsonProperty("CreatedTimestamp")
    private String createdTimestamp;
    @JsonProperty("Extended")
    private Extended___________________________ extended;
    @JsonProperty("IsAddressVerified")
    private Boolean isAddressVerified;
    @JsonProperty("OrderId")
    private String orderId;
    @JsonProperty("OrgId")
    private String orgId;
    @JsonProperty("PK")
    private String pK;
    @JsonProperty("Translations")
    private Translations_________________________ translations;
    @JsonProperty("UpdatedBy")
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp")
    private String updatedTimestamp;
    @JsonProperty("entityName")
    private String entityName;
    @JsonProperty("messages")
    private Messages________________________ messages;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -5272798944426559513L;

    @JsonProperty("AVSReasonComments")
    public String getAVSReasonComments() {
        return aVSReasonComments;
    }

    @JsonProperty("AVSReasonComments")
    public void setAVSReasonComments(String aVSReasonComments) {
        this.aVSReasonComments = aVSReasonComments;
    }

    @JsonProperty("Actions")
    public Actions___________________________ getActions() {
        return actions;
    }

    @JsonProperty("Actions")
    public void setActions(Actions___________________________ actions) {
        this.actions = actions;
    }

    @JsonProperty("Address")
    public Address_ getAddress() {
        return address;
    }

    @JsonProperty("Address")
    public void setAddress(Address_ address) {
        this.address = address;
    }

    @JsonProperty("AddressId")
    public String getAddressId() {
        return addressId;
    }

    @JsonProperty("AddressId")
    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    @JsonProperty("AddressName")
    public String getAddressName() {
        return addressName;
    }

    @JsonProperty("AddressName")
    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    @JsonProperty("AvsReason")
    public AvsReason_ getAvsReason() {
        return avsReason;
    }

    @JsonProperty("AvsReason")
    public void setAvsReason(AvsReason_ avsReason) {
        this.avsReason = avsReason;
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
    public Extended___________________________ getExtended() {
        return extended;
    }

    @JsonProperty("Extended")
    public void setExtended(Extended___________________________ extended) {
        this.extended = extended;
    }

    @JsonProperty("IsAddressVerified")
    public Boolean getIsAddressVerified() {
        return isAddressVerified;
    }

    @JsonProperty("IsAddressVerified")
    public void setIsAddressVerified(Boolean isAddressVerified) {
        this.isAddressVerified = isAddressVerified;
    }

    @JsonProperty("OrderId")
    public String getOrderId() {
        return orderId;
    }

    @JsonProperty("OrderId")
    public void setOrderId(String orderId) {
        this.orderId = orderId;
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

    @JsonProperty("Translations")
    public Translations_________________________ getTranslations() {
        return translations;
    }

    @JsonProperty("Translations")
    public void setTranslations(Translations_________________________ translations) {
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
    public Messages________________________ getMessages() {
        return messages;
    }

    @JsonProperty("messages")
    public void setMessages(Messages________________________ messages) {
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
