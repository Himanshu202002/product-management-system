package com.ms.Productms.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {

    @GetMapping("abcc")
    public String HealthCheck(){
        return "OK";
    }
}
