package com.ujwal.feignClientss;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="CURRENCY-EXCHANGE-SERVICE")
public interface CurrencyClient {
	
	
	@GetMapping(value="/getexchange/from/{from}/to/{to}")
	public String invokeRestApi(@PathVariable("from")String from, @PathVariable("to") String to);

}
