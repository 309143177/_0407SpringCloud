package com.lmy.handler;

import com.lmy.service.apiService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class Apihandler {
    @Resource
    private apiService apiService;
    @RequestMapping
    public String index(){
        return apiService.index();
    }
}
