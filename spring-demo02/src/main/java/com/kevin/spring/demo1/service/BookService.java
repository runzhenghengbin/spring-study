package com.kevin.spring.demo1.service;

import com.kevin.spring.demo1.dao.impl.BookDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 业务类
 */
@Service
public class BookService {
    @Resource
    private BookDaoImpl bookDao;
    @Resource
    private BookDaoImpl bookDao1;

    public void addBook(String bookName) {
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("book.xml");
//        bookDao = ctx.getBean("bookDaoImpl", BookDaoImpl.class);
//        bookDao1 = ctx.getBean("bookDaoImpl", BookDaoImpl.class);
        System.out.println(bookDao == bookDao1);
        String resout = bookDao.addBook(bookName);
        System.out.println(resout);
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("book.xml");
        BookService bookService = ctx.getBean(BookService.class);
        bookService.addBook("好好学习");
    }


}
