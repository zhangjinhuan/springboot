package com.atguigu.springboot02quick.config;

import com.atguigu.springboot02quick.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAppService {
    @Bean
    public HelloService getHelloService(){
        System.out.println("生成了配置");
        return new HelloService();
    }
}
