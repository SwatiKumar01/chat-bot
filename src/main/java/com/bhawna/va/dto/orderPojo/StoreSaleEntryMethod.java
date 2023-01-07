
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
    "StoreSaleEntryMethodId"
})
public class StoreSaleEntryMethod implements Serializable
{

    @JsonProperty("StoreSaleEntryMethodId")
    private String storeSaleEntryMethodId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -1091739433632076658L;

    @JsonProperty("StoreSaleEntryMethodId")
    public String getStoreSaleEntryMethodId() {
        return storeSaleEntryMethodId;
    }

    @JsonProperty("StoreSaleEntryMethodId")
    public void setStoreSaleEntryMethodId(String storeSaleEntryMethodId) {
        this.storeSaleEntryMethodId = storeSaleEntryMethodId;
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
