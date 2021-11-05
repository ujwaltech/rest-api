package com.ujwal.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	
	
	@Value("${msg: Config server is not working now.....}")
	private String msg;
	
	@GetMapping("/msg")
	public String displayMsg() {
		
		return this.msg;
	}

}
