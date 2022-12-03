package com.masai.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ControllerClass {

//	@GetMapping(value = "/")
	@GetMapping()
	public String printHandler() {

		return "spring boot ki duniya me apka swagat hai!";

	}

}
