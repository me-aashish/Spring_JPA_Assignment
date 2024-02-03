package com.aashish.springboot.springjpaassignment.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.aashish.springboot.springjpaassignment.entities.Author;

@Repository
public interface AuthorRepository extends JpaRepositoryImplementation<Author, Integer> {
	
	Author findById(int id);
	
	 @Query(value = "SELECT a.author_id, a.author_name, a.created_on as author_created_at, a.updated_on as author_updated_at, b.book_id, b.book_name, b.created_on as book_created_at, b.updated_on as book_updated_at " +
             "FROM authors a " +
             "JOIN books b ON a.author_id = b.author_id",
     nativeQuery = true)
	 List<Map<String, Object>> getBooksByAuthorWithKeys();
}
