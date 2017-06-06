package com.isuperx.ribbon.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2017/5/31.
 */
@Service
public class TestService {

    @Autowired
    private RestTemplate restTemplate;

    public String test () {
        return restTemplate.getForObject("http://testServer/test", String.class);
    }

}
