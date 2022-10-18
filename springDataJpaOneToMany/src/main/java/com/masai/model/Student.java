package com.masai.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer roll;
	private String name;
	private Integer marks;
	
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "students")
	@JsonIgnore
	List<Course> courses= new ArrayList<>();
	
}
