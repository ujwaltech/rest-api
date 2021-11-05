package com.stock.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stock.entity.StockPrice;

public interface StockPriceRepository extends JpaRepository<StockPrice, Serializable>{
	
	public StockPrice findByCompanyName(String companyName);

}
