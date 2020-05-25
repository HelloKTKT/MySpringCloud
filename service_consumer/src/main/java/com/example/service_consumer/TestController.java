package com.example.service_consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

//    @Autowired
//    private RestTemplate resttemplate;
//
//    @RequestMapping("/hello")
//    public String hello(){
//        //指出服务地址   http://{服务提供者应用名名称}/{具体的controller}
//        System.out.println("服务提供者接口");
//        String url="http://service-provider/pro";
//
//        //返回值类型和我们的业务返回值一致
//        return resttemplate.getForObject(url, String.class);
//    }

}
