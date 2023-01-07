
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
    "StoreProfileTypeId"
})
public class VolumetricWeightUOM implements Serializable
{

    @JsonProperty("StoreProfileTypeId")
    private String storeProfileTypeId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -4818816300339080372L;

    @JsonProperty("StoreProfileTypeId")
    public String getStoreProfileTypeId() {
        return storeProfileTypeId;
    }

    @JsonProperty("StoreProfileTypeId")
    public void setStoreProfileTypeId(String storeProfileTypeId) {
        this.storeProfileTypeId = storeProfileTypeId;
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
