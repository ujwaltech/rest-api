package com.ujwal.request.binding;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement()
//@XmlRootElement(name="passenger-info") optional
public class PassengerInfo {
	
	
	private String fligntNumber;
	private String passengerName;
	private int passengerAge;
	private String from;
	private String to;
	private String travelDate;
	public String getFligntNumber() {
		return fligntNumber;
	}
	public void setFligntNumber(String fligntNumber) {
		this.fligntNumber = fligntNumber;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public int getPassengerAge() {
		return passengerAge;
	}
	public void setPassengerAge(int passengerAge) {
		this.passengerAge = passengerAge;
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
	@Override
	public String toString() {
		return "PassengerInfo [fligntNumber=" + fligntNumber + ", passengerName=" + passengerName + ", passengerAge="
				+ passengerAge + ", from=" + from + ", to=" + to + ", travelDate=" + travelDate + "]";
	}
	
	

}
