package com.kevin.spring.demo4.test;

import com.kevin.spring.demo4.entity.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("car.xml");
        Car bike = ctx.getBean("bike", Car.class);
        System.out.println(bike);
    }
}
