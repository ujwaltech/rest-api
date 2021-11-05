package com.ujwal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		//creating RestTemplate Object
		
		RestTemplate restTemplate=new RestTemplate();
		
		//request url 
		String url="http://localhost:7272/welcome";
		
	//	String url="http://localhost:7272/greet";
		//to sending http get request
		
		ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);
		
		//get status code
		int statusCode = responseEntity.getStatusCode().value();
		
		if(statusCode==200) {
			//get response body
			System.out.println(responseEntity.getBody());
		}
	}

}
