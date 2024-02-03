package com.aashish.springboot.springjpaassignment.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	 @PutMapping("/{author_id}/update-author-name")
	  public void updateAuthorName(@PathVariable int author_id, @RequestBody String newAuthorName) {
		 System.out.println(newAuthorName);
	      authorService.updateAuthorName(author_id, newAuthorName);
	  }
}
