package com.example.openapi.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull(message = "Unique alphanumeric value cannot be null")
    @NotEmpty(message = "Unique aplhanumeric value cannot be empty")
    private UUID bookId;

    // @Column(name = "book_name")
    @NotNull(message = "Book Name cannot be null ")
    @NotBlank(message = "BooK name cannot be empty")
    private String bookName;

    // @Column(name = "price")
    @NotNull(message = "Price of the book cannot be null")
    @NotBlank(message = "Price of the book cannot be empty")
    private Double price;

    // private Author author;
}
