package com.ujwal.converter;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ujwal.pojo.Student;

public class ConvertJavaObjectToJson {

	public static void main(String[] args) throws JsonProcessingException {
		//single obj convert to json
		
	//	convertobjToJson();
		
		//multiple object convert to json
		convertobjsToJson();
		
	}

	public static void convertobjToJson() throws JsonProcessingException {
		Student s=new Student();
		s.setStudentId(105);
		s.setStudentName("ujwal jha");
		s.setCourse("JAVA");
		s.setStudentAge(28);
		
    ObjectMapper mapper=new ObjectMapper();
  //  String jsonString = mapper.writeValueAsString(s);
    //  {"studentId":105,"studentName":"ujwal","course":"JAVA"}
    
    String jsonString = mapper.writerWithDefaultPrettyPrinter()
           .writeValueAsString(s);
    
    /* { while using writerWithDefaultPrettyPrinter().writeValueAsString()
            "studentId" : 105,
            "studentName" : "ujwal",
            "course" : "JAVA"
        }
    
     */
    
    System.out.println(jsonString);
	}
	
	public static void convertobjsToJson() throws JsonProcessingException {
		
		Student s1=new Student();
		s1.setStudentId(501);
		s1.setStudentName("sumit");
		s1.setCourse("python");
		
		Student s2=new Student();
		s2.setStudentId(601);
		s2.setStudentName("rahul");
		s2.setCourse("android");
		
		List<Student> sList=new ArrayList<Student>();
		sList.add(s1);
		sList.add(s2);
		
		ObjectMapper mapper=new ObjectMapper();
		
		    String studentsJsons = mapper.writerWithDefaultPrettyPrinter()
		                      .writeValueAsString(sList);
		    System.out.println(studentsJsons);
		
		
		
	}
	

}
