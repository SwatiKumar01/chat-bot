
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
    "Tag",
    "Translations",
    "UpdatedBy",
    "UpdatedTimestamp",
    "entityName",
    "messages"
})
public class OrderLineTagDetail implements Serializable
{

    @JsonProperty("Actions")
    private Actions_____________________ actions;
    @JsonProperty("CreatedBy")
    private String createdBy;
    @JsonProperty("CreatedTimestamp")
    private String createdTimestamp;
    @JsonProperty("Extended")
    private Extended_____________________ extended;
    @JsonProperty("OrgId")
    private String orgId;
    @JsonProperty("PK")
    private String pK;
    @JsonProperty("ParentOrderLine")
    private ParentOrderLine__ parentOrderLine;
    @JsonProperty("Tag")
    private String tag;
    @JsonProperty("Translations")
    private Translations___________________ translations;
    @JsonProperty("UpdatedBy")
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp")
    private String updatedTimestamp;
    @JsonProperty("entityName")
    private String entityName;
    @JsonProperty("messages")
    private Messages__________________ messages;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -2095692154024631355L;

    @JsonProperty("Actions")
    public Actions_____________________ getActions() {
        return actions;
    }

    @JsonProperty("Actions")
    public void setActions(Actions_____________________ actions) {
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
    public Extended_____________________ getExtended() {
        return extended;
    }

    @JsonProperty("Extended")
    public void setExtended(Extended_____________________ extended) {
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
    public ParentOrderLine__ getParentOrderLine() {
        return parentOrderLine;
    }

    @JsonProperty("ParentOrderLine")
    public void setParentOrderLine(ParentOrderLine__ parentOrderLine) {
        this.parentOrderLine = parentOrderLine;
    }

    @JsonProperty("Tag")
    public String getTag() {
        return tag;
    }

    @JsonProperty("Tag")
    public void setTag(String tag) {
        this.tag = tag;
    }

    @JsonProperty("Translations")
    public Translations___________________ getTranslations() {
        return translations;
    }

    @JsonProperty("Translations")
    public void setTranslations(Translations___________________ translations) {
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
    public Messages__________________ getMessages() {
        return messages;
    }

    @JsonProperty("messages")
    public void setMessages(Messages__________________ messages) {
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
