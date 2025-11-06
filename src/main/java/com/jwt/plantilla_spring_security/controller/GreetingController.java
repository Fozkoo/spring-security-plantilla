package com.jwt.plantilla_spring_security.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/greeting")
public class GreetingController {



    @GetMapping("/say-hello")
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/say-hello-protected")
    public String sayHelloProtected() {
        return "Hello World Protected";
    }


}
