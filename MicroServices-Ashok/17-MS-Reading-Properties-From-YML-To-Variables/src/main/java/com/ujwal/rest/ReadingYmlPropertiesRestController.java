package com.ujwal.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ujwal.configpojo.ConfigPrpos;

@RestController
public class ReadingYmlPropertiesRestController {

	@Autowired
	private ConfigPrpos configprops;

	@GetMapping("/welcome")
	public String welcomeMsg() {

		return configprops.getWelcomeMsg();

		// return "Hello,How Are you?";
	}

	@GetMapping("/greet")
	public String greetMsg() {

	 return	configprops.getGreetMsg();
		
	//	return "Hi,Good morning!!";
	}

}
