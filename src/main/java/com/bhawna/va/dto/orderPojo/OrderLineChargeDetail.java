
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
    "ChargeDetailId",
    "ChargeDisplayName",
    "ChargePercent",
    "ChargeReferenceId",
    "ChargeSequence",
    "ChargeTotal",
    "ChargeType",
    "Comments",
    "CreatedBy",
    "CreatedTimestamp",
    "DiscountOn",
    "Extended",
    "FulfillmentGroupId",
    "HeaderChargeDetailId",
    "IsInformational",
    "IsLineDiscount",
    "IsOverridden",
    "IsProratedAtSameLevel",
    "IsReturnCharge",
    "IsTaxIncluded",
    "OrgId",
    "OriginalChargeAmount",
    "PK",
    "ParentChargeDetailId",
    "Reason",
    "RelatedChargeDetailId",
    "RelatedChargeType",
    "RelatedOrderLineId",
    "RequestedAmount",
    "TaxCode",
    "TaxableAmount",
    "Translations",
    "UnitCharge",
    "UpdatedBy",
    "UpdatedTimestamp",
    "entityName",
    "messages"
})
public class OrderLineChargeDetail implements Serializable
{

    @JsonProperty("Actions")
    private Actions___________ actions;
    @JsonProperty("ChargeDetailId")
    private String chargeDetailId;
    @JsonProperty("ChargeDisplayName")
    private String chargeDisplayName;
    @JsonProperty("ChargePercent")
    private Integer chargePercent;
    @JsonProperty("ChargeReferenceId")
    private String chargeReferenceId;
    @JsonProperty("ChargeSequence")
    private Integer chargeSequence;
    @JsonProperty("ChargeTotal")
    private Integer chargeTotal;
    @JsonProperty("ChargeType")
    private ChargeType chargeType;
    @JsonProperty("Comments")
    private String comments;
    @JsonProperty("CreatedBy")
    private String createdBy;
    @JsonProperty("CreatedTimestamp")
    private String createdTimestamp;
    @JsonProperty("DiscountOn")
    private DiscountOn discountOn;
    @JsonProperty("Extended")
    private Extended___________ extended;
    @JsonProperty("FulfillmentGroupId")
    private String fulfillmentGroupId;
    @JsonProperty("HeaderChargeDetailId")
    private String headerChargeDetailId;
    @JsonProperty("IsInformational")
    private Boolean isInformational;
    @JsonProperty("IsLineDiscount")
    private Boolean isLineDiscount;
    @JsonProperty("IsOverridden")
    private Boolean isOverridden;
    @JsonProperty("IsProratedAtSameLevel")
    private Boolean isProratedAtSameLevel;
    @JsonProperty("IsReturnCharge")
    private Boolean isReturnCharge;
    @JsonProperty("IsTaxIncluded")
    private Boolean isTaxIncluded;
    @JsonProperty("OrgId")
    private String orgId;
    @JsonProperty("OriginalChargeAmount")
    private Integer originalChargeAmount;
    @JsonProperty("PK")
    private String pK;
    @JsonProperty("ParentChargeDetailId")
    private String parentChargeDetailId;
    @JsonProperty("Reason")
    private Reason reason;
    @JsonProperty("RelatedChargeDetailId")
    private String relatedChargeDetailId;
    @JsonProperty("RelatedChargeType")
    private String relatedChargeType;
    @JsonProperty("RelatedOrderLineId")
    private String relatedOrderLineId;
    @JsonProperty("RequestedAmount")
    private Integer requestedAmount;
    @JsonProperty("TaxCode")
    private String taxCode;
    @JsonProperty("TaxableAmount")
    private Integer taxableAmount;
    @JsonProperty("Translations")
    private Translations_________ translations;
    @JsonProperty("UnitCharge")
    private Integer unitCharge;
    @JsonProperty("UpdatedBy")
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp")
    private String updatedTimestamp;
    @JsonProperty("entityName")
    private String entityName;
    @JsonProperty("messages")
    private Messages________ messages;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 2539776060233709425L;

    @JsonProperty("Actions")
    public Actions___________ getActions() {
        return actions;
    }

    @JsonProperty("Actions")
    public void setActions(Actions___________ actions) {
        this.actions = actions;
    }

    @JsonProperty("ChargeDetailId")
    public String getChargeDetailId() {
        return chargeDetailId;
    }

    @JsonProperty("ChargeDetailId")
    public void setChargeDetailId(String chargeDetailId) {
        this.chargeDetailId = chargeDetailId;
    }

    @JsonProperty("ChargeDisplayName")
    public String getChargeDisplayName() {
        return chargeDisplayName;
    }

    @JsonProperty("ChargeDisplayName")
    public void setChargeDisplayName(String chargeDisplayName) {
        this.chargeDisplayName = chargeDisplayName;
    }

    @JsonProperty("ChargePercent")
    public Integer getChargePercent() {
        return chargePercent;
    }

    @JsonProperty("ChargePercent")
    public void setChargePercent(Integer chargePercent) {
        this.chargePercent = chargePercent;
    }

    @JsonProperty("ChargeReferenceId")
    public String getChargeReferenceId() {
        return chargeReferenceId;
    }

    @JsonProperty("ChargeReferenceId")
    public void setChargeReferenceId(String chargeReferenceId) {
        this.chargeReferenceId = chargeReferenceId;
    }

    @JsonProperty("ChargeSequence")
    public Integer getChargeSequence() {
        return chargeSequence;
    }

    @JsonProperty("ChargeSequence")
    public void setChargeSequence(Integer chargeSequence) {
        this.chargeSequence = chargeSequence;
    }

    @JsonProperty("ChargeTotal")
    public Integer getChargeTotal() {
        return chargeTotal;
    }

    @JsonProperty("ChargeTotal")
    public void setChargeTotal(Integer chargeTotal) {
        this.chargeTotal = chargeTotal;
    }

    @JsonProperty("ChargeType")
    public ChargeType getChargeType() {
        return chargeType;
    }

    @JsonProperty("ChargeType")
    public void setChargeType(ChargeType chargeType) {
        this.chargeType = chargeType;
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

    @JsonProperty("DiscountOn")
    public DiscountOn getDiscountOn() {
        return discountOn;
    }

    @JsonProperty("DiscountOn")
    public void setDiscountOn(DiscountOn discountOn) {
        this.discountOn = discountOn;
    }

    @JsonProperty("Extended")
    public Extended___________ getExtended() {
        return extended;
    }

    @JsonProperty("Extended")
    public void setExtended(Extended___________ extended) {
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

    @JsonProperty("HeaderChargeDetailId")
    public String getHeaderChargeDetailId() {
        return headerChargeDetailId;
    }

    @JsonProperty("HeaderChargeDetailId")
    public void setHeaderChargeDetailId(String headerChargeDetailId) {
        this.headerChargeDetailId = headerChargeDetailId;
    }

    @JsonProperty("IsInformational")
    public Boolean getIsInformational() {
        return isInformational;
    }

    @JsonProperty("IsInformational")
    public void setIsInformational(Boolean isInformational) {
        this.isInformational = isInformational;
    }

    @JsonProperty("IsLineDiscount")
    public Boolean getIsLineDiscount() {
        return isLineDiscount;
    }

    @JsonProperty("IsLineDiscount")
    public void setIsLineDiscount(Boolean isLineDiscount) {
        this.isLineDiscount = isLineDiscount;
    }

    @JsonProperty("IsOverridden")
    public Boolean getIsOverridden() {
        return isOverridden;
    }

    @JsonProperty("IsOverridden")
    public void setIsOverridden(Boolean isOverridden) {
        this.isOverridden = isOverridden;
    }

    @JsonProperty("IsProratedAtSameLevel")
    public Boolean getIsProratedAtSameLevel() {
        return isProratedAtSameLevel;
    }

    @JsonProperty("IsProratedAtSameLevel")
    public void setIsProratedAtSameLevel(Boolean isProratedAtSameLevel) {
        this.isProratedAtSameLevel = isProratedAtSameLevel;
    }

    @JsonProperty("IsReturnCharge")
    public Boolean getIsReturnCharge() {
        return isReturnCharge;
    }

    @JsonProperty("IsReturnCharge")
    public void setIsReturnCharge(Boolean isReturnCharge) {
        this.isReturnCharge = isReturnCharge;
    }

    @JsonProperty("IsTaxIncluded")
    public Boolean getIsTaxIncluded() {
        return isTaxIncluded;
    }

    @JsonProperty("IsTaxIncluded")
    public void setIsTaxIncluded(Boolean isTaxIncluded) {
        this.isTaxIncluded = isTaxIncluded;
    }

    @JsonProperty("OrgId")
    public String getOrgId() {
        return orgId;
    }

    @JsonProperty("OrgId")
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    @JsonProperty("OriginalChargeAmount")
    public Integer getOriginalChargeAmount() {
        return originalChargeAmount;
    }

    @JsonProperty("OriginalChargeAmount")
    public void setOriginalChargeAmount(Integer originalChargeAmount) {
        this.originalChargeAmount = originalChargeAmount;
    }

    @JsonProperty("PK")
    public String getPK() {
        return pK;
    }

    @JsonProperty("PK")
    public void setPK(String pK) {
        this.pK = pK;
    }

    @JsonProperty("ParentChargeDetailId")
    public String getParentChargeDetailId() {
        return parentChargeDetailId;
    }

    @JsonProperty("ParentChargeDetailId")
    public void setParentChargeDetailId(String parentChargeDetailId) {
        this.parentChargeDetailId = parentChargeDetailId;
    }

    @JsonProperty("Reason")
    public Reason getReason() {
        return reason;
    }

    @JsonProperty("Reason")
    public void setReason(Reason reason) {
        this.reason = reason;
    }

    @JsonProperty("RelatedChargeDetailId")
    public String getRelatedChargeDetailId() {
        return relatedChargeDetailId;
    }

    @JsonProperty("RelatedChargeDetailId")
    public void setRelatedChargeDetailId(String relatedChargeDetailId) {
        this.relatedChargeDetailId = relatedChargeDetailId;
    }

    @JsonProperty("RelatedChargeType")
    public String getRelatedChargeType() {
        return relatedChargeType;
    }

    @JsonProperty("RelatedChargeType")
    public void setRelatedChargeType(String relatedChargeType) {
        this.relatedChargeType = relatedChargeType;
    }

    @JsonProperty("RelatedOrderLineId")
    public String getRelatedOrderLineId() {
        return relatedOrderLineId;
    }

    @JsonProperty("RelatedOrderLineId")
    public void setRelatedOrderLineId(String relatedOrderLineId) {
        this.relatedOrderLineId = relatedOrderLineId;
    }

    @JsonProperty("RequestedAmount")
    public Integer getRequestedAmount() {
        return requestedAmount;
    }

    @JsonProperty("RequestedAmount")
    public void setRequestedAmount(Integer requestedAmount) {
        this.requestedAmount = requestedAmount;
    }

    @JsonProperty("TaxCode")
    public String getTaxCode() {
        return taxCode;
    }

    @JsonProperty("TaxCode")
    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
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
    public Translations_________ getTranslations() {
        return translations;
    }

    @JsonProperty("Translations")
    public void setTranslations(Translations_________ translations) {
        this.translations = translations;
    }

    @JsonProperty("UnitCharge")
    public Integer getUnitCharge() {
        return unitCharge;
    }

    @JsonProperty("UnitCharge")
    public void setUnitCharge(Integer unitCharge) {
        this.unitCharge = unitCharge;
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
    public Messages________ getMessages() {
        return messages;
    }

    @JsonProperty("messages")
    public void setMessages(Messages________ messages) {
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
