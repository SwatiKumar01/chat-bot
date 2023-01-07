
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
    "ReturnTypeId"
})
public class ReturnType implements Serializable
{

    @JsonProperty("ReturnTypeId")
    private String returnTypeId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 4610867070475728182L;

    @JsonProperty("ReturnTypeId")
    public String getReturnTypeId() {
        return returnTypeId;
    }

    @JsonProperty("ReturnTypeId")
    public void setReturnTypeId(String returnTypeId) {
        this.returnTypeId = returnTypeId;
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