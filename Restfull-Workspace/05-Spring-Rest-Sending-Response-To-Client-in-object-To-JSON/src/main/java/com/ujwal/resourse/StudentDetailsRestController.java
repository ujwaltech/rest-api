package com.ujwal.resourse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ujwal.response.Student;

@RestController
public class StudentDetailsRestController {
	
	//produces tells in which formate the response will be sent to client by resource
	@GetMapping(value="/student/{sid}",produces = "application/json")
	public Student getStudentDtls(@PathVariable("sid") Integer sid) {
		
		Student s=new Student();
		if(sid==101) {
			
			s.setStudentId(101);
			s.setStudentName("ujwal");
			s.setCourse("JAVA");
			//return s;
		}else if(sid==102) {
			
			s.setStudentId(102);
			s.setStudentName("sumit");
			s.setCourse("python");
			//return s;
		}
			return s;
		
	}

}
