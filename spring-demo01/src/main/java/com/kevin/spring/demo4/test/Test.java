package com.kevin.spring.demo4.test;

import com.kevin.spring.demo4.entity.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("car.xml");
        Thread.sleep(5000);
        Car bike = ctx.getBean("bike",Car.class);
        Car bike1 = ctx.getBean("bike",Car.class);
        System.out.println(bike == bike1);
        System.out.println(bike);
    }
}
