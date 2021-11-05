package com.ujwal.ms.restApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestApiRestController {

	@GetMapping("/hello/{name}")
	public String displayHelloMsg(@PathVariable("name") String name) {
		
		return "Hello,"+name;
	}
}
