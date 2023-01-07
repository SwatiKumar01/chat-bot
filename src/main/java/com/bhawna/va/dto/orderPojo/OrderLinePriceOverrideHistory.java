
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
    "Comments",
    "CreatedBy",
    "CreatedTimestamp",
    "Extended",
    "IsPriceOverridden",
    "ItemId",
    "OrgId",
    "PK",
    "PreviousPrice",
    "PriceOverrideId",
    "Reason",
    "Translations",
    "UpdatedBy",
    "UpdatedPrice",
    "UpdatedTimestamp",
    "entityName",
    "messages"
})
public class OrderLinePriceOverrideHistory implements Serializable
{

    @JsonProperty("Actions")
    private Actions_________________ actions;
    @JsonProperty("Comments")
    private String comments;
    @JsonProperty("CreatedBy")
    private String createdBy;
    @JsonProperty("CreatedTimestamp")
    private String createdTimestamp;
    @JsonProperty("Extended")
    private Extended_________________ extended;
    @JsonProperty("IsPriceOverridden")
    private Boolean isPriceOverridden;
    @JsonProperty("ItemId")
    private String itemId;
    @JsonProperty("OrgId")
    private String orgId;
    @JsonProperty("PK")
    private String pK;
    @JsonProperty("PreviousPrice")
    private Integer previousPrice;
    @JsonProperty("PriceOverrideId")
    private String priceOverrideId;
    @JsonProperty("Reason")
    private Reason_ reason;
    @JsonProperty("Translations")
    private Translations_______________ translations;
    @JsonProperty("UpdatedBy")
    private String updatedBy;
    @JsonProperty("UpdatedPrice")
    private Integer updatedPrice;
    @JsonProperty("UpdatedTimestamp")
    private String updatedTimestamp;
    @JsonProperty("entityName")
    private String entityName;
    @JsonProperty("messages")
    private Messages______________ messages;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -1438341155440829083L;

    @JsonProperty("Actions")
    public Actions_________________ getActions() {
        return actions;
    }

    @JsonProperty("Actions")
    public void setActions(Actions_________________ actions) {
        this.actions = actions;
    }

    @JsonProperty("Comments")
    public String getComments() {
        return comments;
    }

    @JsonProperty("Comments")
    public void setComments(String comments) {
        this.comments = comments;
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
    public Extended_________________ getExtended() {
        return extended;
    }

    @JsonProperty("Extended")
    public void setExtended(Extended_________________ extended) {
        this.extended = extended;
    }

    @JsonProperty("IsPriceOverridden")
    public Boolean getIsPriceOverridden() {
        return isPriceOverridden;
    }

    @JsonProperty("IsPriceOverridden")
    public void setIsPriceOverridden(Boolean isPriceOverridden) {
        this.isPriceOverridden = isPriceOverridden;
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

    @JsonProperty("PreviousPrice")
    public Integer getPreviousPrice() {
        return previousPrice;
    }

    @JsonProperty("PreviousPrice")
    public void setPreviousPrice(Integer previousPrice) {
        this.previousPrice = previousPrice;
    }

    @JsonProperty("PriceOverrideId")
    public String getPriceOverrideId() {
        return priceOverrideId;
    }

    @JsonProperty("PriceOverrideId")
    public void setPriceOverrideId(String priceOverrideId) {
        this.priceOverrideId = priceOverrideId;
    }

    @JsonProperty("Reason")
    public Reason_ getReason() {
        return reason;
    }

    @JsonProperty("Reason")
    public void setReason(Reason_ reason) {
        this.reason = reason;
    }

    @JsonProperty("Translations")
    public Translations_______________ getTranslations() {
        return translations;
    }

    @JsonProperty("Translations")
    public void setTranslations(Translations_______________ translations) {
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

    @JsonProperty("UpdatedPrice")
    public Integer getUpdatedPrice() {
        return updatedPrice;
    }

    @JsonProperty("UpdatedPrice")
    public void setUpdatedPrice(Integer updatedPrice) {
        this.updatedPrice = updatedPrice;
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
    public Messages______________ getMessages() {
        return messages;
    }

    @JsonProperty("messages")
    public void setMessages(Messages______________ messages) {
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
