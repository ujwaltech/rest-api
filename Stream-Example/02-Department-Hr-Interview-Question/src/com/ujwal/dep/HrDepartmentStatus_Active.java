package com.ujwal.dep;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class HrDepartmentStatus_Active {

	public static void main(String[] args) {

		ArrayList<Employee> empList=new ArrayList();
		populate(empList);
	//	System.out.println(empList);
		
		/*     USING---------PREDICATE Function Only--------------------------------------
		Predicate<Employee> p=emp->emp.department.equalsIgnoreCase("hr") &&emp.status.equalsIgnoreCase("active");
		
		for(Employee e : empList) {
			
			if(p.test(e)) {
				System.out.println(e.empName.toUpperCase());
			}
		}
		
		*/
		
		/* using predicate and Consumer functional interface--------------------------
		
		Predicate<Employee> p=emp->emp.department.equalsIgnoreCase("hr") &&emp.status.equalsIgnoreCase("active");
		Consumer<Employee> c=emp->System.out.println("Emp Name Is::::: "+emp.empName.toUpperCase()+"EMPNO:::"+emp.empNo);
		
		for(Employee e2:empList) {
			
			if(p.test(e2)) {
				c.accept(e2);
			}
		}
		
		*/
		
		//  USING Stream Concept
		
		List<Employee> employees=empList.stream().filter(emp->emp.department.equalsIgnoreCase("hr") && emp.status.equalsIgnoreCase("active"))
				                      .collect(Collectors.toList());
		
		for(Employee e3:employees) {
			
			System.out.println("NAME IS:::: "+e3.empName.toUpperCase());
		}
		
		//or
		System.out.println("*******************************************");
		empList.stream().filter(emp->emp.department.equalsIgnoreCase("hr") && emp.status.equalsIgnoreCase("Active")).forEach(System.out:: println);
		
	}
	
	public static void populate(ArrayList<Employee> eList) {
		
		
		eList.add(new Employee(101,"ujwal","IT","active"));
		eList.add(new Employee(102,"kundan","it","active"));
		eList.add(new Employee(103,"pooja","hr","leave"));
		eList.add(new Employee(104,"anuj","manager","active"));
		eList.add(new Employee(105,"sudha","hr","active"));
		eList.add(new Employee(106,"pinky","hr","active"));
		eList.add(new Employee(107,"dimple","tester","active"));
		eList.add(new Employee(108,"preety","hr","leave"));
		eList.add(new Employee(109,"neha yadav","HR","Active"));
	}

}
