package com.example.demo.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "book")
public class BookDto {
	 
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String title;
    private String author;
    private int price;
}
