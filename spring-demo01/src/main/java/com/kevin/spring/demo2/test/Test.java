package com.kevin.spring.demo2.test;

import com.kevin.spring.demo2.entity.Person;
import com.kevin.spring.demo2.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("student.xml");
        Thread.sleep(3000);
        Person kevin = ctx.getBean("kevin", Student.class);
        System.out.println(kevin);
    }
}
