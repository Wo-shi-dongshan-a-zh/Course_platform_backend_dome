package com.example.second.controller;


import com.example.second.entity.Book;
import com.example.second.service.BookService;
import com.example.second.service.MenuService;
import com.example.second.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
@CrossOrigin(allowCredentials = "true")
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    MenuService menuService;

    /**
     * 查询所有数据
     */
    @GetMapping("/findAllBooks")
    public List<Book> findAllBooks() {
        return this.bookService.findAllBooks();
    }

    /**
     * 增加数据
     */
    @PostMapping("/addBook")
    public void addBook(@RequestBody Book book){
        this.bookService.addBook(book);
    }

    /**
     * 根据数据id删除数据
     */
    @PostMapping("/deleteBook")
    public void deleteBookById(@RequestParam Long uid) {
        this.bookService.deleteBookById(uid);
    }

    /**
     * 编辑数据
     */
    @PostMapping("/updateBook")

    public void updateBook(@RequestBody Book book){
        this.bookService.updateBook(book);
    }
//
//    /**
//     * 根据数据姓名查找数据
//     */
//    @GetMapping("/findBookByName")
//    public List<Book> findBookByName(@RequestParam String name) {
//        return this.bookService.findBookByName(name);
//    }
//
//    /**
//     * 批量删除数据
//     */
//    @PostMapping("/deleteBooksByIds")
//    public Integer deleteBooksByIds(Integer[] ids) {
//        return this.bookService.deleteBooksByIds(ids);
//    }
}
