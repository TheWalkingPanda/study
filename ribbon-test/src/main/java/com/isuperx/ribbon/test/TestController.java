package com.isuperx.ribbon.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/5/31.
 */
@RestController
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping("/test")
    public String test () {
        return testService.test();
    }
}
