package com.ujwal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ujwal.client.MyClient;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext contxt = SpringApplication.run(Application.class, args);
		
		MyClient myclient = contxt.getBean(MyClient.class);
		myclient.invokeRestApi();
	}

}
