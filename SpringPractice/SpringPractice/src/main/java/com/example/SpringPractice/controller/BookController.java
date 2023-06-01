package com.example.SpringPractice.controller;

import com.example.SpringPractice.model.Books;
import com.example.SpringPractice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.SpringPractice.exception.BookNotFoundException;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;


    @GetMapping("/books/{id}")
    public Books getBookById(@PathVariable("id") Long bookId) throws BookNotFoundException {
        return bookService.getBookById(bookId);
    }

    @GetMapping("/books")
    public List<Books> getBooksList() {
        return bookService.getBooksList();
    }


}
