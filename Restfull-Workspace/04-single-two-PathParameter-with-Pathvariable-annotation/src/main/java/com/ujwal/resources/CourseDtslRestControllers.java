package com.ujwal.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseDtslRestControllers {
	
	//working with one path-parameter
	
	@GetMapping(value="/course/{cname}")
	public String getCourseDuration(@PathVariable("cname") String courseName) {
		
		if("jrtp".equals(courseName)) {
			return "Duration of JRTP is 3 months::";
		}else if("sbms".equals(courseName)){
			return "70 days is the duration for sbms:::" ;
		}else {
			return "please visit to our website http://ashokit.com for more Details..";
		}
		
	}
	
	//working with 2 path parameter
	
	@GetMapping(value="/course/{cname}/{tname}")
	public String getCourseDtls(@PathVariable("cname") String courseName,@PathVariable("tname")String trainerName) {
		System.out.println(courseName+"   "+trainerName);
		if("jrtp".equals(courseName)&& "ashok".equals(trainerName)) {
			return "this is New Project batch starting from 20-SEP";
		}else if("sbms".equals(courseName) && "ashok".equals(trainerName)) {
			return "this is SpringBoot with micro course starting from 10-SEP ";
		}else {
			return "plz visit our website:::";
		}
	}
	
	//working with midille of request URL
	
	@GetMapping(value="/course/{cname}/fasttrack/{tname}")
	public String getCourseInfo( @PathVariable("cname")  String courseName,
			                     @PathVariable("tname") String trainerName) {
		
		if("dbms".equals(courseName) && "raghu".equals(trainerName)) {
			return "DBMS is Strated By Raghu Sir Very soon :";
		}else if("servlet".equals(courseName) && "natraj".equals(trainerName)){
			return "SERVLET started by Natraj Sir on Next Months:";
		}else {
			
			return "information not available right now";
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
