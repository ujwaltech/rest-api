package com.ujwal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ujwal.client.service.BudhaAirlinesRest_Client;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext contxt = SpringApplication.run(Application.class, args);
		
		BudhaAirlinesRest_Client budhaRestClient = contxt.getBean(BudhaAirlinesRest_Client.class);
		
		budhaRestClient.invokeRestApi();
	}

}
