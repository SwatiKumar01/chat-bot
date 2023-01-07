
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
    "FulfillmentGroupId",
    "IsInformational",
    "IsInvoiceTax",
    "IsProrated",
    "Jurisdiction",
    "JurisdictionTypeId",
    "OrgId",
    "PK",
    "TaxAmount",
    "TaxCode",
    "TaxDate",
    "TaxDetailId",
    "TaxEngineId",
    "TaxRate",
    "TaxTypeId",
    "TaxableAmount",
    "Translations",
    "UpdatedBy",
    "UpdatedTimestamp",
    "entityName",
    "messages"
})
public class OrderTaxDetail implements Serializable
{

    @JsonProperty("Actions")
    private Actions______________________________ actions;
    @JsonProperty("CreatedBy")
    private String createdBy;
    @JsonProperty("CreatedTimestamp")
    private String createdTimestamp;
    @JsonProperty("Extended")
    private Extended______________________________ extended;
    @JsonProperty("FulfillmentGroupId")
    private String fulfillmentGroupId;
    @JsonProperty("IsInformational")
    private Boolean isInformational;
    @JsonProperty("IsInvoiceTax")
    private Boolean isInvoiceTax;
    @JsonProperty("IsProrated")
    private Boolean isProrated;
    @JsonProperty("Jurisdiction")
    private String jurisdiction;
    @JsonProperty("JurisdictionTypeId")
    private String jurisdictionTypeId;
    @JsonProperty("OrgId")
    private String orgId;
    @JsonProperty("PK")
    private String pK;
    @JsonProperty("TaxAmount")
    private Integer taxAmount;
    @JsonProperty("TaxCode")
    private String taxCode;
    @JsonProperty("TaxDate")
    private String taxDate;
    @JsonProperty("TaxDetailId")
    private String taxDetailId;
    @JsonProperty("TaxEngineId")
    private String taxEngineId;
    @JsonProperty("TaxRate")
    private Integer taxRate;
    @JsonProperty("TaxTypeId")
    private String taxTypeId;
    @JsonProperty("TaxableAmount")
    private Integer taxableAmount;
    @JsonProperty("Translations")
    private Translations_____________________________ translations;
    @JsonProperty("UpdatedBy")
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp")
    private String updatedTimestamp;
    @JsonProperty("entityName")
    private String entityName;
    @JsonProperty("messages")
    private Messages____________________________ messages;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 5859378953195377111L;

    @JsonProperty("Actions")
    public Actions______________________________ getActions() {
        return actions;
    }

    @JsonProperty("Actions")
    public void setActions(Actions______________________________ actions) {
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
    public Extended______________________________ getExtended() {
        return extended;
    }

    @JsonProperty("Extended")
    public void setExtended(Extended______________________________ extended) {
        this.extended = extended;
    }

    @JsonProperty("FulfillmentGroupId")
    public String getFulfillmentGroupId() {
        return fulfillmentGroupId;
    }

    @JsonProperty("FulfillmentGroupId")
    public void setFulfillmentGroupId(String fulfillmentGroupId) {
        this.fulfillmentGroupId = fulfillmentGroupId;
    }

    @JsonProperty("IsInformational")
    public Boolean getIsInformational() {
        return isInformational;
    }

    @JsonProperty("IsInformational")
    public void setIsInformational(Boolean isInformational) {
        this.isInformational = isInformational;
    }

    @JsonProperty("IsInvoiceTax")
    public Boolean getIsInvoiceTax() {
        return isInvoiceTax;
    }

    @JsonProperty("IsInvoiceTax")
    public void setIsInvoiceTax(Boolean isInvoiceTax) {
        this.isInvoiceTax = isInvoiceTax;
    }

    @JsonProperty("IsProrated")
    public Boolean getIsProrated() {
        return isProrated;
    }

    @JsonProperty("IsProrated")
    public void setIsProrated(Boolean isProrated) {
        this.isProrated = isProrated;
    }

    @JsonProperty("Jurisdiction")
    public String getJurisdiction() {
        return jurisdiction;
    }

    @JsonProperty("Jurisdiction")
    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    @JsonProperty("JurisdictionTypeId")
    public String getJurisdictionTypeId() {
        return jurisdictionTypeId;
    }

    @JsonProperty("JurisdictionTypeId")
    public void setJurisdictionTypeId(String jurisdictionTypeId) {
        this.jurisdictionTypeId = jurisdictionTypeId;
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

    @JsonProperty("TaxAmount")
    public Integer getTaxAmount() {
        return taxAmount;
    }

    @JsonProperty("TaxAmount")
    public void setTaxAmount(Integer taxAmount) {
        this.taxAmount = taxAmount;
    }

    @JsonProperty("TaxCode")
    public String getTaxCode() {
        return taxCode;
    }

    @JsonProperty("TaxCode")
    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    @JsonProperty("TaxDate")
    public String getTaxDate() {
        return taxDate;
    }

    @JsonProperty("TaxDate")
    public void setTaxDate(String taxDate) {
        this.taxDate = taxDate;
    }

    @JsonProperty("TaxDetailId")
    public String getTaxDetailId() {
        return taxDetailId;
    }

    @JsonProperty("TaxDetailId")
    public void setTaxDetailId(String taxDetailId) {
        this.taxDetailId = taxDetailId;
    }

    @JsonProperty("TaxEngineId")
    public String getTaxEngineId() {
        return taxEngineId;
    }

    @JsonProperty("TaxEngineId")
    public void setTaxEngineId(String taxEngineId) {
        this.taxEngineId = taxEngineId;
    }

    @JsonProperty("TaxRate")
    public Integer getTaxRate() {
        return taxRate;
    }

    @JsonProperty("TaxRate")
    public void setTaxRate(Integer taxRate) {
        this.taxRate = taxRate;
    }

    @JsonProperty("TaxTypeId")
    public String getTaxTypeId() {
        return taxTypeId;
    }

    @JsonProperty("TaxTypeId")
    public void setTaxTypeId(String taxTypeId) {
        this.taxTypeId = taxTypeId;
    }

    @JsonProperty("TaxableAmount")
    public Integer getTaxableAmount() {
        return taxableAmount;
    }

    @JsonProperty("TaxableAmount")
    public void setTaxableAmount(Integer taxableAmount) {
        this.taxableAmount = taxableAmount;
    }

    @JsonProperty("Translations")
    public Translations_____________________________ getTranslations() {
        return translations;
    }

    @JsonProperty("Translations")
    public void setTranslations(Translations_____________________________ translations) {
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
    public Messages____________________________ getMessages() {
        return messages;
    }

    @JsonProperty("messages")
    public void setMessages(Messages____________________________ messages) {
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
