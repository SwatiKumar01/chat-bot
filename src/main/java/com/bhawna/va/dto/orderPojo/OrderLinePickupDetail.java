
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
    "Email",
    "Extended",
    "FirstName",
    "IsPrimary",
    "LastName",
    "OrderLinePickupDetailId",
    "OrgId",
    "PK",
    "ParentOrderLine",
    "Phone",
    "PickupEndDate",
    "PickupStartDate",
    "PreferredContactMethod",
    "Translations",
    "UpdatedBy",
    "UpdatedTimestamp",
    "entityName",
    "messages"
})
public class OrderLinePickupDetail implements Serializable
{

    @JsonProperty("Actions")
    private Actions________________ actions;
    @JsonProperty("CreatedBy")
    private String createdBy;
    @JsonProperty("CreatedTimestamp")
    private String createdTimestamp;
    @JsonProperty("Email")
    private String email;
    @JsonProperty("Extended")
    private Extended________________ extended;
    @JsonProperty("FirstName")
    private String firstName;
    @JsonProperty("IsPrimary")
    private Boolean isPrimary;
    @JsonProperty("LastName")
    private String lastName;
    @JsonProperty("OrderLinePickupDetailId")
    private String orderLinePickupDetailId;
    @JsonProperty("OrgId")
    private String orgId;
    @JsonProperty("PK")
    private String pK;
    @JsonProperty("ParentOrderLine")
    private ParentOrderLine parentOrderLine;
    @JsonProperty("Phone")
    private String phone;
    @JsonProperty("PickupEndDate")
    private String pickupEndDate;
    @JsonProperty("PickupStartDate")
    private String pickupStartDate;
    @JsonProperty("PreferredContactMethod")
    private String preferredContactMethod;
    @JsonProperty("Translations")
    private Translations______________ translations;
    @JsonProperty("UpdatedBy")
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp")
    private String updatedTimestamp;
    @JsonProperty("entityName")
    private String entityName;
    @JsonProperty("messages")
    private Messages_____________ messages;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 8214374112861213660L;

    @JsonProperty("Actions")
    public Actions________________ getActions() {
        return actions;
    }

    @JsonProperty("Actions")
    public void setActions(Actions________________ actions) {
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

    @JsonProperty("Email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("Email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("Extended")
    public Extended________________ getExtended() {
        return extended;
    }

    @JsonProperty("Extended")
    public void setExtended(Extended________________ extended) {
        this.extended = extended;
    }

    @JsonProperty("FirstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("FirstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("IsPrimary")
    public Boolean getIsPrimary() {
        return isPrimary;
    }

    @JsonProperty("IsPrimary")
    public void setIsPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
    }

    @JsonProperty("LastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("LastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("OrderLinePickupDetailId")
    public String getOrderLinePickupDetailId() {
        return orderLinePickupDetailId;
    }

    @JsonProperty("OrderLinePickupDetailId")
    public void setOrderLinePickupDetailId(String orderLinePickupDetailId) {
        this.orderLinePickupDetailId = orderLinePickupDetailId;
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
    public ParentOrderLine getParentOrderLine() {
        return parentOrderLine;
    }

    @JsonProperty("ParentOrderLine")
    public void setParentOrderLine(ParentOrderLine parentOrderLine) {
        this.parentOrderLine = parentOrderLine;
    }

    @JsonProperty("Phone")
    public String getPhone() {
        return phone;
    }

    @JsonProperty("Phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @JsonProperty("PickupEndDate")
    public String getPickupEndDate() {
        return pickupEndDate;
    }

    @JsonProperty("PickupEndDate")
    public void setPickupEndDate(String pickupEndDate) {
        this.pickupEndDate = pickupEndDate;
    }

    @JsonProperty("PickupStartDate")
    public String getPickupStartDate() {
        return pickupStartDate;
    }

    @JsonProperty("PickupStartDate")
    public void setPickupStartDate(String pickupStartDate) {
        this.pickupStartDate = pickupStartDate;
    }

    @JsonProperty("PreferredContactMethod")
    public String getPreferredContactMethod() {
        return preferredContactMethod;
    }

    @JsonProperty("PreferredContactMethod")
    public void setPreferredContactMethod(String preferredContactMethod) {
        this.preferredContactMethod = preferredContactMethod;
    }

    @JsonProperty("Translations")
    public Translations______________ getTranslations() {
        return translations;
    }

    @JsonProperty("Translations")
    public void setTranslations(Translations______________ translations) {
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
    public Messages_____________ getMessages() {
        return messages;
    }

    @JsonProperty("messages")
    public void setMessages(Messages_____________ messages) {
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
