package com.stockcal.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(url="http://localhost:1111",name="STOCK-PRICE")
@FeignClient(name="STOCK-PRICE")

public interface StockPriceClient {
	
	@GetMapping("price/stockprice/{companyname}")
	public ResponseEntity<Double> getStockPrice(@PathVariable("companyname") String companyname);

}
