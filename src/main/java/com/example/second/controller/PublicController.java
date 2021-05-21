package com.example.second.controller;

import com.example.second.entity.Book;
import com.example.second.entity.CourseSI;
import com.example.second.service.BookService;
import com.example.second.service.CourseSIService;
import com.example.second.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/public")
@CrossOrigin(allowCredentials = "true")
public class PublicController {

    @Autowired
    private BookService bookService;
    private CourseSIService courseSI;

    @Autowired
    MenuService menuService;

    /**
     * 查询所有数据
     */
    @GetMapping("/book/findAllBooks")
    public List<Book> findAllBooks() {
        return this.bookService.findAllBooks();
    }

    @GetMapping("/coursesi/findCourseSIByName")
    public String findCourseSIByName(@RequestParam String name){
        return this.courseSI.findCourseSIByName(name);
    }

}