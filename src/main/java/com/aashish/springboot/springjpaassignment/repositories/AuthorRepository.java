package com.aashish.springboot.springjpaassignment.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.aashish.springboot.springjpaassignment.entities.Author;

@Repository
public interface AuthorRepository extends JpaRepositoryImplementation<Author, Integer> {


	
	
}
