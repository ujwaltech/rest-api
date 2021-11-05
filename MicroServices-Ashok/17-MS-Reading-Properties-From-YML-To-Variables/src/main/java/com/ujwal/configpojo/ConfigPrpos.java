package com.ujwal.configpojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix="demo")
@EnableConfigurationProperties
public class ConfigPrpos {
	
	private String welcomeMsg;
	private String greetMsg;
	public String getWelcomeMsg() {
		return welcomeMsg;
	}
	public void setWelcomeMsg(String welcomeMsg) {
		this.welcomeMsg = welcomeMsg;
	}
	public String getGreetMsg() {
		return greetMsg;
	}
	public void setGreetMsg(String greetMsg) {
		this.greetMsg = greetMsg;
	}
	
	

}
