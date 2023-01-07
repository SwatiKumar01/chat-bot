
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
    "SubstitutionTypeId"
})
public class SubstitutionType implements Serializable
{

    @JsonProperty("SubstitutionTypeId")
    private String substitutionTypeId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 7519855986104655505L;

    @JsonProperty("SubstitutionTypeId")
    public String getSubstitutionTypeId() {
        return substitutionTypeId;
    }

    @JsonProperty("SubstitutionTypeId")
    public void setSubstitutionTypeId(String substitutionTypeId) {
        this.substitutionTypeId = substitutionTypeId;
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
