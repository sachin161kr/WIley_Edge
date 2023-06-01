package com.example.SpringPractice.service;

import com.example.SpringPractice.model.Author;
import com.example.SpringPractice.model.Books;
import com.example.SpringPractice.repository.AuthorRepo;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class AuthorService {

    private final AuthorRepo authorRepo;

    public AuthorService(AuthorRepo authorRepo) {
        this.authorRepo = authorRepo;
    }

    public void CreateAuthorWithBooks() {
        Author author = new Author();

        Books books = new Books();

        books.setAuthor(author);

        List<Books> list = author.getBooksList();

        list.add(books);

        author.setBooksList(list);

        authorRepo.save(author);
    }

    public List<Author> getAuthors() {
        return authorRepo.findAll();
    }

}
