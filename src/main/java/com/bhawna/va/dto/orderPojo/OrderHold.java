
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
    "ApplyReasonComments",
    "CreatedBy",
    "CreatedTimestamp",
    "Extended",
    "ExternalCreatedBy",
    "ExternalCreatedDate",
    "HoldTypeId",
    "OrgId",
    "PK",
    "ResolveReasonComments",
    "ResolveReasonId",
    "StatusId",
    "Translations",
    "UpdatedBy",
    "UpdatedTimestamp",
    "entityName",
    "messages"
})
public class OrderHold implements Serializable
{

    @JsonProperty("Actions")
    private Actions___ actions;
    @JsonProperty("ApplyReasonComments")
    private String applyReasonComments;
    @JsonProperty("CreatedBy")
    private String createdBy;
    @JsonProperty("CreatedTimestamp")
    private String createdTimestamp;
    @JsonProperty("Extended")
    private Extended___ extended;
    @JsonProperty("ExternalCreatedBy")
    private String externalCreatedBy;
    @JsonProperty("ExternalCreatedDate")
    private String externalCreatedDate;
    @JsonProperty("HoldTypeId")
    private String holdTypeId;
    @JsonProperty("OrgId")
    private String orgId;
    @JsonProperty("PK")
    private String pK;
    @JsonProperty("ResolveReasonComments")
    private String resolveReasonComments;
    @JsonProperty("ResolveReasonId")
    private String resolveReasonId;
    @JsonProperty("StatusId")
    private String statusId;
    @JsonProperty("Translations")
    private Translations__ translations;
    @JsonProperty("UpdatedBy")
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp")
    private String updatedTimestamp;
    @JsonProperty("entityName")
    private String entityName;
    @JsonProperty("messages")
    private Messages_ messages;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 9200885460710013990L;

    @JsonProperty("Actions")
    public Actions___ getActions() {
        return actions;
    }

    @JsonProperty("Actions")
    public void setActions(Actions___ actions) {
        this.actions = actions;
    }

    @JsonProperty("ApplyReasonComments")
    public String getApplyReasonComments() {
        return applyReasonComments;
    }

    @JsonProperty("ApplyReasonComments")
    public void setApplyReasonComments(String applyReasonComments) {
        this.applyReasonComments = applyReasonComments;
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
    public Extended___ getExtended() {
        return extended;
    }

    @JsonProperty("Extended")
    public void setExtended(Extended___ extended) {
        this.extended = extended;
    }

    @JsonProperty("ExternalCreatedBy")
    public String getExternalCreatedBy() {
        return externalCreatedBy;
    }

    @JsonProperty("ExternalCreatedBy")
    public void setExternalCreatedBy(String externalCreatedBy) {
        this.externalCreatedBy = externalCreatedBy;
    }

    @JsonProperty("ExternalCreatedDate")
    public String getExternalCreatedDate() {
        return externalCreatedDate;
    }

    @JsonProperty("ExternalCreatedDate")
    public void setExternalCreatedDate(String externalCreatedDate) {
        this.externalCreatedDate = externalCreatedDate;
    }

    @JsonProperty("HoldTypeId")
    public String getHoldTypeId() {
        return holdTypeId;
    }

    @JsonProperty("HoldTypeId")
    public void setHoldTypeId(String holdTypeId) {
        this.holdTypeId = holdTypeId;
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

    @JsonProperty("ResolveReasonComments")
    public String getResolveReasonComments() {
        return resolveReasonComments;
    }

    @JsonProperty("ResolveReasonComments")
    public void setResolveReasonComments(String resolveReasonComments) {
        this.resolveReasonComments = resolveReasonComments;
    }

    @JsonProperty("ResolveReasonId")
    public String getResolveReasonId() {
        return resolveReasonId;
    }

    @JsonProperty("ResolveReasonId")
    public void setResolveReasonId(String resolveReasonId) {
        this.resolveReasonId = resolveReasonId;
    }

    @JsonProperty("StatusId")
    public String getStatusId() {
        return statusId;
    }

    @JsonProperty("StatusId")
    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    @JsonProperty("Translations")
    public Translations__ getTranslations() {
        return translations;
    }

    @JsonProperty("Translations")
    public void setTranslations(Translations__ translations) {
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
    public Messages_ getMessages() {
        return messages;
    }

    @JsonProperty("messages")
    public void setMessages(Messages_ messages) {
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
