package com.bhawna.va.dto;

import java.io.Serializable;

public class AIQueryResponse implements Serializable
{
    /**
     * 
     */
    private static final long serialVersionUID = -492875469283601209L;
    private String text;
    private String aiSessionID;
    public String getText()
    {
        return text;
    }
    public void setText(String text)
    {
        this.text = text;
    }
    public String getAiSessionID()
    {
        return aiSessionID;
    }
    public void setAiSessionID(String aiSessionID)
    {
        this.aiSessionID = aiSessionID;
    }
    
    
    
    
    
    
}
