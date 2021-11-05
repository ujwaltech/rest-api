package com.ujwal.ms.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ujwal.ms.entity.StockPrice;
import com.ujwal.ms.service.IStockService;

@RestController
public class StockPriceRestController {
	
	@Autowired
	private IStockService stockpriceservice;
	
	@GetMapping(value="/stockprice/{companyname}")
	public ResponseEntity<Double> getStockPriceDtls(@PathVariable("companyname") String companyName){
	
		Double stockPrice = stockpriceservice.getStockPrice(companyName);
		
		return new ResponseEntity<Double>(stockPrice,HttpStatus.OK); 
		
	}

}
