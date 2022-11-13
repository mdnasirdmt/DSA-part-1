package com.library.service.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.model.Book;
import com.library.repository.BookRepository;
import com.library.service.BookService;

import exception.ResourceNotFoundException;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;

	@Override
	public Book saveBook(Book book) {

		return bookRepository.save(book);
	}

	@Override
	public List<Book> getBook() {

		return bookRepository.findAll();
	}

	@Override
	public Book getBookById(Integer id) {
//		Optional<Book> book= bookRepository.findById(id);
		return bookRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("book not found by this id !"));

	}

	@Override
	public Book updateBook(Book book, Integer id) {

		Book exsitBook = bookRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("book not found to update please enter again !"));
		exsitBook.setName(book.getName());
		exsitBook.setAuthor(book.getAuthor());

		bookRepository.save(exsitBook);

		return exsitBook;
	}

	@Override
	public String deleteBook(Integer id) {

		bookRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("book not found to delete !"));

		bookRepository.deleteById(id);

		return "book deleted successfully !";
	}

	@Override
	public List<Book> findByAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}

}
