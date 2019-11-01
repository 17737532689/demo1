package com.example.demo.redis;


import com.example.demo.util.JedisTool;
import com.example.demo.vo.VUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin(origins = "*", maxAge = 3600)
@Slf4j
@RestController
public class BookController {

    @Autowired
    private JedisTool je;
    //调用接口
   @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/test99")
    public String test1(String a){
             return a;
    }


    @GetMapping("/test88")
    public  void test2(){
        String url="http://localhost:8088/test88";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        VUser user = new VUser();
        user.setName("sfd");
        user.setAge(10);
        System.out.println(user);
        HttpEntity<VUser> requestEntity = new HttpEntity<VUser>(user, headers);
        System.out.println("re"+requestEntity);
        ResponseEntity<String> responseEntity = restTemplate.postForEntity(url,requestEntity,String.class);
        System.out.println("pon"+responseEntity);
        HttpHeaders headers1 = responseEntity.getHeaders();
        System.out.println("头部"+headers1);
        System.out.println("值"+responseEntity.getBody());
    }
}
