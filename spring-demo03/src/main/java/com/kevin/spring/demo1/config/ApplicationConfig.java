package com.kevin.spring.demo1.config;

import com.kevin.spring.demo1.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.kevin.spring.demo1")
public class ApplicationConfig {

    @Bean
    public User getUser(){
        return new User("成功");
    }
}
