package com.example.service_provider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${server.port}")
    String port;

    @GetMapping("/pro")
    public String findUser() {
        System.out.println("服务提供者接口:"+port);
        return "服务提供者接口:"+port;
    }
}
