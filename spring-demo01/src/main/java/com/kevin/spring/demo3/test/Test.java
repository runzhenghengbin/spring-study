package com.kevin.spring.demo3.test;

import com.kevin.spring.demo3.entity.Animal;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("animal.xml");
        Animal dog = ctx.getBean("dog",Animal.class);
        Animal cat = ctx.getBean("cat",Animal.class);
        System.out.println(cat);
    }
}
