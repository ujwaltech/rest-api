package com.ujwal.ms.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiRestController {

	@GetMapping("/greet/{name}")
	public String displayGreet(@PathVariable("name")  String name) {
		
		return "Hi::" +name+ ",Good Morning !!";
	}
	
}
