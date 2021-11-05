package com.ujwal.response;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TicketInfo {
	
	private String pnrNumber;
	private String trainNumber;
	private String ticketStatus;
	private String passengerName;
	private String from;
	private String to;
	private String travelDate;
	private Double ticketPrice;
	public String getPnrNumber() {
		return pnrNumber;
	}
	public void setPnrNumber(String pnrNumber) {
		this.pnrNumber = pnrNumber;
	}
	public String getTrainNumber() {
		return trainNumber;
	}
	public void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}
	public String getTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
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
	public Double getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(Double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	@Override
	public String toString() {
		return "TicketInfo [pnrNumber=" + pnrNumber + ", trainNumber=" + trainNumber + ", ticketStatus=" + ticketStatus
				+ ", passengerName=" + passengerName + ", from=" + from + ", to=" + to + ", travelDate=" + travelDate
				+ ", ticketPrice=" + ticketPrice + "]";
	}
	
	

}
