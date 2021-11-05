package com.ujwal.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelComeRestController {
	
	
	@GetMapping("/welcome")
	public String displayWelcomeMsg() {
		
		return "WEL-COME---Ujwal";
	}

}
