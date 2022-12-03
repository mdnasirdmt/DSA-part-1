package com.masai.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class Controller {

	
	String printHello(@PathVariable String str) {
		return str;

	}
}
