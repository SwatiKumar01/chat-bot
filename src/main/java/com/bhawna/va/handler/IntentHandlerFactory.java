package com.bhawna.va.handler;

import java.util.HashMap;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

import com.bhawna.calories.util.BeanProvider;

import ai.api.model.AIResponse;

@Component
@DependsOn(value = { "CabIntentHandler","PhoneDirectoryIntentHandler", "noWebHookIntentHandler", "defaultIntenthandler"})
public class IntentHandlerFactory {
    private static HashMap<String, IntentHandler> hashMap = new HashMap<String, IntentHandler>(6);
    
    @PostConstruct
    public void init(){
	hashMap.put("Cab", BeanProvider.getBean("CabIntentHandler", CabIntentHandler.class));
	//hashMap.put("Salesforce", BeanProvider.getBean("SalesForceIntentHandler", SalesForceIntentHandler.class));
	hashMap.put("ExtensionNumber", BeanProvider.getBean("PhoneDirectoryIntentHandler", PhoneDirectoryIntentHandler.class));
	hashMap.put("NoWebHookIntentHandler", BeanProvider.getBean("noWebHookIntentHandler", NoWebHookIntentHandler.class));
	hashMap.put("defaultIntent", BeanProvider.getBean("defaultIntenthandler", DefaultIntenthandler.class));
    }
    
    public IntentHandler getIntentHandler(AIResponse originalResponse){
	IntentHandler handler = hashMap.get(originalResponse.getResult().getAction());
	if(handler == null){
	    handler = hashMap.get("defaultIntenthandler");
	}
	return handler;
    }
    
    public IntentHandler getNoActionIntentHandler(){
	return BeanProvider.getBean("noWebHookIntentHandler", NoWebHookIntentHandler.class);
    }
}
