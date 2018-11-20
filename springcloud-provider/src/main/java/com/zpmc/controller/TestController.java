package com.zpmc.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author songqiang
 * @create 2018-11-20 13:46
 **/
@RestController
public class TestController {
    @Value("${demo.env}")
    String content;

    @Value("${server.port}")
    String port;

    @RequestMapping("/")
    public String home() {
        return "Hello world ,port:" + port + ",demo.env=" + content;
    }
}
