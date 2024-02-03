package com.aashish.springboot.springjpaassignment.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.aashish.springboot.springjpaassignment.entities.Book;

@Repository
public interface BookRepository extends JpaRepositoryImplementation<Book, Integer> {

}
