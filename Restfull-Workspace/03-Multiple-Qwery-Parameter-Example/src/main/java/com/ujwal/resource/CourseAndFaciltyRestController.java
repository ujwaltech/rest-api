package com.ujwal.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseAndFaciltyRestController {
	
	@GetMapping("/course")
	public String getCourseDetails(@RequestParam("cname") String courseName,@RequestParam("fname") String  faciltyName) {
		
		System.out.println(courseName+"   "+faciltyName);
		if(courseName.equals("jrtp") && faciltyName.equals("ashok")) {
			
			return "the course  "+courseName+" is started from 25 SEP By   "+faciltyName;
		}else {
			
			return "plz check our website http://www.ashokit.com for more Details :";
		}
	}

}
