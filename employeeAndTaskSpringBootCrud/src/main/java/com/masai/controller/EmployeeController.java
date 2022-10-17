package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Employee;
//import com.masai.model.Task;
import com.masai.service.EmployeeService;

@RestController
@RequestMapping("/api/emp")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	// create emp api // http://localhost:8080/api/emp
	@PostMapping
	public ResponseEntity<Employee> savePost(@RequestBody Employee employee) {

		return new ResponseEntity<Employee>(employeeService.createEmployee(employee), HttpStatus.CREATED);

	}

}
