
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
    "InvalidReason",
    "IsInvalid",
    "OrgId",
    "PK",
    "PromotionId",
    "PromotionRequestId",
    "Translations",
    "UpdatedBy",
    "UpdatedTimestamp",
    "entityName",
    "messages"
})
public class OrderLinePromotionRequest implements Serializable
{

    @JsonProperty("Actions")
    private Actions___________________ actions;
    @JsonProperty("CreatedBy")
    private String createdBy;
    @JsonProperty("CreatedTimestamp")
    private String createdTimestamp;
    @JsonProperty("Extended")
    private Extended___________________ extended;
    @JsonProperty("InvalidReason")
    private InvalidReason invalidReason;
    @JsonProperty("IsInvalid")
    private Boolean isInvalid;
    @JsonProperty("OrgId")
    private String orgId;
    @JsonProperty("PK")
    private String pK;
    @JsonProperty("PromotionId")
    private String promotionId;
    @JsonProperty("PromotionRequestId")
    private String promotionRequestId;
    @JsonProperty("Translations")
    private Translations_________________ translations;
    @JsonProperty("UpdatedBy")
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp")
    private String updatedTimestamp;
    @JsonProperty("entityName")
    private String entityName;
    @JsonProperty("messages")
    private Messages________________ messages;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8543454401329478223L;

    @JsonProperty("Actions")
    public Actions___________________ getActions() {
        return actions;
    }

    @JsonProperty("Actions")
    public void setActions(Actions___________________ actions) {
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
    public Extended___________________ getExtended() {
        return extended;
    }

    @JsonProperty("Extended")
    public void setExtended(Extended___________________ extended) {
        this.extended = extended;
    }

    @JsonProperty("InvalidReason")
    public InvalidReason getInvalidReason() {
        return invalidReason;
    }

    @JsonProperty("InvalidReason")
    public void setInvalidReason(InvalidReason invalidReason) {
        this.invalidReason = invalidReason;
    }

    @JsonProperty("IsInvalid")
    public Boolean getIsInvalid() {
        return isInvalid;
    }

    @JsonProperty("IsInvalid")
    public void setIsInvalid(Boolean isInvalid) {
        this.isInvalid = isInvalid;
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

    @JsonProperty("PromotionId")
    public String getPromotionId() {
        return promotionId;
    }

    @JsonProperty("PromotionId")
    public void setPromotionId(String promotionId) {
        this.promotionId = promotionId;
    }

    @JsonProperty("PromotionRequestId")
    public String getPromotionRequestId() {
        return promotionRequestId;
    }

    @JsonProperty("PromotionRequestId")
    public void setPromotionRequestId(String promotionRequestId) {
        this.promotionRequestId = promotionRequestId;
    }

    @JsonProperty("Translations")
    public Translations_________________ getTranslations() {
        return translations;
    }

    @JsonProperty("Translations")
    public void setTranslations(Translations_________________ translations) {
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
    public Messages________________ getMessages() {
        return messages;
    }

    @JsonProperty("messages")
    public void setMessages(Messages________________ messages) {
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
