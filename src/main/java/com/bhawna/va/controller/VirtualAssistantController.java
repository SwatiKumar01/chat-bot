package com.bhawna.va.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import ai.api.model.AIRequest;
import ai.api.model.AIResponse;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.bhawna.va.dto.AIQueryRequest;
import com.bhawna.va.handler.IntentHandlerFactory;
import com.bhawna.va.loader.Loaders;
import com.bhawna.va.service.VAReqRespService;

@Component
@RestController

@RequestMapping("/virtualAssistant")
public class VirtualAssistantController
{

    @Autowired
    VAReqRespService VirtualAssistant;

    @Autowired
    Loaders load;

    @Autowired
    CheckAccessToken chkAccessToken;
    
    @Autowired
    IntentHandlerFactory intentHandlerFactory;



    @CrossOrigin
    @RequestMapping(value = "/getMessageFromVA/query", method = RequestMethod.POST)
    public ResponseEntity<?> getMessageFromAngular(@RequestParam("v") String version, @RequestBody AIQueryRequest aiQueryRequest, HttpServletRequest request)
    {
        String userQuery = aiQueryRequest.getQuery();
        AIRequest aiRequest = new AIRequest(userQuery);
        aiRequest.setSessionId(aiQueryRequest.getSessionId());
       
        AIResponse responseEdited = null;
        
        AIResponse aiResponse = VirtualAssistant.generat_accessToken(aiRequest);
        if("WebHook".equals(aiResponse.getResult().getFulfillment().getSpeech())){
            responseEdited = intentHandlerFactory.getIntentHandler(aiResponse).handleWebhookCall(aiResponse);
        }else{
            responseEdited = intentHandlerFactory.getNoActionIntentHandler().handleWebhookCall(aiResponse);
        }
        
       
        //load.loadAll(userQuery, VAresponse);
        return new ResponseEntity<AIResponse>(responseEdited, HttpStatus.ACCEPTED);
    }


    @RequestMapping(value = "/order/{id}", method = RequestMethod.GET  )
    public JsonObject getUser(@PathVariable("id") String id)
    {
        javax.net.ssl.HttpsURLConnection.setDefaultHostnameVerifier(new javax.net.ssl.HostnameVerifier()
        {
            public boolean verify(String hostname, javax.net.ssl.SSLSession sslSession)
            {
                if (hostname.equals("alvd-lmitbuildp05.manhdev.com"))
                {
                    return true;
                }
                return false;
            }
        });

        /*System.out.println("\nTesting getUser API----------");
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<String>  request = new HttpEntity<String> (getHeaders());
        ResponseEntity<OrderDTO> response = restTemplate.exchange(
                "https://alvd-lmitbuildp05.manhdev.com:8990/order/api/order/order/orderId/C000017930", HttpMethod.GET,
                request, OrderDTO.class);

        System.out.println(response);*/
        
        RestTemplate restTemplate = new RestTemplate(); 
        HttpHeaders headers = new HttpHeaders();
        
//        String base64ClientCredentials=getHeadersWithClientCredentials();
        String accessToken=chkAccessToken.getMessageFromAngular();
        System.out.println(accessToken);

        headers.add("Authorization", "Bearer " + accessToken);
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> request = new HttpEntity<String>(headers);
        ResponseEntity<String> responseBody = restTemplate.exchange("https://alvd-lmitbuildp05.manhdev.com:8990/order/api/order/order/orderId/C000017930", HttpMethod.GET, request, String.class);
        Gson gson = new Gson();
//        gson.fromJson(responseBody, JsonObject.class);
        JsonParser parser= new JsonParser();
        JsonObject json = (JsonObject)parser.parse(responseBody.getBody());
//        JsonData =json.isJsonObject();
        System.out.println(json.isJsonObject());
//        OrderDTO JsonData=response.getBody();
//        System.out.println(JsonData.getCurrencyCode());
//        return response.getBody();
        return json;
    }
}
