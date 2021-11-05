package com.ujwal.resource;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ujwal.request.PassengerInfo;
import com.ujwal.response.Ticket;

@RestController
public class ERailRestController {
	
	/*
	@PostMapping(value="/bookticket",
			      produces = {
			    		       "application/json",
			    		       "application/xml"
			    		     },
			      consumes = {
			    		        "application/json",
			    		        "application/xml"
			    		     }
			)
	public Ticket getTicketInfo(@RequestBody PassengerInfo pinfo) {
		
		System.out.println(pinfo);
		Ticket t=new Ticket();
		t.setPnrNumber("DL156489");
		t.setTicketStatus("Confirmed");
		t.setName(pinfo.getFirstName()+" "+pinfo.getLastName());
		t.setFrom(pinfo.getFrom());
		t.setTo(pinfo.getTo());
		//t.setTravelDate(pinfo.getTravelDate());
		t.setTravelDate(new Date());
		t.setTicketPrice("1560");
		
		return t;
		
	} */ //this is not recomended bcoz it will send 200 ok as status code but we are creating record here
	
	@PostMapping(value="/bookticket",
		      produces = {
		    		       "application/json",
		    		       "application/xml"
		    		     },
		      consumes = {
		    		        "application/json",
		    		        "application/xml"
		    		     }
		)
public ResponseEntity<Ticket> getTicketInfo(@RequestBody PassengerInfo pinfo) {
		
		System.out.println(pinfo);
		Ticket t=new Ticket();
		t.setPnrNumber("DL156489");
		t.setTicketStatus("Confirmed");
		t.setName(pinfo.getFirstName()+" "+pinfo.getLastName());
		t.setFrom(pinfo.getFrom());
		t.setTo(pinfo.getTo());
		//t.setTravelDate(pinfo.getTravelDate());
		t.setTravelDate(new Date());
		t.setTicketPrice("1560");
		
		 return new ResponseEntity<>(t, HttpStatus.CREATED);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
