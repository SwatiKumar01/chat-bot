
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
    "DisplaySequence",
    "Extended",
    "IsVisible",
    "NoteCategory",
    "NoteId",
    "NoteText",
    "NoteType",
    "OrgId",
    "PK",
    "Translations",
    "UpdatedBy",
    "UpdatedTimestamp",
    "entityName",
    "messages"
})
public class OrderNote implements Serializable
{

    @JsonProperty("Actions")
    private Actions____________________________ actions;
    @JsonProperty("CreatedBy")
    private String createdBy;
    @JsonProperty("CreatedTimestamp")
    private String createdTimestamp;
    @JsonProperty("DisplaySequence")
    private Integer displaySequence;
    @JsonProperty("Extended")
    private Extended____________________________ extended;
    @JsonProperty("IsVisible")
    private Boolean isVisible;
    @JsonProperty("NoteCategory")
    private NoteCategory_ noteCategory;
    @JsonProperty("NoteId")
    private String noteId;
    @JsonProperty("NoteText")
    private String noteText;
    @JsonProperty("NoteType")
    private NoteType_ noteType;
    @JsonProperty("OrgId")
    private String orgId;
    @JsonProperty("PK")
    private String pK;
    @JsonProperty("Translations")
    private Translations___________________________ translations;
    @JsonProperty("UpdatedBy")
    private String updatedBy;
    @JsonProperty("UpdatedTimestamp")
    private String updatedTimestamp;
    @JsonProperty("entityName")
    private String entityName;
    @JsonProperty("messages")
    private Messages__________________________ messages;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 5927329483713505239L;

    @JsonProperty("Actions")
    public Actions____________________________ getActions() {
        return actions;
    }

    @JsonProperty("Actions")
    public void setActions(Actions____________________________ actions) {
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

    @JsonProperty("DisplaySequence")
    public Integer getDisplaySequence() {
        return displaySequence;
    }

    @JsonProperty("DisplaySequence")
    public void setDisplaySequence(Integer displaySequence) {
        this.displaySequence = displaySequence;
    }

    @JsonProperty("Extended")
    public Extended____________________________ getExtended() {
        return extended;
    }

    @JsonProperty("Extended")
    public void setExtended(Extended____________________________ extended) {
        this.extended = extended;
    }

    @JsonProperty("IsVisible")
    public Boolean getIsVisible() {
        return isVisible;
    }

    @JsonProperty("IsVisible")
    public void setIsVisible(Boolean isVisible) {
        this.isVisible = isVisible;
    }

    @JsonProperty("NoteCategory")
    public NoteCategory_ getNoteCategory() {
        return noteCategory;
    }

    @JsonProperty("NoteCategory")
    public void setNoteCategory(NoteCategory_ noteCategory) {
        this.noteCategory = noteCategory;
    }

    @JsonProperty("NoteId")
    public String getNoteId() {
        return noteId;
    }

    @JsonProperty("NoteId")
    public void setNoteId(String noteId) {
        this.noteId = noteId;
    }

    @JsonProperty("NoteText")
    public String getNoteText() {
        return noteText;
    }

    @JsonProperty("NoteText")
    public void setNoteText(String noteText) {
        this.noteText = noteText;
    }

    @JsonProperty("NoteType")
    public NoteType_ getNoteType() {
        return noteType;
    }

    @JsonProperty("NoteType")
    public void setNoteType(NoteType_ noteType) {
        this.noteType = noteType;
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

    @JsonProperty("Translations")
    public Translations___________________________ getTranslations() {
        return translations;
    }

    @JsonProperty("Translations")
    public void setTranslations(Translations___________________________ translations) {
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
    public Messages__________________________ getMessages() {
        return messages;
    }

    @JsonProperty("messages")
    public void setMessages(Messages__________________________ messages) {
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
