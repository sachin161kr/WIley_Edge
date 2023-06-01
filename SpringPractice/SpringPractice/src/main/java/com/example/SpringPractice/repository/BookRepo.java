package com.example.SpringPractice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringPractice.model.Books;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<Books, Long> {
}
