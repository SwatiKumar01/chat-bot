
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
    "RefundPaymentMethodId"
})
public class RefundPaymentMethod implements Serializable
{

    @JsonProperty("RefundPaymentMethodId")
    private String refundPaymentMethodId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -6031627861281246898L;

    @JsonProperty("RefundPaymentMethodId")
    public String getRefundPaymentMethodId() {
        return refundPaymentMethodId;
    }

    @JsonProperty("RefundPaymentMethodId")
    public void setRefundPaymentMethodId(String refundPaymentMethodId) {
        this.refundPaymentMethodId = refundPaymentMethodId;
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
