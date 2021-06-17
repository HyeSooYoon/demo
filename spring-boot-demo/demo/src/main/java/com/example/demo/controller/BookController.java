package com.example.demo.controller;

import com.example.demo.dto.BookDto;
import com.example.demo.repository.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

@Slf4j
@RestController
@RequestMapping("/api/book")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/list")
    public Iterable<BookDto> getList() {
        return bookRepository.findAll();
    }

    @Transactional
    @PostMapping
    public BookDto addBook(BookDto book) {
        return bookRepository.save(book);
    }

    @Transactional
    @PutMapping("/book/{id}")
    public BookDto modifyBook(BookDto param) {
        return bookRepository.save(param);
    } 
}