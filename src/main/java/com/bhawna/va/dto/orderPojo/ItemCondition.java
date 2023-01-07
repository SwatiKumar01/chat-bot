
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
    "ItemConditionId"
})
public class ItemCondition implements Serializable
{

    @JsonProperty("ItemConditionId")
    private String itemConditionId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 999627977982035372L;

    @JsonProperty("ItemConditionId")
    public String getItemConditionId() {
        return itemConditionId;
    }

    @JsonProperty("ItemConditionId")
    public void setItemConditionId(String itemConditionId) {
        this.itemConditionId = itemConditionId;
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
