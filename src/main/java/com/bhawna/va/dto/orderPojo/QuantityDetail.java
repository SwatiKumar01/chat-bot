
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
    "ItemId",
    "OrgId",
    "PK",
    "Quantity",
    "QuantityDetailId",
    "Reason",
    "ReasonType",
    "Status",
    "StatusId",
    "SubstitutionRatio",
    "SubstitutionType",
    "Translations",
    "UOM",
    "UpdatedBy",
    "UpdatedTimestamp",
    "entityName",
    "messages"
})
public class QuantityDetail implements Serializable
{

    @JsonProperty("Actions")
    private Actions________________________ actions;
    @JsonProperty("CreatedBy")
    private String createdBy;
    @JsonProperty("CreatedTimestamp")
    private String createdTimestamp;
    @JsonProperty("Extended")
    private Extended________________________ extended;
    @JsonProperty("ItemId")
    private String itemId;
    @JsonProperty("OrgId")
    private String orgId;
    @JsonProperty("PK")
    private String pK;
    @JsonProperty("Quantity")
    private Integer quantity;
    @JsonProperty("QuantityDetailId")
    private String quantityDetailId;
    @JsonProperty("Reason")
    private Reason__ reason;
    @JsonProperty("ReasonType")
    private ReasonType reasonType;
    @JsonProperty("Status")
    private Status_ status;
    @JsonProperty("StatusId")
    private String statusId;
    @JsonProperty("SubstitutionRatio")
    private Integer substitutionRatio;
    @JsonProperty("SubstitutionType")
    private SubstitutionType substitutionType;
    @JsonProperty("Translations")
    private Translations______________________ translations;
    @JsonProperty("UOM")
    private String uOM;
    @JsonProperty("UpdatedBy")
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp")
    private String updatedTimestamp;
    @JsonProperty("entityName")
    private String entityName;
    @JsonProperty("messages")
    private Messages_____________________ messages;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 580652746062284767L;

    @JsonProperty("Actions")
    public Actions________________________ getActions() {
        return actions;
    }

    @JsonProperty("Actions")
    public void setActions(Actions________________________ actions) {
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
    public Extended________________________ getExtended() {
        return extended;
    }

    @JsonProperty("Extended")
    public void setExtended(Extended________________________ extended) {
        this.extended = extended;
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

    @JsonProperty("Quantity")
    public Integer getQuantity() {
        return quantity;
    }

    @JsonProperty("Quantity")
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("QuantityDetailId")
    public String getQuantityDetailId() {
        return quantityDetailId;
    }

    @JsonProperty("QuantityDetailId")
    public void setQuantityDetailId(String quantityDetailId) {
        this.quantityDetailId = quantityDetailId;
    }

    @JsonProperty("Reason")
    public Reason__ getReason() {
        return reason;
    }

    @JsonProperty("Reason")
    public void setReason(Reason__ reason) {
        this.reason = reason;
    }

    @JsonProperty("ReasonType")
    public ReasonType getReasonType() {
        return reasonType;
    }

    @JsonProperty("ReasonType")
    public void setReasonType(ReasonType reasonType) {
        this.reasonType = reasonType;
    }

    @JsonProperty("Status")
    public Status_ getStatus() {
        return status;
    }

    @JsonProperty("Status")
    public void setStatus(Status_ status) {
        this.status = status;
    }

    @JsonProperty("StatusId")
    public String getStatusId() {
        return statusId;
    }

    @JsonProperty("StatusId")
    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    @JsonProperty("SubstitutionRatio")
    public Integer getSubstitutionRatio() {
        return substitutionRatio;
    }

    @JsonProperty("SubstitutionRatio")
    public void setSubstitutionRatio(Integer substitutionRatio) {
        this.substitutionRatio = substitutionRatio;
    }

    @JsonProperty("SubstitutionType")
    public SubstitutionType getSubstitutionType() {
        return substitutionType;
    }

    @JsonProperty("SubstitutionType")
    public void setSubstitutionType(SubstitutionType substitutionType) {
        this.substitutionType = substitutionType;
    }

    @JsonProperty("Translations")
    public Translations______________________ getTranslations() {
        return translations;
    }

    @JsonProperty("Translations")
    public void setTranslations(Translations______________________ translations) {
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
    public Messages_____________________ getMessages() {
        return messages;
    }

    @JsonProperty("messages")
    public void setMessages(Messages_____________________ messages) {
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
