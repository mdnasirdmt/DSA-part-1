package com.masai.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer id;
	public String name;

	public User() {

	}

	public User(Integer id, String name) {

		this.id = id;
		this.name = name;
	}

}
