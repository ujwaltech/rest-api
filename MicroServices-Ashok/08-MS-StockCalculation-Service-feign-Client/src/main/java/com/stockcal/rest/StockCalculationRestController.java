package com.stockcal.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stockcal.feignclient.StockPriceClient;

@RestController
@RequestMapping("/calc")
public class StockCalculationRestController {
	
	@Autowired
	private StockPriceClient feignclient;
	
	@GetMapping(value="/calculatestock/{companyname}/{quantity}")
	public ResponseEntity<?> getStockPriceCalculation(@PathVariable("companyname")  String companyName,@PathVariable("quantity")Integer quantity){
		
		Double totalPrice=null;
		ResponseEntity<?> resentity=null;
		
		try {
			
			resentity = feignclient.getStockPrice(companyName);
			int statusCd = resentity.getStatusCode().value();
			   
		      if(statusCd==200) {
				   Double stockPrice = (Double) resentity.getBody();
				   totalPrice= stockPrice * quantity;
				   String responce="Total Price::"+totalPrice;
				   return new ResponseEntity<String>(responce,HttpStatus.OK);
			   }
		}catch(Exception e) {
			e.printStackTrace();
			resentity=new ResponseEntity<String>("company name not available",HttpStatus.BAD_REQUEST);
			
		}
		
		return resentity;
	
		   
		  //  return new ResponseEntity<String>("Company name not Found....",HttpStatus.BAD_REQUEST);
		
	}

}
