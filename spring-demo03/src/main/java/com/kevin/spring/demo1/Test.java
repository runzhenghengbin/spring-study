package com.kevin.spring.demo1;

import com.kevin.spring.demo1.config.ApplicationConfig;
import com.kevin.spring.demo1.entity.User;
import com.kevin.spring.demo1.service.BookService;
import com.kevin.spring.demo1.util.BoyUtil;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    @org.junit.Test
    public void testBook(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        BookService bookService = ctx.getBean(BookService.class);
        bookService.storeBook("周杰伦");
        User user = ctx.getBean("getUser",User.class);
        user.show();
    }

    @org.junit.Test
    public void testBoyUtil(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        BoyUtil boyUtil = ctx.getBean(BoyUtil.class);
        System.out.println(boyUtil);
    }
}
