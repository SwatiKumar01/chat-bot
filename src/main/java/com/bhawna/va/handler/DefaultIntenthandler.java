package com.bhawna.va.handler;

import org.springframework.stereotype.Component;

import ai.api.model.AIResponse;
import ai.api.model.Fulfillment;
import ai.api.model.Result;

@Component("defaultIntenthandler")
public class DefaultIntenthandler implements IntentHandler{

    @Override
    public AIResponse handleWebhookCall(AIResponse aiOriginalResponse) {
	AIResponse editedAiResponse = new AIResponse();
	editedAiResponse.setResult(new Result());
	editedAiResponse.getResult().setFulfillment(new Fulfillment());
	String response = aiOriginalResponse.getResult().getFulfillment().getSpeech();
	editedAiResponse.getResult().getFulfillment().setSpeech(response);
	editedAiResponse.getResult().getFulfillment().setDisplayText(response);
	return editedAiResponse;
    }

}
