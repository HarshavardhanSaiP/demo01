package com.example.demo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/base")
@RestController
public class RestAPIController {

    @GetMapping("/get")
    public String getResponse(){
        return "Hello world!!.";
    }
}
