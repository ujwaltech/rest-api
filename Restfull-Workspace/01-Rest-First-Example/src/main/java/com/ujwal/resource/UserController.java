package com.ujwal.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping
	public String usermethod() {
		String msg="User RestController:::";
		return msg;
	}

}
