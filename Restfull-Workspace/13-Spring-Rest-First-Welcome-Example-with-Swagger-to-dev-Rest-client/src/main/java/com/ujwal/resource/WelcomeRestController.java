package com.ujwal.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "First Rest Welcome API")
public class WelcomeRestController {
	
	@ApiOperation(value = "this method is display  Welcome msg ")
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		
		return "Welcome to Ujwal It";
	}
	
	@ApiOperation(value = "this method is display  GREET msg ")
	@GetMapping("/greet")
	public String greetMsg() {
		return "Hello,Good Morning!!!";
	}

}
