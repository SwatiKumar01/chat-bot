
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
    "Message",
    "Size"
})
public class Messages_____________ implements Serializable
{

    @JsonProperty("Message")
    private List<Message_____________> message = null;
    @JsonProperty("Size")
    private Integer size;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -6229145642366411718L;

    @JsonProperty("Message")
    public List<Message_____________> getMessage() {
        return message;
    }

    @JsonProperty("Message")
    public void setMessage(List<Message_____________> message) {
        this.message = message;
    }

    @JsonProperty("Size")
    public Integer getSize() {
        return size;
    }

    @JsonProperty("Size")
    public void setSize(Integer size) {
        this.size = size;
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