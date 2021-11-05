package com.ujwal.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ujwal.configpojo.ConfigPrpos;
import com.ujwal.constant.AppConstant;

@RestController
public class ReadingYmlPropertiesRestController {

	@Autowired
	private ConfigPrpos configprops;

	@GetMapping("/welcome")
	public String welcomeMsg() {

		return configprops.getProperties().get(AppConstant.WELCOME_MSG);
		
		// return configprops.getProperties().get("welcomeMsg");

		// return "Hello,How Are you?";
	}

	@GetMapping("/greet")
	public String greetMsg() {

		return configprops.getProperties().get(AppConstant.GREET_MSG);
		
		// return configprops.getProperties().get("greetMsg");

		// return "Hi,Good morning!!";
	}

	@GetMapping("/test")
	public String testMsg() {
		
		return configprops.getProperties().get(AppConstant.TEST_MSG);

	//	return configprops.getProperties().get("testMsg");

	}

}
