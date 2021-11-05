package com.ujwal.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fpd")
public class ReadRequesParameterController {

	@GetMapping(value={"/score",} )
	//public String displaySsnPrice(@RequestParam("ssn") Long  ssn) {
	
	public String displaySsnPrice(@RequestParam(value="ssn",required = false,defaultValue = "95959595") Long  ssn ) {
		System.out.println(ssn);
		
		return "the price of :"+ssn +" =65$";
	}
}
