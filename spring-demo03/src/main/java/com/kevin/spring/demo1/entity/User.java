package com.kevin.spring.demo1.entity;

import org.springframework.stereotype.Component;

@Component
public class User {

    public User() {
        System.out.println("创建User对象");
    }

    public User(String msg) {
        System.out.println("创建User对象" + msg);
    }

    public void show() {
        System.out.println("一个学生对象！");
    }
}
