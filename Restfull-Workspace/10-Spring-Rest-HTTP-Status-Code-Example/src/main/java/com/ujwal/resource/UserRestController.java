package com.ujwal.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ujwal.response.User;

@RestController
public class UserRestController {
	
	@PostMapping(value="/userdtls/{uid}",
			           produces = {
			        		        "application/json"
			           })
	public ResponseEntity<User> getUserDtls(@PathVariable("uid") Integer uid){
		
		if(uid<0) {
			return new ResponseEntity<User>(HttpStatus.BAD_REQUEST);
		}else if(uid<50) {
			return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
			
		}else if(uid>50) {
			User u=new User();
			u.setUserId(101);
			u.setUserName("üjwal");
			u.setCity("Delhi");
			return new ResponseEntity<User>(u,HttpStatus.CREATED);
			
		}else {
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
		
	}

}
