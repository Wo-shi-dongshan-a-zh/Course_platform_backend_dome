package com.example.second.service;


import com.example.second.entity.Book;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface UploadService {

    public void uploadFile(MultipartFile file, HttpServletRequest request);

    interface BookService {

        public List<Book> findAllBooks();

        public void addBook(Book book);

        public void deleteBookById(Long uid);

        public void updateBook(Book book);

        List<Book> findBookByName(String name);

        public Integer deleteBooksByIds(Integer[] ids);
    }
}
