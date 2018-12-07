package com.kevin.spring.demo2.test;

import com.kevin.spring.demo2.entity.Person;
import com.kevin.spring.demo2.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("student.xml");
        Person kevin = ctx.getBean("kevin", Student.class);
        Person maomao = ctx.getBean("maomao", Student.class);
        System.out.println(maomao);
    }
}
