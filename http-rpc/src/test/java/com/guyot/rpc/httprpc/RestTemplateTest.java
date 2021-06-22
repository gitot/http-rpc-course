package com.guyot.rpc.httprpc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class RestTemplateTest {
    @Autowired
    private RestTemplate restTemplate;

    @Test
    void contextLoads() {
        ResponseEntity<String> res = restTemplate.getForEntity("http://localhost:8080/users/ping?userName=guyot", String.class);
        System.out.println(res.getBody());
    }

}
