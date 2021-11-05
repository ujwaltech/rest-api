package com.stock.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STOCK_PRICE")

public class StockPrice {
	
	@Id
	@Column(name="STOCK_ID")
	private Integer stockId;
	
	@Column(name="COMPANY_NAME")
	private String companyName;
	
	@Column(name="COMPANY_PRICE")
	private Double companyPrice;
	
	@Column(name="COMPANY_TYPE")
	private String companyType;

	public Integer getStockId() {
		return stockId;
	}

	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Double getCompanyPrice() {
		return companyPrice;
	}

	public void setCompanyPrice(Double companyPrice) {
		this.companyPrice = companyPrice;
	}

	public String getCompanyType() {
		return companyType;
	}

	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	@Override
	public String toString() {
		return "StockPrice [stockId=" + stockId + ", companyName=" + companyName + ", companyPrice=" + companyPrice
				+ ", companyType=" + companyType + "]";
	}
	
	
	
	

}
