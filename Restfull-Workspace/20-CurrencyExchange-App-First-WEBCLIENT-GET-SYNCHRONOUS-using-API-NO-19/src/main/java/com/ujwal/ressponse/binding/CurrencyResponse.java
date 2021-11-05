package com.ujwal.ressponse.binding;

public class CurrencyResponse {
	
	private String currencyId;
	private String fromCurrency;
	private String toCurrency;
	private double currencyRate;
	public String getCurrencyId() {
		return currencyId;
	}
	public void setCurrencyId(String currencyId) {
		this.currencyId = currencyId;
	}
	public String getFromCurrency() {
		return fromCurrency;
	}
	public void setFromCurrency(String fromCurrency) {
		this.fromCurrency = fromCurrency;
	}
	public String getToCurrency() {
		return toCurrency;
	}
	public void setToCurrency(String toCurrency) {
		this.toCurrency = toCurrency;
	}
	public double getCurrencyRate() {
		return currencyRate;
	}
	public void setCurrencyRate(double currencyRate) {
		this.currencyRate = currencyRate;
	}
	@Override
	public String toString() {
		return "CurrencyResponse [currencyId=" + currencyId + ", fromCurrency=" + fromCurrency + ", toCurrency="
				+ toCurrency + ", currencyRate=" + currencyRate + "]";
	}
	
	

}
