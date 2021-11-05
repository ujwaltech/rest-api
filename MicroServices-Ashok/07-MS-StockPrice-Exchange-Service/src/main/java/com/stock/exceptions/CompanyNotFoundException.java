package com.stock.exceptions;

public class CompanyNotFoundException extends RuntimeException{
	
	public CompanyNotFoundException(String msg) {
		super(msg);
	}

}
