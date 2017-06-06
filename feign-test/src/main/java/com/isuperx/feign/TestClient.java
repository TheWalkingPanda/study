package com.isuperx.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/6/1.
 */
@FeignClient(value = "testServer")
public interface TestClient {
    @RequestMapping("/test")
    String test ();
}
