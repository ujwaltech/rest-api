package com.ujwal.converter;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ujwal.pojo.Student;

public class ConvertJsonToJavaObj {
	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
	//	convertJsonToObj();
		convertJsonsToObjs();
	}
	
	public static void convertJsonToObj() throws JsonParseException, JsonMappingException, IOException {
		
		//read json file from classpath
		File f=new File("student.json");
		ObjectMapper mapper=new ObjectMapper();
		//convert json data to java object
		Student s = mapper.readValue(f, Student.class);
		System.out.println(s);
	}
	
	public static void convertJsonsToObjs() throws JsonParseException, JsonMappingException, IOException {
		
		File f=new File("students.json");
		ObjectMapper mapper=new ObjectMapper();
		Student[] student = mapper.readValue(f, Student[].class);
		
		for (Student s : student) {
			System.out.println(s);
		}
		
	
	}

}
