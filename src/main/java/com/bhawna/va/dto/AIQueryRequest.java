package com.bhawna.va.dto;

import java.io.Serializable;

public class AIQueryRequest implements Serializable
{
    /**
     * 
     */
    private static final long serialVersionUID = -492875469283601209L;
    private String query;
    private String sessionId;
    public String getQuery()
    {
        return query;
    }
    public void setQuery(String query)
    {
        this.query = query;
    }
    public String getSessionId()
    {
        return sessionId;
    }
    public void setSessionId(String sessionId)
    {
        this.sessionId = sessionId;
    }
}
