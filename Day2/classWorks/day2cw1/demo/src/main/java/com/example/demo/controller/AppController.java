package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.config.AppConfig;

@RestController
public class AppController {
    @Autowired
    public AppConfig appConfig;
    @GetMapping("/info")
    public String ques1(){
        return "App Name:"+appConfig.appName+",Version:"+appConfig.appVersion;
    }

}
