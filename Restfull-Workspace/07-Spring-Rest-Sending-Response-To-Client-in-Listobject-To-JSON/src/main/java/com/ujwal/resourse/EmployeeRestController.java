package com.ujwal.resourse;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ujwal.response.Employee;
import com.ujwal.response.Employees;

@RestController
public class EmployeeRestController {
	
	@GetMapping(value="/emp/{eid}",
			     produces = {
			    		 "application/json",
			    		 "application/xml"
			     }
			)
	public Employee getEmployeeDtls(@PathVariable("eid") Integer employeeId ){
		Employee e=new Employee();
		if(employeeId==101){
	      System.out.println("==================================");
			e.setEmpid(101);
			e.setEmpName("ujwal");
			e.setEmpGender("m");
			e.setEmpCity("Delhi");
		}else if(employeeId==102) {
			e.setEmpid(102);
			e.setEmpName("sohan");
			e.setEmpGender("m");
			e.setEmpCity("hyd");
			}
		return e;
	}
	//but sending direct List obje to client is not good approach it is not working for XML
	@GetMapping(value="/employees")
	public List<Employee> getAllEmpDtls(){
	//[{"empid":105,"empName":"anju","empCity":"ktm","empGender":"f"},{"empid":106,"empName":"anup","empCity":"pokhra","empGender":"m"}]	
		List<Employee> eList=new ArrayList<Employee>();
		
		Employee e1=new Employee();
		e1.setEmpid(105);
		e1.setEmpName("anju");
		e1.setEmpGender("f");
		e1.setEmpCity("ktm");
		
		Employee e2=new Employee();
		e2.setEmpid(106);
		e2.setEmpName("anup");
		e2.setEmpGender("m");
		e2.setEmpCity("pokhra");
		
		eList.add(e1);
		eList.add(e2);
		return eList;
	}
	//recomendded Approach to send List<Object> to client
	@GetMapping(value="/allemp",
			     produces = {
			    		 "application/json",
			    		 "application/xml"
			     }
			)
	public Employees getEmployeesDtls() {
	
		//Root element here empList {"empList":[{"empid":105,"empName":"anju","empCity":"ktm","empGender":"f"},{"empid":106,"empName":"anup","empCity":"pokhra","empGender":"m"}]}
		List<Employee> eList=new ArrayList<Employee>();
		
		Employee e1=new Employee();
		e1.setEmpid(105);
		e1.setEmpName("anju");
		e1.setEmpGender("f");
		e1.setEmpCity("ktm");
		
		Employee e2=new Employee();
		e2.setEmpid(106);
		e2.setEmpName("anup");
		e2.setEmpGender("m");
		e2.setEmpCity("pokhra");
		
		eList.add(e1);
		eList.add(e2);
		
		Employees employees=new Employees();
		employees.setEmpList(eList);
		return employees;
		
		
	}

}
