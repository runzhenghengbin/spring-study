package com.kevin.spring.demo1.service;

import com.kevin.spring.demo1.dao.BookDao;
import com.kevin.spring.demo1.dao.impl.BookDaoImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BookService {
    @Resource
    BookDaoImpl bookDao;

    public void storeBook(String bookName){
        String result = bookDao.addBook(bookName);
        System.out.println(result);
    }

}
