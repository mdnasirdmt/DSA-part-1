package com.library.service;

import java.util.List;

import com.library.model.Book;

public interface BookService {

	public Book saveBook(Book book);

	public List<Book> getBook();

	public Book getBookById(Integer id);

	public Book updateBook(Book book, Integer id);

	public String deleteBook(Integer id);
	
	public List<Book> findByAuthor(String author);

}
