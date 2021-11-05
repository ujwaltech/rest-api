package com.ujwal.ms.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

	@GetMapping("/welcome/{name}")
	public String displayHello(@PathVariable("name") String name) {
		
		return "Hello," +name +"How are You??";
		
		
	}
	
}
