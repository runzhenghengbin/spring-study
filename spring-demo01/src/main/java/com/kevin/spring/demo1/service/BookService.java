package com.kevin.spring.demo1.service;

import com.kevin.spring.demo1.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 图书业务类
 */
public class BookService {
    BookDao bookDao;

    public BookService() {
        //容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("book.xml");
        bookDao = ctx.getBean("bookDao", BookDao.class);
    }

    public void storeBook(String bookName) {
        System.out.println("图书上货");
        System.out.println(bookDao.addBook(bookName));

    }
}
