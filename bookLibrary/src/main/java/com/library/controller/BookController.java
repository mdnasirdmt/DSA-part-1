package com.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.model.Book;
import com.library.service.BookService;

@RestController
@RequestMapping("/bookservice/books")
public class BookController {

	@Autowired
	private BookService bookService;

	// to save
	@PostMapping
	public ResponseEntity<Book> saveBook(@RequestBody Book book) {
		return new ResponseEntity<Book>(bookService.saveBook(book), HttpStatus.CREATED);

	}

	// get by id
	@GetMapping("{id}")
	public ResponseEntity<Book> getBookById(@PathVariable("id") Integer id) {

		return new ResponseEntity<Book>(bookService.getBookById(id), HttpStatus.OK);
	}

	// get all book

	@GetMapping
	public List<Book> getBook() {

		return bookService.getBook();
	}

	// to update
	@PutMapping("{id}")
	public ResponseEntity<Book> updateBook(@PathVariable("id") Integer id, @RequestBody Book book) {

		return new ResponseEntity<Book>(bookService.updateBook(book, id), HttpStatus.OK);
	}

	// to delete
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteBook(@PathVariable("id") Integer id) {

		// delete book from db
		bookService.deleteBook(id);

		return new ResponseEntity<String>("book delete successfully", HttpStatus.OK);

	}

}
