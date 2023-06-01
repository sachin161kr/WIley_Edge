package com.example.SpringPractice.service;

import com.example.SpringPractice.exception.BookNotFoundException;
import com.example.SpringPractice.exception.DepNOTFoundException;
import com.example.SpringPractice.model.Books;
import com.example.SpringPractice.model.Department;
import com.example.SpringPractice.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepo bookRepo;
    @Override
    public List<Books> getBooksList() {
        return bookRepo.findAll();
    }

    @Override
    public Books getBookById(Long bookId) throws BookNotFoundException {
        Optional<Books> book = bookRepo.findById(bookId);

        if(!book.isPresent())
        {
            throw new BookNotFoundException("Book not found");
        }

        return book.get();
    }
}
