package com.tulio.springjenkinsdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld {

    @GetMapping("/hello")
    public String helloMessage(){
        return "Hello World";
    }

}
