package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.masai.model.Employee;
import com.masai.service.EmployeeService;



@RestController
@RequestMapping("/api/emp")
public class EmployeController {

	
	
	@Autowired
	private EmployeeService employeeService;

	// create employee api // http://localhost:8080/api/employee
	@PostMapping
	public ResponseEntity<Employee> saveEmp(@RequestBody Employee employee) {
		
		return new ResponseEntity<Employee>(employeeService.createEmp(employee), HttpStatus.CREATED);

	}
}
