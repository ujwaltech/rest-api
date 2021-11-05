package com.stock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stock.entity.StockPrice;
import com.stock.exceptions.CompanyNotFoundException;
import com.stock.repositories.StockPriceRepository;

@Service
public class StockPriceServiceImpletation implements IStockPriceService {

	@Autowired
	private StockPriceRepository repo;
	
	@Override
	public Double getStockPriceOfCompany(String cmpName) {
		
		StockPrice entity = repo.findByCompanyName(cmpName);
		
		if(entity==null) {
			throw new CompanyNotFoundException("company is not Available");
		}
		
		return entity.getCompanyPrice();
	}

}
