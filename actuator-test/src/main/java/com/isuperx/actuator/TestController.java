package com.isuperx.actuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/5/23.
 */
@RestController
@SpringBootApplication
public class TestController {
    public static void main(String[] args) {
        SpringApplication.run(TestController.class, args);
    }

    @RequestMapping("/test")
    public String test () {
        return "test";
    }
}
