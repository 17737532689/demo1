package com.example.demo.redis;

import com.example.demo.util.JedisTool;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
public class BookController {

    @Autowired
    private JedisTool je;
    @GetMapping("/test99")
    public void test1(){
     /*   ValueOperations<String, String> ops1 = stringRedisTemplate.opsForValue();
        ops1.set("name","三国");
        String name = ops1.get("name");
        log.info(name);*/

      je.set("a","2");
     je.set("b","3");


    }




}
