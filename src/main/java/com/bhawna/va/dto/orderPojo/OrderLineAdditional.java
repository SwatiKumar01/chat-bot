
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
    "EligibleForReturnReason",
    "EligibleForReturnReasonComment",
    "Extended",
    "IsConditionVariance",
    "IsItemVariance",
    "ItemCondition",
    "ItemDisposition",
    "OrgId",
    "PK",
    "PriceOverrideComments",
    "PriceOverrideReason",
    "PriceOverrideReasonId",
    "ReturnApprovalComments",
    "ReturnApprovalReason",
    "ReturnReason",
    "TaxOverrideReason",
    "TaxOverrideReasonId",
    "Translations",
    "UpdatedBy",
    "UpdatedTimestamp",
    "VarianceQuantity",
    "entityName",
    "messages"
})
public class OrderLineAdditional implements Serializable
{

    @JsonProperty("Actions")
    private Actions________ actions;
    @JsonProperty("CreatedBy")
    private String createdBy;
    @JsonProperty("CreatedTimestamp")
    private String createdTimestamp;
    @JsonProperty("EligibleForReturnReason")
    private EligibleForReturnReason eligibleForReturnReason;
    @JsonProperty("EligibleForReturnReasonComment")
    private String eligibleForReturnReasonComment;
    @JsonProperty("Extended")
    private Extended________ extended;
    @JsonProperty("IsConditionVariance")
    private Boolean isConditionVariance;
    @JsonProperty("IsItemVariance")
    private Boolean isItemVariance;
    @JsonProperty("ItemCondition")
    private ItemCondition itemCondition;
    @JsonProperty("ItemDisposition")
    private String itemDisposition;
    @JsonProperty("OrgId")
    private String orgId;
    @JsonProperty("PK")
    private String pK;
    @JsonProperty("PriceOverrideComments")
    private String priceOverrideComments;
    @JsonProperty("PriceOverrideReason")
    private PriceOverrideReason priceOverrideReason;
    @JsonProperty("PriceOverrideReasonId")
    private String priceOverrideReasonId;
    @JsonProperty("ReturnApprovalComments")
    private String returnApprovalComments;
    @JsonProperty("ReturnApprovalReason")
    private ReturnApprovalReason returnApprovalReason;
    @JsonProperty("ReturnReason")
    private String returnReason;
    @JsonProperty("TaxOverrideReason")
    private TaxOverrideReason taxOverrideReason;
    @JsonProperty("TaxOverrideReasonId")
    private String taxOverrideReasonId;
    @JsonProperty("Translations")
    private Translations______ translations;
    @JsonProperty("UpdatedBy")
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp")
    private String updatedTimestamp;
    @JsonProperty("VarianceQuantity")
    private Integer varianceQuantity;
    @JsonProperty("entityName")
    private String entityName;
    @JsonProperty("messages")
    private Messages_____ messages;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 3137237720279995750L;

    @JsonProperty("Actions")
    public Actions________ getActions() {
        return actions;
    }

    @JsonProperty("Actions")
    public void setActions(Actions________ actions) {
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

    @JsonProperty("EligibleForReturnReason")
    public EligibleForReturnReason getEligibleForReturnReason() {
        return eligibleForReturnReason;
    }

    @JsonProperty("EligibleForReturnReason")
    public void setEligibleForReturnReason(EligibleForReturnReason eligibleForReturnReason) {
        this.eligibleForReturnReason = eligibleForReturnReason;
    }

    @JsonProperty("EligibleForReturnReasonComment")
    public String getEligibleForReturnReasonComment() {
        return eligibleForReturnReasonComment;
    }

    @JsonProperty("EligibleForReturnReasonComment")
    public void setEligibleForReturnReasonComment(String eligibleForReturnReasonComment) {
        this.eligibleForReturnReasonComment = eligibleForReturnReasonComment;
    }

    @JsonProperty("Extended")
    public Extended________ getExtended() {
        return extended;
    }

    @JsonProperty("Extended")
    public void setExtended(Extended________ extended) {
        this.extended = extended;
    }

    @JsonProperty("IsConditionVariance")
    public Boolean getIsConditionVariance() {
        return isConditionVariance;
    }

    @JsonProperty("IsConditionVariance")
    public void setIsConditionVariance(Boolean isConditionVariance) {
        this.isConditionVariance = isConditionVariance;
    }

    @JsonProperty("IsItemVariance")
    public Boolean getIsItemVariance() {
        return isItemVariance;
    }

    @JsonProperty("IsItemVariance")
    public void setIsItemVariance(Boolean isItemVariance) {
        this.isItemVariance = isItemVariance;
    }

    @JsonProperty("ItemCondition")
    public ItemCondition getItemCondition() {
        return itemCondition;
    }

    @JsonProperty("ItemCondition")
    public void setItemCondition(ItemCondition itemCondition) {
        this.itemCondition = itemCondition;
    }

    @JsonProperty("ItemDisposition")
    public String getItemDisposition() {
        return itemDisposition;
    }

    @JsonProperty("ItemDisposition")
    public void setItemDisposition(String itemDisposition) {
        this.itemDisposition = itemDisposition;
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

    @JsonProperty("PriceOverrideComments")
    public String getPriceOverrideComments() {
        return priceOverrideComments;
    }

    @JsonProperty("PriceOverrideComments")
    public void setPriceOverrideComments(String priceOverrideComments) {
        this.priceOverrideComments = priceOverrideComments;
    }

    @JsonProperty("PriceOverrideReason")
    public PriceOverrideReason getPriceOverrideReason() {
        return priceOverrideReason;
    }

    @JsonProperty("PriceOverrideReason")
    public void setPriceOverrideReason(PriceOverrideReason priceOverrideReason) {
        this.priceOverrideReason = priceOverrideReason;
    }

    @JsonProperty("PriceOverrideReasonId")
    public String getPriceOverrideReasonId() {
        return priceOverrideReasonId;
    }

    @JsonProperty("PriceOverrideReasonId")
    public void setPriceOverrideReasonId(String priceOverrideReasonId) {
        this.priceOverrideReasonId = priceOverrideReasonId;
    }

    @JsonProperty("ReturnApprovalComments")
    public String getReturnApprovalComments() {
        return returnApprovalComments;
    }

    @JsonProperty("ReturnApprovalComments")
    public void setReturnApprovalComments(String returnApprovalComments) {
        this.returnApprovalComments = returnApprovalComments;
    }

    @JsonProperty("ReturnApprovalReason")
    public ReturnApprovalReason getReturnApprovalReason() {
        return returnApprovalReason;
    }

    @JsonProperty("ReturnApprovalReason")
    public void setReturnApprovalReason(ReturnApprovalReason returnApprovalReason) {
        this.returnApprovalReason = returnApprovalReason;
    }

    @JsonProperty("ReturnReason")
    public String getReturnReason() {
        return returnReason;
    }

    @JsonProperty("ReturnReason")
    public void setReturnReason(String returnReason) {
        this.returnReason = returnReason;
    }

    @JsonProperty("TaxOverrideReason")
    public TaxOverrideReason getTaxOverrideReason() {
        return taxOverrideReason;
    }

    @JsonProperty("TaxOverrideReason")
    public void setTaxOverrideReason(TaxOverrideReason taxOverrideReason) {
        this.taxOverrideReason = taxOverrideReason;
    }

    @JsonProperty("TaxOverrideReasonId")
    public String getTaxOverrideReasonId() {
        return taxOverrideReasonId;
    }

    @JsonProperty("TaxOverrideReasonId")
    public void setTaxOverrideReasonId(String taxOverrideReasonId) {
        this.taxOverrideReasonId = taxOverrideReasonId;
    }

    @JsonProperty("Translations")
    public Translations______ getTranslations() {
        return translations;
    }

    @JsonProperty("Translations")
    public void setTranslations(Translations______ translations) {
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

    @JsonProperty("VarianceQuantity")
    public Integer getVarianceQuantity() {
        return varianceQuantity;
    }

    @JsonProperty("VarianceQuantity")
    public void setVarianceQuantity(Integer varianceQuantity) {
        this.varianceQuantity = varianceQuantity;
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
    public Messages_____ getMessages() {
        return messages;
    }

    @JsonProperty("messages")
    public void setMessages(Messages_____ messages) {
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
