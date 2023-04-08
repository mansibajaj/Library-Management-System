package com.backendmarch.librarymanagementsystem.Controller;

import com.backendmarch.librarymanagementsystem.DTO.BookRequestDto;
import com.backendmarch.librarymanagementsystem.DTO.BookResponseDto;
import com.backendmarch.librarymanagementsystem.Entity.Book;
import com.backendmarch.librarymanagementsystem.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")

public class BookController {

    @Autowired
    BookService bookService;
    @PostMapping("/add")
    public BookResponseDto addBook(@RequestBody BookRequestDto bookRequestDto) throws Exception {

    return bookService.addBook(bookRequestDto);

    }


}
