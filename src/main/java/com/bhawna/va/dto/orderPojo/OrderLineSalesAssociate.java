
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
    "AssociateId",
    "AssociateType",
    "CreatedBy",
    "CreatedTimestamp",
    "Extended",
    "OrderLineSalesAssociateId",
    "OrgId",
    "PK",
    "ParentOrderLine",
    "Translations",
    "UpdatedBy",
    "UpdatedTimestamp",
    "entityName",
    "messages"
})
public class OrderLineSalesAssociate implements Serializable
{

    @JsonProperty("Actions")
    private Actions____________________ actions;
    @JsonProperty("AssociateId")
    private String associateId;
    @JsonProperty("AssociateType")
    private String associateType;
    @JsonProperty("CreatedBy")
    private String createdBy;
    @JsonProperty("CreatedTimestamp")
    private String createdTimestamp;
    @JsonProperty("Extended")
    private Extended____________________ extended;
    @JsonProperty("OrderLineSalesAssociateId")
    private String orderLineSalesAssociateId;
    @JsonProperty("OrgId")
    private String orgId;
    @JsonProperty("PK")
    private String pK;
    @JsonProperty("ParentOrderLine")
    private ParentOrderLine_ parentOrderLine;
    @JsonProperty("Translations")
    private Translations__________________ translations;
    @JsonProperty("UpdatedBy")
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp")
    private String updatedTimestamp;
    @JsonProperty("entityName")
    private String entityName;
    @JsonProperty("messages")
    private Messages_________________ messages;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -6426773334273501989L;

    @JsonProperty("Actions")
    public Actions____________________ getActions() {
        return actions;
    }

    @JsonProperty("Actions")
    public void setActions(Actions____________________ actions) {
        this.actions = actions;
    }

    @JsonProperty("AssociateId")
    public String getAssociateId() {
        return associateId;
    }

    @JsonProperty("AssociateId")
    public void setAssociateId(String associateId) {
        this.associateId = associateId;
    }

    @JsonProperty("AssociateType")
    public String getAssociateType() {
        return associateType;
    }

    @JsonProperty("AssociateType")
    public void setAssociateType(String associateType) {
        this.associateType = associateType;
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
    public Extended____________________ getExtended() {
        return extended;
    }

    @JsonProperty("Extended")
    public void setExtended(Extended____________________ extended) {
        this.extended = extended;
    }

    @JsonProperty("OrderLineSalesAssociateId")
    public String getOrderLineSalesAssociateId() {
        return orderLineSalesAssociateId;
    }

    @JsonProperty("OrderLineSalesAssociateId")
    public void setOrderLineSalesAssociateId(String orderLineSalesAssociateId) {
        this.orderLineSalesAssociateId = orderLineSalesAssociateId;
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
    public ParentOrderLine_ getParentOrderLine() {
        return parentOrderLine;
    }

    @JsonProperty("ParentOrderLine")
    public void setParentOrderLine(ParentOrderLine_ parentOrderLine) {
        this.parentOrderLine = parentOrderLine;
    }

    @JsonProperty("Translations")
    public Translations__________________ getTranslations() {
        return translations;
    }

    @JsonProperty("Translations")
    public void setTranslations(Translations__________________ translations) {
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
    public Messages_________________ getMessages() {
        return messages;
    }

    @JsonProperty("messages")
    public void setMessages(Messages_________________ messages) {
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
