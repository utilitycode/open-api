package com.example.openapi.service;

import org.springframework.stereotype.Service;

import com.example.openapi.model.Book;
import com.example.openapi.repository.BookRepo;

@Service
public class BookService {

    private BookRepo bookRepo;

    public BookService(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }
    public void addBook(final Book bookentity){
        bookRepo.save(bookentity);
    }
}
