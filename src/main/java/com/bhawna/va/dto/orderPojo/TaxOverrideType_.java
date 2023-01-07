
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
    "TaxOverrideTypeId"
})
public class TaxOverrideType_ implements Serializable
{

    @JsonProperty("TaxOverrideTypeId")
    private String taxOverrideTypeId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -800996963465692859L;

    @JsonProperty("TaxOverrideTypeId")
    public String getTaxOverrideTypeId() {
        return taxOverrideTypeId;
    }

    @JsonProperty("TaxOverrideTypeId")
    public void setTaxOverrideTypeId(String taxOverrideTypeId) {
        this.taxOverrideTypeId = taxOverrideTypeId;
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
