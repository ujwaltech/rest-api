package com.ujwal.dep;

public class Employee {
	
	int empNo;
	String empName;
	String department;
	String status;
	public Employee(int empNo, String empName, String department, String status) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.department = department;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", department=" + department + ", status=" + status
				+ "]";
	}
	
	

}
