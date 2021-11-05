package com.ujwal.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeDtlsRestController {
	
	Logger logger=LoggerFactory.getLogger(EmployeeDtlsRestController.class);
	
	@GetMapping(value="/empdtls/name/{name}/city/{city}")
	public ResponseEntity<String> getEmployeeDtls(@PathVariable("name")String empName,@PathVariable("city") String city){
		
		
		if("ujwal".equals(empName) && "delhi".equals(city)) {
			
			String msg=  empName+" : is employee of wipro in the :"+city;
			
			logger.info("*******Wipro employee started********");
			
			return new ResponseEntity<String>(msg,HttpStatus.OK);
		
		}else if("kundan".equals(empName) && "hyd".equals(city)) {
			
			String msg=  empName+" : is employee of TCS in the :"+city;
			logger.info("*******TCS employee started********");
			return new ResponseEntity<String>(msg,HttpStatus.OK);
		
	}else {
		logger.info("******* employee NOT found=======********");
		return new ResponseEntity<String>("Employee is not listed",HttpStatus.BAD_REQUEST);
		
		
	}

}
}
