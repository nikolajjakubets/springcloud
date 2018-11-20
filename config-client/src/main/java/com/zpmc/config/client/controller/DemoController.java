package com.zpmc.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class DemoController {

    @Value("${content}")
	private String content;

	@GetMapping("/hello")
    public String hello() {
        return "Hello! Content is" + content;
    }
}
