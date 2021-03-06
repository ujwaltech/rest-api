package com.ujwal.client;

import java.awt.PageAttributes.MediaType;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.ujwal.ressponse.binding.CurrencyResponse;

@Service
public class MyClient {
	
	private static  String END_POINT_URL="http://localhost:9595/currencyexchange/From/{from}/To/{to}";
	
	public void invokeRestApiAshronous(String from,String to) {
		
		
		WebClient webClient = WebClient.create();
		System.out.println("***********Response started**************");
										
										webClient.get()
		            					.uri(END_POINT_URL,from,to)
		            					.header("accept", "application/xml")
		            					//.accept(org.springframework.http.MediaType.APPLICATION_JSON)
		            					.retrieve()
		            					.bodyToMono(String.class) //.bodyToMono(CurrencyResponce.class)
		            					.subscribe(MyClient::handleAshronousResponse);
		     
		System.out.println("***********Response Ended**************");  
	}
		public static void  handleAshronousResponse(String responce){ // CurrencyResponce responce
			 System.out.println(responce);
		}
		     
		    
	//subscribe is one llistner which is used to make this call as non-blocking it will excute next line without
	//	waiting for response from api.when responce is came then event will listen by subscribe method
		     
		
	}


