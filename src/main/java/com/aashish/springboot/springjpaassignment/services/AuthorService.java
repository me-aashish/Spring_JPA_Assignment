package com.aashish.springboot.springjpaassignment.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aashish.springboot.springjpaassignment.entities.Author;
import com.aashish.springboot.springjpaassignment.repositories.AuthorRepository;

@Service
public class AuthorService {
	
	@Autowired
	AuthorRepository authorRepository;
	
	public List<Author> getAuthors(){
		return authorRepository.findAll();
	}
	
	public Author createAuthor(Author author) {
		return authorRepository.save(author);
	}
	
	
}
