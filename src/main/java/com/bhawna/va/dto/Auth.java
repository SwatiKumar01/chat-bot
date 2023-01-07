
package com.bhawna.va.dto;

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
@JsonPropertyOrder({ "access_token", "token_type", "refresh_token", "expires_in", "scope", "userOrgs", "organization",
        "userLocations", "locale", "userTimeZone", "jti" })
public class Auth implements Serializable
{

    @JsonProperty("access_token")
    private String accessToken;

    @JsonProperty("token_type")
    private String tokenType;

    @JsonProperty("refresh_token")
    private String refreshToken;

    @JsonProperty("expires_in")
    private Integer expiresIn;

    @JsonProperty("scope")
    private String scope;

    @JsonProperty("organization")
    private String organization;

    @JsonProperty("userLocations")
    private List<Object> userLocations = null;

    @JsonProperty("locale")
    private String locale;

    @JsonProperty("userTimeZone")
    private Object userTimeZone;

    @JsonProperty("jti")
    private String jti;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    private final static long serialVersionUID = -4427190146115303015L;

    @JsonProperty("access_token")
    public String getAccessToken()
    {
        return accessToken;
    }

    @JsonProperty("access_token")
    public void setAccessToken(String accessToken)
    {
        this.accessToken = accessToken;
    }

    @JsonProperty("token_type")
    public String getTokenType()
    {
        return tokenType;
    }

    @JsonProperty("token_type")
    public void setTokenType(String tokenType)
    {
        this.tokenType = tokenType;
    }

    @JsonProperty("refresh_token")
    public String getRefreshToken()
    {
        return refreshToken;
    }

    @JsonProperty("refresh_token")
    public void setRefreshToken(String refreshToken)
    {
        this.refreshToken = refreshToken;
    }

    @JsonProperty("expires_in")
    public Integer getExpiresIn()
    {
        return expiresIn;
    }

    @JsonProperty("expires_in")
    public void setExpiresIn(Integer expiresIn)
    {
        this.expiresIn = expiresIn;
    }

    @JsonProperty("scope")
    public String getScope()
    {
        return scope;
    }

    @JsonProperty("scope")
    public void setScope(String scope)
    {
        this.scope = scope;
    }

    @JsonProperty("organization")
    public String getOrganization()
    {
        return organization;
    }

    @JsonProperty("organization")
    public void setOrganization(String organization)
    {
        this.organization = organization;
    }

    @JsonProperty("userLocations")
    public List<Object> getUserLocations()
    {
        return userLocations;
    }

    @JsonProperty("userLocations")
    public void setUserLocations(List<Object> userLocations)
    {
        this.userLocations = userLocations;
    }

    @JsonProperty("locale")
    public String getLocale()
    {
        return locale;
    }

    @JsonProperty("locale")
    public void setLocale(String locale)
    {
        this.locale = locale;
    }

    @JsonProperty("userTimeZone")
    public Object getUserTimeZone()
    {
        return userTimeZone;
    }

    @JsonProperty("userTimeZone")
    public void setUserTimeZone(Object userTimeZone)
    {
        this.userTimeZone = userTimeZone;
    }

    @JsonProperty("jti")
    public String getJti()
    {
        return jti;
    }

    @JsonProperty("jti")
    public void setJti(String jti)
    {
        this.jti = jti;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties()
    {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value)
    {
        this.additionalProperties.put(name, value);
    }

}
