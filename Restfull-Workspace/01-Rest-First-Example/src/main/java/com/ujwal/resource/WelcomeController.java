package com.ujwal.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/welcome")
public class WelcomeController {
	
	//@GetMapping("/welcome")
	@GetMapping
	public String displayWelcome() {
		String msg="Welcome to RestFull ND MS service classes:::";
		
		return msg;
	}
	
	@GetMapping("/greet")
	public String displayGreet() {
		String msg="Good Morning:::";
		return msg;
	}
	
	@GetMapping("/demo")
	public String demo() {
		String msg="Demo calling:::";
		return msg;
	}

}
