package com.ujwal.client;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.ujwal.ressponse.binding.CurrencyResponse;

@Service
public class MyClient {
	
	private static  String END_POINT_URL="http://localhost:9595/currencyexchange/From/{from}/To/{to}";
	
	public void invokeRestApi(String from,String to) {
		
		
		WebClient webClient = WebClient.create();
	
		/*  when you want to response as a RAW formate	
		     String response = webClient.get()
		                      .uri(END_POINT_URL,from,to)
		                      .retrieve()
		                      .bodyToMono(String.class)
		                      .block();
		          */ 
		
    CurrencyResponse currencyResponse = webClient.get()
		            					.uri(END_POINT_URL,from,to)
		            					.retrieve()
		            					.bodyToMono(CurrencyResponse.class)
		            					.block();
		     
		     System.out.println("***********Response started**************");
		     
		     System.out.println(currencyResponse);
		     
		     System.out.println("***********Response Ended**************");
		
	}

}
