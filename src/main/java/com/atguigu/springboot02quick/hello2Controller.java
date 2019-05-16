package com.atguigu.springboot02quick;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello2Controller {
    @Autowired
    private Person person;
    @Autowired
    private Dog dog;
    @RequestMapping("/hello2")
    public String hello2(){
        System.out.println("----" + person);
        System.out.println("----" + dog);
        return "hello2";
    }
}
