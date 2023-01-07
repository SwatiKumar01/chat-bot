
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
    "DeviceId",
    "Extended",
    "IsCancelled",
    "IsConfirmed",
    "IsReadyForTender",
    "OperatorId",
    "OrgId",
    "PK",
    "PostvoidSignature",
    "RegisterId",
    "SellingChannel",
    "TillId",
    "TransactionReferenceId",
    "TransactionType",
    "Translations",
    "UpdatedBy",
    "UpdatedTimestamp",
    "entityName",
    "messages"
})
public class TransactionReference implements Serializable
{

    @JsonProperty("Actions")
    private Actions______________________________________ actions;
    @JsonProperty("CreatedBy")
    private String createdBy;
    @JsonProperty("CreatedTimestamp")
    private String createdTimestamp;
    @JsonProperty("DeviceId")
    private String deviceId;
    @JsonProperty("Extended")
    private Extended______________________________________ extended;
    @JsonProperty("IsCancelled")
    private Boolean isCancelled;
    @JsonProperty("IsConfirmed")
    private Boolean isConfirmed;
    @JsonProperty("IsReadyForTender")
    private Boolean isReadyForTender;
    @JsonProperty("OperatorId")
    private String operatorId;
    @JsonProperty("OrgId")
    private String orgId;
    @JsonProperty("PK")
    private String pK;
    @JsonProperty("PostvoidSignature")
    private String postvoidSignature;
    @JsonProperty("RegisterId")
    private String registerId;
    @JsonProperty("SellingChannel")
    private SellingChannel_ sellingChannel;
    @JsonProperty("TillId")
    private String tillId;
    @JsonProperty("TransactionReferenceId")
    private String transactionReferenceId;
    @JsonProperty("TransactionType")
    private TransactionType transactionType;
    @JsonProperty("Translations")
    private Translations_____________________________________ translations;
    @JsonProperty("UpdatedBy")
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp")
    private String updatedTimestamp;
    @JsonProperty("entityName")
    private String entityName;
    @JsonProperty("messages")
    private Messages____________________________________ messages;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6889927169767066950L;

    @JsonProperty("Actions")
    public Actions______________________________________ getActions() {
        return actions;
    }

    @JsonProperty("Actions")
    public void setActions(Actions______________________________________ actions) {
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

    @JsonProperty("DeviceId")
    public String getDeviceId() {
        return deviceId;
    }

    @JsonProperty("DeviceId")
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    @JsonProperty("Extended")
    public Extended______________________________________ getExtended() {
        return extended;
    }

    @JsonProperty("Extended")
    public void setExtended(Extended______________________________________ extended) {
        this.extended = extended;
    }

    @JsonProperty("IsCancelled")
    public Boolean getIsCancelled() {
        return isCancelled;
    }

    @JsonProperty("IsCancelled")
    public void setIsCancelled(Boolean isCancelled) {
        this.isCancelled = isCancelled;
    }

    @JsonProperty("IsConfirmed")
    public Boolean getIsConfirmed() {
        return isConfirmed;
    }

    @JsonProperty("IsConfirmed")
    public void setIsConfirmed(Boolean isConfirmed) {
        this.isConfirmed = isConfirmed;
    }

    @JsonProperty("IsReadyForTender")
    public Boolean getIsReadyForTender() {
        return isReadyForTender;
    }

    @JsonProperty("IsReadyForTender")
    public void setIsReadyForTender(Boolean isReadyForTender) {
        this.isReadyForTender = isReadyForTender;
    }

    @JsonProperty("OperatorId")
    public String getOperatorId() {
        return operatorId;
    }

    @JsonProperty("OperatorId")
    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
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

    @JsonProperty("PostvoidSignature")
    public String getPostvoidSignature() {
        return postvoidSignature;
    }

    @JsonProperty("PostvoidSignature")
    public void setPostvoidSignature(String postvoidSignature) {
        this.postvoidSignature = postvoidSignature;
    }

    @JsonProperty("RegisterId")
    public String getRegisterId() {
        return registerId;
    }

    @JsonProperty("RegisterId")
    public void setRegisterId(String registerId) {
        this.registerId = registerId;
    }

    @JsonProperty("SellingChannel")
    public SellingChannel_ getSellingChannel() {
        return sellingChannel;
    }

    @JsonProperty("SellingChannel")
    public void setSellingChannel(SellingChannel_ sellingChannel) {
        this.sellingChannel = sellingChannel;
    }

    @JsonProperty("TillId")
    public String getTillId() {
        return tillId;
    }

    @JsonProperty("TillId")
    public void setTillId(String tillId) {
        this.tillId = tillId;
    }

    @JsonProperty("TransactionReferenceId")
    public String getTransactionReferenceId() {
        return transactionReferenceId;
    }

    @JsonProperty("TransactionReferenceId")
    public void setTransactionReferenceId(String transactionReferenceId) {
        this.transactionReferenceId = transactionReferenceId;
    }

    @JsonProperty("TransactionType")
    public TransactionType getTransactionType() {
        return transactionType;
    }

    @JsonProperty("TransactionType")
    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    @JsonProperty("Translations")
    public Translations_____________________________________ getTranslations() {
        return translations;
    }

    @JsonProperty("Translations")
    public void setTranslations(Translations_____________________________________ translations) {
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
    public Messages____________________________________ getMessages() {
        return messages;
    }

    @JsonProperty("messages")
    public void setMessages(Messages____________________________________ messages) {
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
