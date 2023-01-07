package com.bhawna.va.handler;

import org.springframework.stereotype.Component;

import ai.api.model.AIResponse;

@Component("PhoneDirectoryIntentHandler")
public class PhoneDirectoryIntentHandler implements IntentHandler{

    @Override
    public AIResponse handleWebhookCall(AIResponse aiOriginalResponse) {
	return null;
    }

}
