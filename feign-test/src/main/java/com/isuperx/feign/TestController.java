package com.isuperx.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/6/1.
 */
@RestController
public class TestController {

    @Autowired
    private TestClient testClient;

    @RequestMapping("/test")
    public String test () {
        return testClient.test();
    }

}
