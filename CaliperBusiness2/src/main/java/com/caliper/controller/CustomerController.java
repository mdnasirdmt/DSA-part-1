package com.caliper.controller;

import java.util.List;

import javax.validation.Valid;

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

import com.caliper.model.Customers;
import com.caliper.service.CustomerService;

@RestController
@RequestMapping("/api/customer/")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	// create customer api // http://localhost:8080/api/customer
	@PostMapping
	public ResponseEntity<Customers> savePost(@RequestBody Customers customer) {

		return new ResponseEntity<Customers>(customerService.createCust(customer), HttpStatus.CREATED);

	}

	// get by id
	@GetMapping("{id}")
	public ResponseEntity<Customers> getCustByid(@PathVariable("id") Integer id) {

		return new ResponseEntity<Customers>(customerService.getCustById(id), HttpStatus.OK);
	}

	// get all customer
	@GetMapping
	public List<Customers> getAllCusts() {

		return customerService.getAllCust();
	}

	// to update// updating only name
	@PutMapping("{id}")
	public ResponseEntity<Customers> updateCust(@PathVariable("id") Integer id,
			@RequestBody Customers customer) {

		return new ResponseEntity<Customers>(customerService.updateCust(id), HttpStatus.OK);
	}

	// delete customer from db
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteCust(@PathVariable("id") Integer id) {

		customerService.deleteCust(id);

		return new ResponseEntity<String>("customer deleted successfully", HttpStatus.OK);

	}

}
