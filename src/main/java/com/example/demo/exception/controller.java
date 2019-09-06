package com.example.demo.exception;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.attribute.UserPrincipalNotFoundException;

@RestController
public class controller {
    @RequestMapping(value = "/test1", method = RequestMethod.GET)
    public R testE() throws R {
        try {
            int i = 10 / 0;
         return R.ok();
        } catch (Exception e) {
           // throw new R(e.getMessage());
            return R.error(e.getMessage());
        }
    }
}
