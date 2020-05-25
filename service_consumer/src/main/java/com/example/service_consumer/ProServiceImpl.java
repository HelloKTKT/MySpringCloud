package com.example.service_consumer;

import org.springframework.stereotype.Component;

@Component
public class ProServiceImpl implements ProService {
    @Override
    public String pro() {
        return "服务挂了";
    }
}
