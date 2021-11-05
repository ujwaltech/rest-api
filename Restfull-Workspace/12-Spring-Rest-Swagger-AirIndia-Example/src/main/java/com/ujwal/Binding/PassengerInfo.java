package com.ujwal.Binding;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="PassengerInfo")
public class PassengerInfo {

	private String trainNumber;
	private String fName;
	private String Lname;
	private String from;
	private String to;
	private String journeyDate;
	public String getTrainNumber() {
		return trainNumber;
	}
	public void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
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
	public String getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(String journeyDate) {
		this.journeyDate = journeyDate;
	}
	@Override
	public String toString() {
		return "PassengerInfo [trainNumber=" + trainNumber + ", fName=" + fName + ", Lname=" + Lname + ", from=" + from
				+ ", to=" + to + ", journeyDate=" + journeyDate + "]";
	}
	
	
	
}
