package com.ujwal.ms;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="HELLORESTAPI")
public interface IHelloRestClient {
	
	@GetMapping("/hello/{name}")
	public String invokeHelloRestApi(@PathVariable("name") String name);
	

}
