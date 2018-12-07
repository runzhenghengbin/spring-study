package com.kevin.spring.demo1.dao.imp;

import com.kevin.spring.demo1.dao.BookDao;

/**
 * 图书数据访问实现类
 */
public class BookDaoImpl implements BookDao {
    public String addBook(String bookName) {
        return "添加图书" + bookName;
    }
}
