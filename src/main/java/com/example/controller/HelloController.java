package com.example.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping("/hello")
    public String hello() {
        System.out.println("测试上传 github");
        return "hello springboot - springmvc -----------";
    }

    
}
