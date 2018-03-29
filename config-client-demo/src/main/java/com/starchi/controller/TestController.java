package com.starchi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author junchi
 * @date 2018/3/26 下午3:16
 */
@RestController
@RefreshScope
public class TestController {

    @Value("${my-config}")
    private String name;

    @RequestMapping("/getName")
    public String getAppName() {
        return name;
    }
}
