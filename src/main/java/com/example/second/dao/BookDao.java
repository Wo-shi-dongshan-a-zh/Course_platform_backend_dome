package com.example.second.dao;

import com.example.second.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component(value = "BookDao")
public interface BookDao {
        List<Book> findAllBooks();

        int deleteBookById(Long uid);

        int insert(Book book);

        int addBook(Book book);

        Book selectByPrimaryKey(Long uid);

        int updateBook(Book book);

        int updateByPrimaryKey(Book book);

        List<Book> findBookByName(String name);

        Integer deleteBooksByIds(@Param("ids") Integer[] ids);

        int getCountBooks();
}
