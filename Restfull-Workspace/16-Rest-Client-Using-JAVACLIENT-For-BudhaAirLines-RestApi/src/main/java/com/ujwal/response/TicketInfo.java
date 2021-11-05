package com.ujwal.response;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TicketInfo {
	
	
	private  String flightNumber;
	private  String status;
	private  String name;
	private int age;
	private  String from;
	private  String to;
	private  String travelDate;
	private  String price;
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(String travelDate) {
		this.travelDate = travelDate;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "TicketInfo [flightNumber=" + flightNumber + ", status=" + status + ", name=" + name + ", age=" + age
				+ ", from=" + from + ", to=" + to + ", travelDate=" + travelDate + ", price=" + price + "]";
	}
	
	
	
	
	

}
