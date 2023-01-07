package com.bhawna.va.service;


import java.util.Arrays;

import org.junit.Assert;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bhawna.va.constant.Constant;
import com.bhawna.va.dto.orderPojo.OrderDTO;

import ai.api.AIConfiguration;
import ai.api.AIDataService;
import ai.api.model.AIRequest;
import ai.api.model.AIResponse;

@Service
public class VAReqRespService {

    public static final String REST_SERVICE_URI = "https://alvd-lmitbuildp05.manhdev.com:10191";
    
    public static final String AUTH_SERVER_URI = "https://alvd-lmitbuildp05.manhdev.com:10191/oauth/token";
     
    public static final String QPM_PASSWORD_GRANT = "?grant_type=password&username=maitest@vss.com&password=password";
     
    public static final String QPM_ACCESS_TOKEN = "?access_token=";
    
	public AIResponse generat_accessToken(AIRequest request) {

		//AIConfiguration:  Create configuration with given client access token and language.
		AIConfiguration configuration = new AIConfiguration(Constant.ACCESS_TOKEN_API_AI);
		//AIDataService: Do simple requests to the AI Service. 
		AIDataService dataService = new AIDataService(configuration);
		AIResponse response = null;
		try {
			response = dataService.request(request);

			if (response.getStatus().getCode() == 200) {
				System.out.println(response.getResult().getFulfillment().getSpeech());
				
			} else {
				System.err.println(response.getStatus().getErrorDetails());
			}
			//		System.out.println(VA_response);
			//
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	
		return response;
	}
	
//	public String getElasticSearchresponse(String query) {
//		String elasticResponse="";
//		RestTemplate restTemplate = new RestTemplate();
//        String q/uote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", null, null);
//    //    log.info(quote.toString());
//		return elasticResponse;
//	}
//	

	 private static HttpHeaders getHeaders(){
	        HttpHeaders headers = new HttpHeaders();
	        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	        return headers;
	    }

   private static void getUser(){
        String tokenInfo="eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyT3JncyI6WyJ2c3MtdXMiXSwidXNlcl9uYW1lIjoibWFpdGVzdDJAdnNzLXVzLmNvbSIsInNjb3BlIjpbIm9tbmkiLCJjb21wb25lbnQiXSwib3JnYW5pemF0aW9uIjoidnNzLXVzIiwidXNlckxvY2F0aW9ucyI6W10sImV4cCI6MTUxNjc0MjAxMywibG9jYWxlIjoiZW4iLCJhdXRob3JpdGllcyI6WyJST0xFX1N5c3RlbUFkbWluIiwiUk9MRV9VU0VSIl0sImp0aSI6IjViYjc3YmNmLWM4YmMtNDIxZC05ZjU2LWYxYzVmODg1NDZmMiIsImNsaWVudF9pZCI6Im9tbmljb21wb25lbnQuMS4wLjAiLCJ1c2VyVGltZVpvbmUiOm51bGx9.XOnDSqmaP8Ju7ZhbDY0Rxr9avOOJvsIn_UoLXmbAIb-yt900PasHcNyWWUfySdME4HJmr49aiGFAKdyuG9LKWvDJsGErswiE-DCHcf4CHMxNpKJraXRSUGreFKXpiYK6B4R8drOtlrA84BFAzdSn0XhO7081eahi7YXgXFQkjDJ5c5UAFb6LpbjSvnhf49XCHoWUzKvaZiDUp5wq5TktbaqYlwvYCn_I9FnXiWLywM_MpAzlJjpyrfCWwIDEi3eVxf1gQJb_qUhwRyruRYeNX1vokxtUJaXdPMS4uzyIgEnY1skSjn2p605-MA8aEOfUzKoOz6TzSGu6CCHf-cBeqA";
        Assert.assertNotNull("Authenticate first please......", tokenInfo);
        System.out.println("\nTesting getUser API----------");
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<String> request = new HttpEntity<String>(getHeaders());
        ResponseEntity<OrderDTO> response = restTemplate.exchange(REST_SERVICE_URI+"/user/1"+QPM_ACCESS_TOKEN+tokenInfo, HttpMethod.GET, request,  OrderDTO.class);
        OrderDTO item = response.getBody();
        System.out.println(item);
    }
	
    
   
	
}
