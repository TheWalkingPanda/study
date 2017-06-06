package com.isuperx.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/5/22.
 */
@RestController
@RefreshScope
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigClient2Application {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClient2Application.class, args);
    }

    @Value("${key}")
    private String key;

    @RequestMapping("/config-client2/key")
    public String test () {
        return key;
    }
}
