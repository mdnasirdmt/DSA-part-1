package com.library.repository;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

	
	
}
