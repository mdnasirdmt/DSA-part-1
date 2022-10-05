package com.library.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer bookId;
	String name;
	String author;
	String publication;
	String category;
	Integer pages;
	Integer price;

}
