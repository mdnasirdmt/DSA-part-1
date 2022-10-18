package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Student;
import com.masai.service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {

	@Autowired
	private StudentService service;

	@PostMapping("/")
	public Student registerStudentHandler(@RequestBody Student student) {

		return service.saveStudent(student);

	}
	
	

}
/*
 * { "name":"Nasir", "marks": 850,
 * 
	 * "courses":[ 
	 * { "cName":"Java", "fee":1000 }, 
	 * {
	 * "cName":"Spring boot", "fee":2000 } 
	 * ] 
 * }
 */
