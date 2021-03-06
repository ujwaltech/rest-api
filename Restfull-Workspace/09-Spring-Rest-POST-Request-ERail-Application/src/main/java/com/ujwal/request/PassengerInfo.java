package com.ujwal.request;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="Passenger-Info")

public class PassengerInfo {
	
	private String trainNumber;
	private String firstName;
	private String lastName;
	private String from;
	private String to;
	private Date travelDate;
	public String getTrainNumber() {
		return trainNumber;
	}
	public void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	public Date getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}
	@Override
	public String toString() {
		return "PassengerInfo [trainNumber=" + trainNumber + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", from=" + from + ", to=" + to + ", travelDate=" + travelDate + "]";
	}

	
	

}
