package com.ujwal.request.binding;

public class PassengerInfo {
	
	private String fligntNumber;
	private String from;
	private int passengerAge;
	private String passengerName;
	private String to;
	private String travelDate;
	public String getFligntNumber() {
		return fligntNumber;
	}
	public void setFligntNumber(String fligntNumber) {
		this.fligntNumber = fligntNumber;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public int getPassengerAge() {
		return passengerAge;
	}
	public void setPassengerAge(int passengerAge) {
		this.passengerAge = passengerAge;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
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
		return "PassengerInfo [fligntNumber=" + fligntNumber + ", from=" + from + ", passengerAge=" + passengerAge
				+ ", passengerName=" + passengerName + ", to=" + to + ", travelDate=" + travelDate + "]";
	}
	
	 

}
