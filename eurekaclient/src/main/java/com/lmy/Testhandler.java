package com.lmy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Testhandler {
    @Value("${server.port}")
    private int port;
    @RequestMapping("/index")
    public String load(){
        return "Hello World  端口号是"+port;
    }
}
