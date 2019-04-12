package com.lmy.service;

import org.springframework.stereotype.Component;

@Component
public class apiServiceError implements apiService {
    @Override
    public String index() {
        return "服务器发生故障";
    }
}
