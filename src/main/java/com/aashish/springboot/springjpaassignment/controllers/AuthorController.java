package com.aashish.springboot.springjpaassignment.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aashish.springboot.springjpaassignment.entities.Author;
import com.aashish.springboot.springjpaassignment.services.AuthorService;

@RestController
@RequestMapping("/api/v1")
public class AuthorController {
	
	@Autowired
	AuthorService authorService;
	
	@GetMapping("authors")
	public List<Author>getAuthors(){
		return authorService.getAuthors();
	}
	
	@PostMapping("authors")
	public Author creAuthor(@RequestBody Author author) {
		return authorService.createAuthor(author);
	}
	
	@GetMapping("/authorbooks")
	 public List<Map<String, Object>> getBooksByAuthorWithKeys() {
        return authorService.getBooksByAuthorWithKeys();
    }
}
