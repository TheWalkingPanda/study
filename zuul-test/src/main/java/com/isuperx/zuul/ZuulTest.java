package com.isuperx.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by Administrator on 2017/6/9.
 */
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class ZuulTest {
    public static void main(String[] args) {
        SpringApplication.run(ZuulTest.class, args);
    }
}
