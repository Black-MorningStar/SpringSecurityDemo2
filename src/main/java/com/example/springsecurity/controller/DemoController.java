package com.example.springsecurity.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 君墨笑
 * @Date: 2024/10/11 17:31
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @PostMapping("/login")
    public String login() {
        return "success";
    }
}