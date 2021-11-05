package com.ujwal.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeServiceApi {

	private ResponseEntity<String> responce = null;

	@Autowired
	private Environment env;

	@GetMapping(value="/getexchange/from/{from}/to/{to}")
	public ResponseEntity<String> exchangeCurrency(@PathVariable("from") String from,@PathVariable("to")String to){
	
		if("USD".equals(from) && "INR".equals(to)){
			String result="ONE USD dollar :==75.04 INR ";
			String port=env.getProperty("local.server.port");
			String msg=result +" ::: running Port is::"+port;
			responce=new ResponseEntity<String>(msg,HttpStatus.OK);
			
			return responce;
		}else if("UK".equals(from) && "INR".equals(to)){
			String result="ONE POND dollar :==80.04 INR ";
			String port=env.getProperty("local.server.port");
			String msg=result +" ::: running Port is::"+port;
			responce=new ResponseEntity<String>(msg,HttpStatus.OK);
			
			return responce;
		}else {
			responce=new ResponseEntity<String>("Bad Request this is",HttpStatus.BAD_REQUEST);
			return responce;
		}
		
		
	}

}
