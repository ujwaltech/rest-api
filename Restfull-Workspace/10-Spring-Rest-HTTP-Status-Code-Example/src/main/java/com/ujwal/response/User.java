package com.ujwal.response;

public class User {
	
	private Integer userId;
	
	private String userName;
	
	private String city;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", city=" + city + "]";
	}
	
	

}
