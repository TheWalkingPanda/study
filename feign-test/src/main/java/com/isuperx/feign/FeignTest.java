package com.isuperx.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by Administrator on 2017/6/1.
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class FeignTest {
    public static void main(String[] args) {
        SpringApplication.run(FeignTest.class, args);
    }
}
