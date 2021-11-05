package com.ujwal.stu;

public class Student {
	
	int studentId;
	String studentName;
	Integer marks;
	
	public Student(int studentId, String studentName, Integer marks) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", marks=" + marks + "]";
	}
	
	
	

}
