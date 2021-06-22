package com.guyot.rpc.httprpc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {


    @GetMapping(value = "/ping")
    public String ping(String userName) {
        return "hello: " + userName;
    }
}
