
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
    "TransactionReferenceTypeId"
})
public class TransactionType implements Serializable
{

    @JsonProperty("TransactionReferenceTypeId")
    private String transactionReferenceTypeId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 4056028570726300615L;

    @JsonProperty("TransactionReferenceTypeId")
    public String getTransactionReferenceTypeId() {
        return transactionReferenceTypeId;
    }

    @JsonProperty("TransactionReferenceTypeId")
    public void setTransactionReferenceTypeId(String transactionReferenceTypeId) {
        this.transactionReferenceTypeId = transactionReferenceTypeId;
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