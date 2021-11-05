package com.ujwal.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetMsgRestCOntroller {
	
	@GetMapping("/greet")
	public String displayGreetMsg() {
		
		
		return "Good Morning Dear!!";
	}

}
