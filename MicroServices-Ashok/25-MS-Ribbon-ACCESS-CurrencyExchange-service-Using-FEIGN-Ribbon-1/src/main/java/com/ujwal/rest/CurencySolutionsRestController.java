package com.ujwal.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ujwal.businessservice.ExchangeService;

@RestController
public class CurencySolutionsRestController {
	
	@Autowired
	private ExchangeService service;
	
	
	@GetMapping(value="/getconvert/from/{from}/to/{to}/city/{city}")
	public ResponseEntity<String> currencyDtls(@PathVariable("from") String from,
											@PathVariable("to")String to,
											@PathVariable("city")String city){
		
		String res = service.getCurrencyExchangeService(from, to);
		
		String userRes=res+" client city is::"+city;
		
		
		return new ResponseEntity<String>(userRes,HttpStatus.OK);
		
		
	}

}
