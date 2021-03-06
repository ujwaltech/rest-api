package com.ujwal.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ujwal.responce.binding.CurrencyResponse;

@RestController
public class CurrencyExchangeRestController {
	//http://localhost:9595/currencyexchange/From/USD/To/INR
	
	@GetMapping(value="/currencyexchange/From/{from}/To/{to}",
			         produces = {
			        		    "Application/json",
			        		     "Application/xml"
			        		    })
			        // consumes = {"application/json","application/xml"})
	                 
	public ResponseEntity<CurrencyResponse> getCurrencyExchangeDtls(@PathVariable("from") String from,
			                                                       @PathVariable("to")  String to){
		
	//	System.out.println(from+"   "+to);
		
		if("USD".equals(from) && "INR".equals(to)) {
			
			CurrencyResponse res=new CurrencyResponse();
			res.setCurrencyId("1");
			res.setFromCurrency(from);
			res.setToCurrency(to);
			res.setCurrencyRate(74.56);
			
			return new ResponseEntity<CurrencyResponse>(res,HttpStatus.CREATED); 
		}else if("UK".equals(from) && "INR".equals(to)) {
			
			CurrencyResponse res=new CurrencyResponse();
			res.setCurrencyId("2");
			res.setFromCurrency(from);
			res.setToCurrency(to);
			res.setCurrencyRate(86.99);
			
			return new ResponseEntity<CurrencyResponse>(res,HttpStatus.CREATED); 
			
		}else if("NEP".equals(from) && "INR".equals(to)) {
			
			CurrencyResponse res=new CurrencyResponse();
			res.setCurrencyId("3");
			res.setFromCurrency(from);
			res.setToCurrency(to);
			res.setCurrencyRate(0.6);
			
			return new ResponseEntity<CurrencyResponse>(res,HttpStatus.CREATED);  
			
		}else 
			return new ResponseEntity<CurrencyResponse>(HttpStatus.BAD_REQUEST);
		
		
		
	}

}
