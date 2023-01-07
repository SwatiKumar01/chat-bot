package com.bhawna.va.handler;

import ai.api.model.AIResponse;

public interface IntentHandler {
    public AIResponse handleWebhookCall(AIResponse aiOriginalResponse);
}
