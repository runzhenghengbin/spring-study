package com.kevin.spring.demo1.dao.impl;

import com.kevin.spring.demo1.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * 接口实现类
 */
@Repository
public class BookDaoImpl implements BookDao {
    /**
     * 添加图书接口
     *
     * @param bookName
     * @return
     */
    public String addBook(String bookName) {
        return "添加图书《" + bookName + "》成功";
    }
}
