
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
    "CancelComments",
    "CancelQuantity",
    "CancelReason",
    "CreatedBy",
    "CreatedTimestamp",
    "Extended",
    "OrgId",
    "PK",
    "Translations",
    "UpdatedBy",
    "UpdatedTimestamp",
    "entityName",
    "messages"
})
public class OrderLineCancelHistory implements Serializable
{

    @JsonProperty("Actions")
    private Actions__________ actions;
    @JsonProperty("CancelComments")
    private String cancelComments;
    @JsonProperty("CancelQuantity")
    private Integer cancelQuantity;
    @JsonProperty("CancelReason")
    private CancelReason__ cancelReason;
    @JsonProperty("CreatedBy")
    private String createdBy;
    @JsonProperty("CreatedTimestamp")
    private String createdTimestamp;
    @JsonProperty("Extended")
    private Extended__________ extended;
    @JsonProperty("OrgId")
    private String orgId;
    @JsonProperty("PK")
    private String pK;
    @JsonProperty("Translations")
    private Translations________ translations;
    @JsonProperty("UpdatedBy")
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp")
    private String updatedTimestamp;
    @JsonProperty("entityName")
    private String entityName;
    @JsonProperty("messages")
    private Messages_______ messages;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -5675369253641269007L;

    @JsonProperty("Actions")
    public Actions__________ getActions() {
        return actions;
    }

    @JsonProperty("Actions")
    public void setActions(Actions__________ actions) {
        this.actions = actions;
    }

    @JsonProperty("CancelComments")
    public String getCancelComments() {
        return cancelComments;
    }

    @JsonProperty("CancelComments")
    public void setCancelComments(String cancelComments) {
        this.cancelComments = cancelComments;
    }

    @JsonProperty("CancelQuantity")
    public Integer getCancelQuantity() {
        return cancelQuantity;
    }

    @JsonProperty("CancelQuantity")
    public void setCancelQuantity(Integer cancelQuantity) {
        this.cancelQuantity = cancelQuantity;
    }

    @JsonProperty("CancelReason")
    public CancelReason__ getCancelReason() {
        return cancelReason;
    }

    @JsonProperty("CancelReason")
    public void setCancelReason(CancelReason__ cancelReason) {
        this.cancelReason = cancelReason;
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
    public Extended__________ getExtended() {
        return extended;
    }

    @JsonProperty("Extended")
    public void setExtended(Extended__________ extended) {
        this.extended = extended;
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
    public Translations________ getTranslations() {
        return translations;
    }

    @JsonProperty("Translations")
    public void setTranslations(Translations________ translations) {
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
    public Messages_______ getMessages() {
        return messages;
    }

    @JsonProperty("messages")
    public void setMessages(Messages_______ messages) {
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
