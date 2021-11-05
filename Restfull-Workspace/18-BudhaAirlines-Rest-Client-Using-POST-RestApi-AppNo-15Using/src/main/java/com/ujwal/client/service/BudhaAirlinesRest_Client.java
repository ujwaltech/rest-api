package com.ujwal.client.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ujwal.request.binding.PassengerInfo;
import com.ujwal.responce.binding.TicketInfo;

@Service
public class BudhaAirlinesRest_Client {
	
	private static final String endpoint_url="http://localhost:9595/bookticket";
	
	public void invokeRestApi() {
		
		PassengerInfo pinfo=new PassengerInfo();
		pinfo.setFligntNumber("DEL1235");
		pinfo.setPassengerName("ujwal");
		pinfo.setPassengerAge(29);
		pinfo.setFrom("kathmandu");
		pinfo.setTo("janakpur");
		pinfo.setTravelDate("26-sep-2021");
	/*	one--way
		RestTemplate rt=new RestTemplate();
		//if we want to response in RAW data like String formate
	   // ResponseEntity<String> ticketResEntity = rt.postForEntity(endpoint_url, pinfo, String.class);
		
		//But if you want to responce data in the object formate than
		ResponseEntity<TicketInfo> resEntity = rt.postForEntity(endpoint_url, pinfo,TicketInfo.class );
		
		if(201==resEntity.getStatusCodeValue()) {
			System.out.println(resEntity.getBody());
	//TicketInfo [flightNumber=DEL1235, status=CONFIRMED, name=ujwal, age=29, from=kathmandu, to=janakpur, travelDate=26-sep-2021, price=566.22]		
		
		}
		*/
		
		RestTemplate rt=new RestTemplate();
		
		//adding Headers in POST request
		HttpHeaders headers=new HttpHeaders();
		headers.add("Accept", "application/xml");
		headers.add("Content-type","application/json");
		
		//Creating HttpRequestEntity object to set headers
		
		HttpEntity<PassengerInfo> reqEntity=new HttpEntity<PassengerInfo>(pinfo, headers);
		//if we want to data in XML formate
		
		// ResponseEntity<String> responseEntity = rt.postForEntity(endpoint_url, reqEntity, String.class);
		 
		 
	//	 ResponseEntity<TicketInfo> responseEntity = rt.postForEntity(endpoint_url, reqEntity, TicketInfo.class);
		
		ResponseEntity<TicketInfo> responseEntity = rt.exchange(endpoint_url, HttpMethod.POST, reqEntity, TicketInfo.class);
		 
		
		 if(201==responseEntity.getStatusCodeValue()) {
			
			 System.out.println("*****************Response Started*****************");
			 
			 System.out.println(responseEntity.getBody());
			 System.out.println("*****************Response Ended*****************");
		 }
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
