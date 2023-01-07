package com.bhawna.va.controller;

import org.apache.commons.codec.binary.Base64;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.bhawna.va.dto.Auth;

@Component
@RestController
@RequestMapping("/virtualAssistant1/getAccessToken")
public class CheckAccessToken
{


    private static String getHeadersWithClientCredentials(){
        String plainClientCredentials="omnicomponent.1.0.0:b4s8rgTyg55XYNun";
        String base64ClientCredentials = new String(Base64.encodeBase64(plainClientCredentials.getBytes()));
        return base64ClientCredentials;
    }  
    
    
//    @CrossOrigin
//    @RequestMapping(value = "/getAccessTokenMsg", method = RequestMethod.GET)
    public String getMessageFromAngular()
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


        
        RestTemplate restTemplate = new RestTemplate(); 
        HttpHeaders headers = new HttpHeaders();
        String base64ClientCredentials=getHeadersWithClientCredentials();
        headers.add("Authorization", "Basic " + base64ClientCredentials);
        HttpEntity<String> request = new HttpEntity<String>(headers);
        ResponseEntity<Auth> response = restTemplate.exchange("https://alvd-lmitbuildp05.manhdev.com:10191/oauth/token?grant_type=password&username=maitest@vss-us.com&password=maitestpassword", HttpMethod.POST, request, Auth.class);
//  System.out.println(response.getBody());
//  String JsonData=response.getBody();
               
        final String myaccessToken=response.getBody().getAccessToken();
        System.out.println(myaccessToken);
        return myaccessToken;
    }
}
