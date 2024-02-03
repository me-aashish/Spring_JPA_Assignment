package com.aashish.springboot.springjpaassignment.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.aashish.springboot.springjpaassignment.entities.Author;
import com.aashish.springboot.springjpaassignment.entities.Book;
import com.aashish.springboot.springjpaassignment.pojo.BookRequest;
import com.aashish.springboot.springjpaassignment.repositories.AuthorRepository;
import com.aashish.springboot.springjpaassignment.repositories.BookRepository;

@Service
public class BookService {
	
	@Autowired BookRepository bookRepository;
	@Autowired AuthorRepository authorRepository;
	
	public List<Book>getBooks(){
		return bookRepository.findAll();
	}
	
//	public Book createBook(String bookName, Long author_id) {
//		Long id = (Long)author_id;
//		Author author = authorRepository.findById(id).orElseThrow(() -> new RuntimeException("Author not found with id: " + author_id));
//
//        
//        Book bookObj = new Book();
//        bookObj.setBookName(bookName);
//        bookObj.setAuthor(author);
//
//        // Save the book to the database
//        return bookRepository.save(bookObj);
//	}

	public Book createBook(BookRequest bookRequest) {
		Author author = authorRepository.findById(bookRequest.author_id);
		
		Book book = new Book();
		
		book.setBookName(bookRequest.bookName);
		book.setAuthor(author);
		
		return bookRepository.save(book);
	}
}
