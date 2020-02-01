package com.study.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/configClient")
public class ConfigClientHandler {
    @Value(value = "${server.port}")
    private String port;

    @GetMapping("/index")
    public String index(){
        return "端口号："+this.port;
    }
}
