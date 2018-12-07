package com.kevin.spring.demo1.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookServiceTest {

    @Test
    public void testBook() {
        BookService bookService = new BookService();
        bookService.storeBook("《you can you up》");
    }

}