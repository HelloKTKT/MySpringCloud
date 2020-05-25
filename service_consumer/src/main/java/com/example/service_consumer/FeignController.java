package com.example.service_consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class FeignController {

    @Autowired
    private ProService proService;

    @RequestMapping("/hello2")
    public String hello(){
        System.out.println("服务提供者接口");

        //返回值类型和我们的业务返回值一致
        return proService.pro();
    }
}
