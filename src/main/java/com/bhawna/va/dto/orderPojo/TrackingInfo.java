
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
    "CarrierCode",
    "CreatedBy",
    "CreatedTimestamp",
    "Extended",
    "OrgId",
    "PK",
    "PackageStatus",
    "ScheduledDate",
    "TrackingDetail",
    "TrackingNumber",
    "Translations",
    "UpdatedBy",
    "UpdatedTimestamp",
    "entityName",
    "messages"
})
public class TrackingInfo implements Serializable
{

    @JsonProperty("Actions")
    private Actions____________________________________ actions;
    @JsonProperty("CarrierCode")
    private String carrierCode;
    @JsonProperty("CreatedBy")
    private String createdBy;
    @JsonProperty("CreatedTimestamp")
    private String createdTimestamp;
    @JsonProperty("Extended")
    private Extended____________________________________ extended;
    @JsonProperty("OrgId")
    private String orgId;
    @JsonProperty("PK")
    private String pK;
    @JsonProperty("PackageStatus")
    private PackageStatus packageStatus;
    @JsonProperty("ScheduledDate")
    private String scheduledDate;
    @JsonProperty("TrackingDetail")
    private List<TrackingDetail> trackingDetail = null;
    @JsonProperty("TrackingNumber")
    private String trackingNumber;
    @JsonProperty("Translations")
    private Translations____________________________________ translations;
    @JsonProperty("UpdatedBy")
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp")
    private String updatedTimestamp;
    @JsonProperty("entityName")
    private String entityName;
    @JsonProperty("messages")
    private Messages___________________________________ messages;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 3977804236731028242L;

    @JsonProperty("Actions")
    public Actions____________________________________ getActions() {
        return actions;
    }

    @JsonProperty("Actions")
    public void setActions(Actions____________________________________ actions) {
        this.actions = actions;
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

    @JsonProperty("Extended")
    public Extended____________________________________ getExtended() {
        return extended;
    }

    @JsonProperty("Extended")
    public void setExtended(Extended____________________________________ extended) {
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

    @JsonProperty("PackageStatus")
    public PackageStatus getPackageStatus() {
        return packageStatus;
    }

    @JsonProperty("PackageStatus")
    public void setPackageStatus(PackageStatus packageStatus) {
        this.packageStatus = packageStatus;
    }

    @JsonProperty("ScheduledDate")
    public String getScheduledDate() {
        return scheduledDate;
    }

    @JsonProperty("ScheduledDate")
    public void setScheduledDate(String scheduledDate) {
        this.scheduledDate = scheduledDate;
    }

    @JsonProperty("TrackingDetail")
    public List<TrackingDetail> getTrackingDetail() {
        return trackingDetail;
    }

    @JsonProperty("TrackingDetail")
    public void setTrackingDetail(List<TrackingDetail> trackingDetail) {
        this.trackingDetail = trackingDetail;
    }

    @JsonProperty("TrackingNumber")
    public String getTrackingNumber() {
        return trackingNumber;
    }

    @JsonProperty("TrackingNumber")
    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    @JsonProperty("Translations")
    public Translations____________________________________ getTranslations() {
        return translations;
    }

    @JsonProperty("Translations")
    public void setTranslations(Translations____________________________________ translations) {
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
    public Messages___________________________________ getMessages() {
        return messages;
    }

    @JsonProperty("messages")
    public void setMessages(Messages___________________________________ messages) {
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
