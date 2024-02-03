package com.aashish.springboot.springjpaassignment.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aashish.springboot.springjpaassignment.entities.Author;
import com.aashish.springboot.springjpaassignment.repositories.AuthorRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Service
public class AuthorService {
	
	@Autowired
	AuthorRepository authorRepository;
	
	 @PersistenceContext
	 private EntityManager entityManager;
	
	public List<Author> getAuthors(){
		return authorRepository.findAll();
	}
	
	public Author createAuthor(Author author) {
		return authorRepository.save(author);
	}
	
	public List<Map<String, Object>> getBooksByAuthorWithKeys() {
        return authorRepository.getBooksByAuthorWithKeys();
    }
	
	@Transactional
	public void updateAuthorName(int author_id, String newAuthorName) {
		Author author = authorRepository.findById(author_id);
		author.setAuthorName(newAuthorName);
		authorRepository.updateAuthorName(author_id, newAuthorName);
		
	}
	 
	
	
}
