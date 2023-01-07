
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
    "CreatedBy",
    "CreatedTimestamp",
    "Extended",
    "IsGiftReturn",
    "ItemId",
    "LocationId",
    "OrgId",
    "PK",
    "Quantity",
    "ReceivedItemCondition",
    "ReturnDetailId",
    "ReturnOrderId",
    "ReturnOrderLineId",
    "ReturnType",
    "Translations",
    "UOM",
    "UpdatedBy",
    "UpdatedTimestamp",
    "entityName",
    "messages"
})
public class ReturnDetail implements Serializable
{

    @JsonProperty("Actions")
    private Actions_________________________ actions;
    @JsonProperty("CreatedBy")
    private String createdBy;
    @JsonProperty("CreatedTimestamp")
    private String createdTimestamp;
    @JsonProperty("Extended")
    private Extended_________________________ extended;
    @JsonProperty("IsGiftReturn")
    private Boolean isGiftReturn;
    @JsonProperty("ItemId")
    private String itemId;
    @JsonProperty("LocationId")
    private String locationId;
    @JsonProperty("OrgId")
    private String orgId;
    @JsonProperty("PK")
    private String pK;
    @JsonProperty("Quantity")
    private Integer quantity;
    @JsonProperty("ReceivedItemCondition")
    private ReceivedItemCondition receivedItemCondition;
    @JsonProperty("ReturnDetailId")
    private String returnDetailId;
    @JsonProperty("ReturnOrderId")
    private String returnOrderId;
    @JsonProperty("ReturnOrderLineId")
    private String returnOrderLineId;
    @JsonProperty("ReturnType")
    private ReturnType returnType;
    @JsonProperty("Translations")
    private Translations_______________________ translations;
    @JsonProperty("UOM")
    private String uOM;
    @JsonProperty("UpdatedBy")
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp")
    private String updatedTimestamp;
    @JsonProperty("entityName")
    private String entityName;
    @JsonProperty("messages")
    private Messages______________________ messages;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -7758060240489340061L;

    @JsonProperty("Actions")
    public Actions_________________________ getActions() {
        return actions;
    }

    @JsonProperty("Actions")
    public void setActions(Actions_________________________ actions) {
        this.actions = actions;
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
    public Extended_________________________ getExtended() {
        return extended;
    }

    @JsonProperty("Extended")
    public void setExtended(Extended_________________________ extended) {
        this.extended = extended;
    }

    @JsonProperty("IsGiftReturn")
    public Boolean getIsGiftReturn() {
        return isGiftReturn;
    }

    @JsonProperty("IsGiftReturn")
    public void setIsGiftReturn(Boolean isGiftReturn) {
        this.isGiftReturn = isGiftReturn;
    }

    @JsonProperty("ItemId")
    public String getItemId() {
        return itemId;
    }

    @JsonProperty("ItemId")
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    @JsonProperty("LocationId")
    public String getLocationId() {
        return locationId;
    }

    @JsonProperty("LocationId")
    public void setLocationId(String locationId) {
        this.locationId = locationId;
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

    @JsonProperty("ReceivedItemCondition")
    public ReceivedItemCondition getReceivedItemCondition() {
        return receivedItemCondition;
    }

    @JsonProperty("ReceivedItemCondition")
    public void setReceivedItemCondition(ReceivedItemCondition receivedItemCondition) {
        this.receivedItemCondition = receivedItemCondition;
    }

    @JsonProperty("ReturnDetailId")
    public String getReturnDetailId() {
        return returnDetailId;
    }

    @JsonProperty("ReturnDetailId")
    public void setReturnDetailId(String returnDetailId) {
        this.returnDetailId = returnDetailId;
    }

    @JsonProperty("ReturnOrderId")
    public String getReturnOrderId() {
        return returnOrderId;
    }

    @JsonProperty("ReturnOrderId")
    public void setReturnOrderId(String returnOrderId) {
        this.returnOrderId = returnOrderId;
    }

    @JsonProperty("ReturnOrderLineId")
    public String getReturnOrderLineId() {
        return returnOrderLineId;
    }

    @JsonProperty("ReturnOrderLineId")
    public void setReturnOrderLineId(String returnOrderLineId) {
        this.returnOrderLineId = returnOrderLineId;
    }

    @JsonProperty("ReturnType")
    public ReturnType getReturnType() {
        return returnType;
    }

    @JsonProperty("ReturnType")
    public void setReturnType(ReturnType returnType) {
        this.returnType = returnType;
    }

    @JsonProperty("Translations")
    public Translations_______________________ getTranslations() {
        return translations;
    }

    @JsonProperty("Translations")
    public void setTranslations(Translations_______________________ translations) {
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
    public Messages______________________ getMessages() {
        return messages;
    }

    @JsonProperty("messages")
    public void setMessages(Messages______________________ messages) {
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
