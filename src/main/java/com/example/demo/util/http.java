package com.example.demo.util;


import net.sf.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

public class http {

  private  RestTemplate restTemplate = new RestTemplate();
    public String doPost(String url, JSONObject jsonObject){
        String result1 = restTemplate.postForObject(url, jsonObject, String.class);
        //  一定要设置header

        return result1;

    }

    public  String doget(String url, JSONObject object){

      /*  //  一定要设置header
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON_UTF8);

        HttpEntity  requestEntity = new HttpEntity(object, headers);
*/
        String result1 = restTemplate.postForObject(url, object, String.class);
//  执行HTTP请求
         return result1;
    }
}
