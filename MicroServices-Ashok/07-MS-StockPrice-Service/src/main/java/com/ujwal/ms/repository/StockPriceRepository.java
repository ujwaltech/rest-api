package com.ujwal.ms.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ujwal.ms.entity.StockPrice;

public interface StockPriceRepository extends JpaRepository<StockPrice, Serializable>{
	
	public StockPrice findByCompanyName(String companyName);

}
