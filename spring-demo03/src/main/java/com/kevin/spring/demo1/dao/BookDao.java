package com.kevin.spring.demo1.dao;

/**
 * 图书数据访问接口
 */
public interface BookDao {

    /**
     * 添加图书
     *
     * @param bookName
     * @return
     */
    String addBook(String bookName);
}
