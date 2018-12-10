package com.kevin.spring.demo1.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class BookServiceTest {

    @Test
    public void addBook() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("book.xml");
        BookService bookService = ctx.getBean(BookService.class);
        bookService.addBook("好好学习");
    }
}