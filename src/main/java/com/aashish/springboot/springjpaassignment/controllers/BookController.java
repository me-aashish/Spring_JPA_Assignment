package com.aashish.springboot.springjpaassignment.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aashish.springboot.springjpaassignment.entities.Book;
import com.aashish.springboot.springjpaassignment.pojo.BookRequest;
import com.aashish.springboot.springjpaassignment.services.BookService;

@RestController
@RequestMapping("/api/v1")
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@GetMapping("books")
	public List<Book>getBooks(){
		return bookService.getBooks();
	}
	
	@PostMapping("books")
	public Book createBook(@RequestBody BookRequest bookRequest) {
		return bookService.createBook(bookRequest);
		
		
	}
}
