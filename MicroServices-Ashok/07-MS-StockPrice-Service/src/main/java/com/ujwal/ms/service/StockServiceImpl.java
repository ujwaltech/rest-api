package com.ujwal.ms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ujwal.ms.entity.StockPrice;
import com.ujwal.ms.repository.StockPriceRepository;

@Service
public class StockServiceImpl implements IStockService {

	@Autowired
	private StockPriceRepository repo;
	
	@Override
	public Double getStockPrice(String companyName) {
     
		    StockPrice entity = repo.findByCompanyName(companyName);

	     	return entity.getCompanyPrice();
	}

}
