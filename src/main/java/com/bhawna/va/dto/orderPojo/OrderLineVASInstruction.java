
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
    "OrgId",
    "PK",
    "ParentOrderLine",
    "Translations",
    "UpdatedBy",
    "UpdatedTimestamp",
    "VasInstructions",
    "VasOptionId",
    "VasTypeId",
    "entityName",
    "messages"
})
public class OrderLineVASInstruction implements Serializable
{

    @JsonProperty("Actions")
    private Actions_______________________ actions;
    @JsonProperty("CreatedBy")
    private String createdBy;
    @JsonProperty("CreatedTimestamp")
    private String createdTimestamp;
    @JsonProperty("Extended")
    private Extended_______________________ extended;
    @JsonProperty("OrgId")
    private String orgId;
    @JsonProperty("PK")
    private String pK;
    @JsonProperty("ParentOrderLine")
    private ParentOrderLine___ parentOrderLine;
    @JsonProperty("Translations")
    private Translations_____________________ translations;
    @JsonProperty("UpdatedBy")
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp")
    private String updatedTimestamp;
    @JsonProperty("VasInstructions")
    private String vasInstructions;
    @JsonProperty("VasOptionId")
    private String vasOptionId;
    @JsonProperty("VasTypeId")
    private String vasTypeId;
    @JsonProperty("entityName")
    private String entityName;
    @JsonProperty("messages")
    private Messages____________________ messages;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -4998735849653178135L;

    @JsonProperty("Actions")
    public Actions_______________________ getActions() {
        return actions;
    }

    @JsonProperty("Actions")
    public void setActions(Actions_______________________ actions) {
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
    public Extended_______________________ getExtended() {
        return extended;
    }

    @JsonProperty("Extended")
    public void setExtended(Extended_______________________ extended) {
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

    @JsonProperty("ParentOrderLine")
    public ParentOrderLine___ getParentOrderLine() {
        return parentOrderLine;
    }

    @JsonProperty("ParentOrderLine")
    public void setParentOrderLine(ParentOrderLine___ parentOrderLine) {
        this.parentOrderLine = parentOrderLine;
    }

    @JsonProperty("Translations")
    public Translations_____________________ getTranslations() {
        return translations;
    }

    @JsonProperty("Translations")
    public void setTranslations(Translations_____________________ translations) {
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

    @JsonProperty("VasInstructions")
    public String getVasInstructions() {
        return vasInstructions;
    }

    @JsonProperty("VasInstructions")
    public void setVasInstructions(String vasInstructions) {
        this.vasInstructions = vasInstructions;
    }

    @JsonProperty("VasOptionId")
    public String getVasOptionId() {
        return vasOptionId;
    }

    @JsonProperty("VasOptionId")
    public void setVasOptionId(String vasOptionId) {
        this.vasOptionId = vasOptionId;
    }

    @JsonProperty("VasTypeId")
    public String getVasTypeId() {
        return vasTypeId;
    }

    @JsonProperty("VasTypeId")
    public void setVasTypeId(String vasTypeId) {
        this.vasTypeId = vasTypeId;
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
    public Messages____________________ getMessages() {
        return messages;
    }

    @JsonProperty("messages")
    public void setMessages(Messages____________________ messages) {
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
