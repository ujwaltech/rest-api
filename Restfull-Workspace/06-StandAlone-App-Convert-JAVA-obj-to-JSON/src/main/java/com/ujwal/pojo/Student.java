package com.ujwal.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

//static ignore always ignore sname and student-course
//@JsonIgnoreProperties({"sname","student-course"})

@JsonInclude(value=Include.NON_NULL)   //it will not participate if the attribute value is null in object

public class Student {
	
	@JsonProperty("sid")
	private Integer studentId;
	
	@JsonProperty("sname")
	private String studentName;
	
	@JsonProperty("student-course")
	private String course;
	
	//always ignore this properties 
	//@JsonIgnore
	private Integer studentAge;
	
	

	public Integer getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(Integer studentAge) {
		this.studentAge = studentAge;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", course=" + course
				+ ", studentAge=" + studentAge + "]";
	}

	
	
	
	

}
