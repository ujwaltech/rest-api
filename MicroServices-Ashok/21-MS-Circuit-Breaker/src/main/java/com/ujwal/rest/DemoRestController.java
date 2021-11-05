package com.ujwal.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class DemoRestController {

	@GetMapping("/process")
	@HystrixCommand(fallbackMethod = "doWork")
	public String doProcess() {

		String response = "response is coming back from doProcess() method";
		int a = 10 / 0;
		return response;
	}

	public String doWork() {

		String response = "response is coming from Dowork() method..alternative method of doProcess() method";
		return response;
	}

}
