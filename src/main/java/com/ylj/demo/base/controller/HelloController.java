package com.ylj.demo.base.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


@RestController
public class HelloController {

    @RequestMapping(value = "/main")
    public String main(){
        return "hello world";
    }
}
