package com.example.SpringPractice.service;

import com.example.SpringPractice.exception.BookNotFoundException;
import com.example.SpringPractice.model.Books;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BookService {

    public List<Books> getBooksList();

    public Books getBookById(Long bookId) throws BookNotFoundException;

}
