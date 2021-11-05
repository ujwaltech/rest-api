package com.ujwal.businessservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ujwal.feignClientss.CurrencyClient;

@Service
public class ExchangeService {

	@Autowired
	private CurrencyClient feignnnclient;
	
	public String getCurrencyExchangeService(String from,String to) {
		
		    String resppp = feignnnclient.invokeRestApi(from, to);
		
		    return resppp;
	}
}
