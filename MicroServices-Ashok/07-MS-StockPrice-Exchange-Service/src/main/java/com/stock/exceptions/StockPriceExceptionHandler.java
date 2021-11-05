package com.stock.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StockPriceExceptionHandler {
	
	@ExceptionHandler(value=CompanyNotFoundException.class)
	public ResponseEntity<String> handleCompanyNotFoundException(){
		
		return new ResponseEntity<String>("Company not Found",HttpStatus.BAD_REQUEST);
	}

}
