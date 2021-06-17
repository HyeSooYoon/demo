package com.example.demo.repository;

import com.example.demo.dto.BookDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookDto, Long> {
}
