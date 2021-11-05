package com.stock.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stock.service.IStockPriceService;

@RestController
@RequestMapping("/price")
public class StockPriceRestController {
	
	@Autowired
	private IStockPriceService service;
	
	@GetMapping(value="/stockprice/{companyname}")
	
	public ResponseEntity<Double> fetchStockPrice(@PathVariable("companyname") String companyName){

	         Double stockprice = service.getStockPriceOfCompany(companyName);
	
	  return new ResponseEntity<>(stockprice,HttpStatus.OK);
	  
	}
	
}
