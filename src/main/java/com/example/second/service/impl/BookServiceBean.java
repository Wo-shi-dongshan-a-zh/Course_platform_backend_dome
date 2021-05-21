package com.example.second.service.impl;

import com.example.second.dao.BookDao;
import com.example.second.entity.Book;
import com.example.second.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
//@Transactional(rollbackFor = Exception.class)
public class BookServiceBean implements BookService {

    @Autowired
    private BookDao bookDao;

    public List<Book> findAllBooks() {
        return this.bookDao.findAllBooks();
    }


    @Transactional
    public void addBook(Book book) {
        this.bookDao.addBook(book);
//        this.bookCopyDao.addBook(book);
        Integer count = this.bookDao.getCountBooks();
        //没有加@Transactional注解，万一出现错误，新增人数会成功，但是学生表的总人数没有改变，出现了数据的不一致。
        //int x = 5 / 0;
    }

    public void deleteBookById(Long uid) {
        this.bookDao.deleteBookById(uid);
        Integer count = this.bookDao.getCountBooks();
    }

    public void updateBook(Book book) {
        this.bookDao.updateBook(book);
    }

    public List<Book> findBookByName(String name) {
        return this.bookDao.findBookByName(name);
    }

    public Integer deleteBooksByIds(Integer[] ids) {
        return this.bookDao.deleteBooksByIds(ids);
    }

}
