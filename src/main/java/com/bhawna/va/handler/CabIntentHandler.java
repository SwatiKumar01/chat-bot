package com.bhawna.va.handler;

import org.springframework.stereotype.Component;

import ai.api.model.AIResponse;
import ai.api.model.Fulfillment;
import ai.api.model.Result;

@Component("CabIntentHandler")
public class CabIntentHandler implements IntentHandler{

    @Override
    public AIResponse handleWebhookCall(AIResponse aiOriginalResponse) {
	AIResponse editedAiResponse = new AIResponse();
	editedAiResponse.setResult(new Result());
	editedAiResponse.getResult().setFulfillment(new Fulfillment());
	String response = "Webhook action: " +aiOriginalResponse.getResult().getAction()+ " Not available. we are working on it.";
	editedAiResponse.getResult().getFulfillment().setSpeech(response);
	editedAiResponse.getResult().getFulfillment().setDisplayText(response);
	return editedAiResponse;
    }

}
