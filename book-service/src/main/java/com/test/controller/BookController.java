package com.test.controller;

import com.test.service.BookService;
import entity.Book;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class BookController {

    @Resource
    BookService bookService;

    @RequestMapping("/book/{bid}")
    public Book getBookById(@PathVariable("bid")int bid){
        System.out.println("此处调用了服务！");
        return bookService.getBookById(bid);
    }
}
