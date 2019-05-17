package com.atguigu.springboot02quick.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by daynew on 2019/5/17.
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String TestHello(){
        return "HelloWorld!";
    }
}
