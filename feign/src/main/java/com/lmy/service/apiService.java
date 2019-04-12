package com.lmy.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "eurekaclient",fallback = apiServiceError.class)
public interface apiService {
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    String index();
}
