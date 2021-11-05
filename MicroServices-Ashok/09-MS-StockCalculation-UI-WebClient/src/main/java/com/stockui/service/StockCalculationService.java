package com.stockui.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class StockCalculationService {
	
	String ENDPOINT_URL="http://localhost:2222/calculatestock/{companyname}/{quantity}";
	
	public String getTotalStockPrice(String companyName,Integer quantity) {
		
		WebClient webclient=WebClient.create();
		
		String response=null;
		
		try {

		        response =  webclient.get()
		                          .uri(ENDPOINT_URL, companyName,quantity)
		                          .retrieve()
		                          .bodyToMono(String.class)
		                          .block();
			
		}catch(Exception e) {
			e.printStackTrace();
			response="This Company is not Mentioned:";
			
		}
		
		
		
		       return response;
		
		
	}

}
