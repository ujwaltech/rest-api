package com.ujwal.bindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.sun.scenario.effect.Effect.AccelType;

@XmlRootElement(name="student")
@XmlAccessorType(XmlAccessType.FIELD)
public class Student {
	
	@XmlElement(name="student-id")
	private Integer sid;
	
	//attribute at class level
	@XmlAttribute
	private String standard;
	
	@XmlElement(name="student-name")
	private String sName;
	
	@XmlElement(name="student-gen")
	private String gender;
	
	@XmlElement(name="student-city")
	private String city;

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", standard=" + standard + ", sName=" + sName + ", gender=" + gender + ", city="
				+ city + "]";
	}


	
	

}
