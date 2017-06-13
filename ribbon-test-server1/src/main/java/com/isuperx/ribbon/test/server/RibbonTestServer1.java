package com.isuperx.ribbon.test.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/5/31.
 */
@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class RibbonTestServer1 {
    public static void main(String[] args) {
        SpringApplication.run(RibbonTestServer1.class, args);
    }

    @RequestMapping("/test")
    public String test () {
        return "test server 1";
    }
}
