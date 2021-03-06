package com.ujwal.client;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserter;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import com.ujwal.request.binding.PassengerInfo;
import com.ujwal.response.binding.Ticket;


@Service
public class MyClient {
	private static final String END_POINT_URL="http://localhost:9595/bookticket";
	public void invokeRestApi() {
		PassengerInfo pinfo=new PassengerInfo();
		pinfo.setFligntNumber("KTM564");
		pinfo.setPassengerName("anju");
		pinfo.setPassengerAge(29);
		pinfo.setFrom("KTM");
		pinfo.setTo("SIMRA");
		pinfo.setTravelDate("29-sep-2021");
		
	WebClient webClient=WebClient.create();
	
	
	String response = webClient.post()
	         .uri(END_POINT_URL)
	         .accept(MediaType.APPLICATION_XML)
	         .body(BodyInserters.fromValue(pinfo))
	         .retrieve()
	         .bodyToMono(String.class)
	         .block();
	           System.out.println(response);
	  
	
/*
	Ticket response = webClient.post()
	         .uri(END_POINT_URL)
	         .body(BodyInserters.fromValue(pinfo))
	         .retrieve()
	         .bodyToMono(Ticket.class)
	         .block();
	
	System.out.println(response);
	*/
	
	
	
	}

}
