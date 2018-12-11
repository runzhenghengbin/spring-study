package com.kevin.spring.demo1.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:dev.properties")
public class BoyUtil {

    @Value("${boy.name}")
    private String name;
    @Value("${boy.age}")
    private String age;

    @Override
    public String toString() {
        return "BoyUtil{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
