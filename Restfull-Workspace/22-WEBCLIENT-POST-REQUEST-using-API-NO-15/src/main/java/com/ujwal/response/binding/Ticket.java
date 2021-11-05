package com.ujwal.response.binding;

public class Ticket {
	
	private int age;
	private String flightNumber ;
	private String  from;
	private String  name;
	private double price;
	private String  status;
	private String to ;
	private String  travelDate;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
	@Override
	public String toString() {
		return "Ticket [age=" + age + ", flightNumber=" + flightNumber + ", from=" + from + ", name=" + name
				+ ", price=" + price + ", status=" + status + ", to=" + to + ", travelDate=" + travelDate + "]";
	}
	
	

}
