package com.example.openapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.openapi.model.Book;

public interface BookRepo extends JpaRepository<Book, String>{
    
}
