package com.masai.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ControllerClass {

	@GetMapping()  //http://localhost:8080/
	public String printHandler1() {

		return "spring boot ki duniya me apka swagat hai 1!";

	}
	
	
	@GetMapping(value = "h")  //http://localhost:8080/h
	public String printHandler2() {

		return "spring boot ki duniya me apka swagat hai 2!";

	}
	

	@GetMapping(value = "{id}") //http://localhost:8080/1
	public String printHandler3(@PathVariable Integer id) {

		return "spring boot ki duniya me apka swagat hai 3!";

	}

}
