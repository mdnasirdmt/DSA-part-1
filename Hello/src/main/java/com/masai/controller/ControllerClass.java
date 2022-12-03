package com.masai.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ControllerClass {

//	@GetMapping()
//	public String printHandler() {
//
//		return "spring boot ki duniya me apka swagat hai!";
//
//	}
	
	
//	@GetMapping(value = "h")
//	public String printHandler() {
//
//		return "spring boot ki duniya me apka swagat hai!";
//
//	}
	

	@GetMapping(value = "{id}")
	public String printHandler(@PathVariable Integer id) {

		return "spring boot ki duniya me apka swagat hai!";

	}

}
