
package com.bhawna.va.dto.orderPojo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
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
    "CalculatedValues",
    "CarrierCode",
    "CreatedBy",
    "CreatedTimestamp",
    "DeliveryMethodId",
    "DestinationAction",
    "EffectiveRank",
    "Extended",
    "OrgId",
    "PK",
    "ReleaseId",
    "ReleaseLine",
    "ReleaseType",
    "ServiceLevelCode",
    "ShipFromLocationId",
    "ShipToLocationId",
    "ShipViaId",
    "Translations",
    "UpdatedBy",
    "UpdatedTimestamp",
    "entityName",
    "messages"
})
public class Release implements Serializable
{

    @JsonProperty("Actions")
    private Actions________________________________ actions;
    @JsonProperty("CalculatedValues")
    private CalculatedValues____ calculatedValues;
    @JsonProperty("CarrierCode")
    private String carrierCode;
    @JsonProperty("CreatedBy")
    private String createdBy;
    @JsonProperty("CreatedTimestamp")
    private String createdTimestamp;
    @JsonProperty("DeliveryMethodId")
    private String deliveryMethodId;
    @JsonProperty("DestinationAction")
    private String destinationAction;
    @JsonProperty("EffectiveRank")
    private String effectiveRank;
    @JsonProperty("Extended")
    private Extended________________________________ extended;
    @JsonProperty("OrgId")
    private String orgId;
    @JsonProperty("PK")
    private String pK;
    @JsonProperty("ReleaseId")
    private String releaseId;
    @JsonProperty("ReleaseLine")
    private List<ReleaseLine> releaseLine = null;
    @JsonProperty("ReleaseType")
    private String releaseType;
    @JsonProperty("ServiceLevelCode")
    private String serviceLevelCode;
    @JsonProperty("ShipFromLocationId")
    private String shipFromLocationId;
    @JsonProperty("ShipToLocationId")
    private String shipToLocationId;
    @JsonProperty("ShipViaId")
    private String shipViaId;
    @JsonProperty("Translations")
    private Translations________________________________ translations;
    @JsonProperty("UpdatedBy")
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp")
    private String updatedTimestamp;
    @JsonProperty("entityName")
    private String entityName;
    @JsonProperty("messages")
    private Messages_______________________________ messages;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 7302056228545220241L;

    @JsonProperty("Actions")
    public Actions________________________________ getActions() {
        return actions;
    }

    @JsonProperty("Actions")
    public void setActions(Actions________________________________ actions) {
        this.actions = actions;
    }

    @JsonProperty("CalculatedValues")
    public CalculatedValues____ getCalculatedValues() {
        return calculatedValues;
    }

    @JsonProperty("CalculatedValues")
    public void setCalculatedValues(CalculatedValues____ calculatedValues) {
        this.calculatedValues = calculatedValues;
    }

    @JsonProperty("CarrierCode")
    public String getCarrierCode() {
        return carrierCode;
    }

    @JsonProperty("CarrierCode")
    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
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

    @JsonProperty("DeliveryMethodId")
    public String getDeliveryMethodId() {
        return deliveryMethodId;
    }

    @JsonProperty("DeliveryMethodId")
    public void setDeliveryMethodId(String deliveryMethodId) {
        this.deliveryMethodId = deliveryMethodId;
    }

    @JsonProperty("DestinationAction")
    public String getDestinationAction() {
        return destinationAction;
    }

    @JsonProperty("DestinationAction")
    public void setDestinationAction(String destinationAction) {
        this.destinationAction = destinationAction;
    }

    @JsonProperty("EffectiveRank")
    public String getEffectiveRank() {
        return effectiveRank;
    }

    @JsonProperty("EffectiveRank")
    public void setEffectiveRank(String effectiveRank) {
        this.effectiveRank = effectiveRank;
    }

    @JsonProperty("Extended")
    public Extended________________________________ getExtended() {
        return extended;
    }

    @JsonProperty("Extended")
    public void setExtended(Extended________________________________ extended) {
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

    @JsonProperty("ReleaseId")
    public String getReleaseId() {
        return releaseId;
    }

    @JsonProperty("ReleaseId")
    public void setReleaseId(String releaseId) {
        this.releaseId = releaseId;
    }

    @JsonProperty("ReleaseLine")
    public List<ReleaseLine> getReleaseLine() {
        return releaseLine;
    }

    @JsonProperty("ReleaseLine")
    public void setReleaseLine(List<ReleaseLine> releaseLine) {
        this.releaseLine = releaseLine;
    }

    @JsonProperty("ReleaseType")
    public String getReleaseType() {
        return releaseType;
    }

    @JsonProperty("ReleaseType")
    public void setReleaseType(String releaseType) {
        this.releaseType = releaseType;
    }

    @JsonProperty("ServiceLevelCode")
    public String getServiceLevelCode() {
        return serviceLevelCode;
    }

    @JsonProperty("ServiceLevelCode")
    public void setServiceLevelCode(String serviceLevelCode) {
        this.serviceLevelCode = serviceLevelCode;
    }

    @JsonProperty("ShipFromLocationId")
    public String getShipFromLocationId() {
        return shipFromLocationId;
    }

    @JsonProperty("ShipFromLocationId")
    public void setShipFromLocationId(String shipFromLocationId) {
        this.shipFromLocationId = shipFromLocationId;
    }

    @JsonProperty("ShipToLocationId")
    public String getShipToLocationId() {
        return shipToLocationId;
    }

    @JsonProperty("ShipToLocationId")
    public void setShipToLocationId(String shipToLocationId) {
        this.shipToLocationId = shipToLocationId;
    }

    @JsonProperty("ShipViaId")
    public String getShipViaId() {
        return shipViaId;
    }

    @JsonProperty("ShipViaId")
    public void setShipViaId(String shipViaId) {
        this.shipViaId = shipViaId;
    }

    @JsonProperty("Translations")
    public Translations________________________________ getTranslations() {
        return translations;
    }

    @JsonProperty("Translations")
    public void setTranslations(Translations________________________________ translations) {
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
    public Messages_______________________________ getMessages() {
        return messages;
    }

    @JsonProperty("messages")
    public void setMessages(Messages_______________________________ messages) {
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
