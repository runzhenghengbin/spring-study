package com.kevin.spring.demo1.test;

import com.kevin.spring.demo1.entity.Music;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: kevin
 * @Date: 2018/12/8
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("music.xml");
        Music jay = ctx.getBean("jay", Music.class);
    }
}
