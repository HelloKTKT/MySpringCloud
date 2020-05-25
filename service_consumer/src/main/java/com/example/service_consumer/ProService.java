package com.example.service_consumer;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="service-provider",fallback = ProServiceImpl.class)
public interface ProService {

    @GetMapping("/pro")
    String pro();
}
