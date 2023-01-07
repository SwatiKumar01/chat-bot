
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
    "AllocationId",
    "CancelledDate",
    "CancelledQuantity",
    "CreatedBy",
    "CreatedTimestamp",
    "EffectiveRank",
    "Extended",
    "FulfilledQuantity",
    "ItemId",
    "OrderLineId",
    "OrgId",
    "PK",
    "Quantity",
    "ReleaseLineId",
    "Translations",
    "UOM",
    "UpdatedBy",
    "UpdatedTimestamp",
    "entityName",
    "messages"
})
public class ReleaseLine implements Serializable
{

    @JsonProperty("Actions")
    private Actions_________________________________ actions;
    @JsonProperty("AllocationId")
    private String allocationId;
    @JsonProperty("CancelledDate")
    private String cancelledDate;
    @JsonProperty("CancelledQuantity")
    private Integer cancelledQuantity;
    @JsonProperty("CreatedBy")
    private String createdBy;
    @JsonProperty("CreatedTimestamp")
    private String createdTimestamp;
    @JsonProperty("EffectiveRank")
    private String effectiveRank;
    @JsonProperty("Extended")
    private Extended_________________________________ extended;
    @JsonProperty("FulfilledQuantity")
    private Integer fulfilledQuantity;
    @JsonProperty("ItemId")
    private String itemId;
    @JsonProperty("OrderLineId")
    private String orderLineId;
    @JsonProperty("OrgId")
    private String orgId;
    @JsonProperty("PK")
    private String pK;
    @JsonProperty("Quantity")
    private Integer quantity;
    @JsonProperty("ReleaseLineId")
    private String releaseLineId;
    @JsonProperty("Translations")
    private Translations_______________________________ translations;
    @JsonProperty("UOM")
    private String uOM;
    @JsonProperty("UpdatedBy")
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp")
    private String updatedTimestamp;
    @JsonProperty("entityName")
    private String entityName;
    @JsonProperty("messages")
    private Messages______________________________ messages;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -4089822061125515196L;

    @JsonProperty("Actions")
    public Actions_________________________________ getActions() {
        return actions;
    }

    @JsonProperty("Actions")
    public void setActions(Actions_________________________________ actions) {
        this.actions = actions;
    }

    @JsonProperty("AllocationId")
    public String getAllocationId() {
        return allocationId;
    }

    @JsonProperty("AllocationId")
    public void setAllocationId(String allocationId) {
        this.allocationId = allocationId;
    }

    @JsonProperty("CancelledDate")
    public String getCancelledDate() {
        return cancelledDate;
    }

    @JsonProperty("CancelledDate")
    public void setCancelledDate(String cancelledDate) {
        this.cancelledDate = cancelledDate;
    }

    @JsonProperty("CancelledQuantity")
    public Integer getCancelledQuantity() {
        return cancelledQuantity;
    }

    @JsonProperty("CancelledQuantity")
    public void setCancelledQuantity(Integer cancelledQuantity) {
        this.cancelledQuantity = cancelledQuantity;
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

    @JsonProperty("EffectiveRank")
    public String getEffectiveRank() {
        return effectiveRank;
    }

    @JsonProperty("EffectiveRank")
    public void setEffectiveRank(String effectiveRank) {
        this.effectiveRank = effectiveRank;
    }

    @JsonProperty("Extended")
    public Extended_________________________________ getExtended() {
        return extended;
    }

    @JsonProperty("Extended")
    public void setExtended(Extended_________________________________ extended) {
        this.extended = extended;
    }

    @JsonProperty("FulfilledQuantity")
    public Integer getFulfilledQuantity() {
        return fulfilledQuantity;
    }

    @JsonProperty("FulfilledQuantity")
    public void setFulfilledQuantity(Integer fulfilledQuantity) {
        this.fulfilledQuantity = fulfilledQuantity;
    }

    @JsonProperty("ItemId")
    public String getItemId() {
        return itemId;
    }

    @JsonProperty("ItemId")
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    @JsonProperty("OrderLineId")
    public String getOrderLineId() {
        return orderLineId;
    }

    @JsonProperty("OrderLineId")
    public void setOrderLineId(String orderLineId) {
        this.orderLineId = orderLineId;
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

    @JsonProperty("Quantity")
    public Integer getQuantity() {
        return quantity;
    }

    @JsonProperty("Quantity")
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("ReleaseLineId")
    public String getReleaseLineId() {
        return releaseLineId;
    }

    @JsonProperty("ReleaseLineId")
    public void setReleaseLineId(String releaseLineId) {
        this.releaseLineId = releaseLineId;
    }

    @JsonProperty("Translations")
    public Translations_______________________________ getTranslations() {
        return translations;
    }

    @JsonProperty("Translations")
    public void setTranslations(Translations_______________________________ translations) {
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
    public Messages______________________________ getMessages() {
        return messages;
    }

    @JsonProperty("messages")
    public void setMessages(Messages______________________________ messages) {
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
