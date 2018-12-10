package com.kevin.spring.demo1.dao.impl;

import com.kevin.spring.demo1.dao.BookDao;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 图书实现类
 */
@Component
public class BookDaoImpl implements BookDao {
    public String addBook(String book) {
        return "添加图书" + book + "成功";
    }
}
