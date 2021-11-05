package com.ujwal.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ujwal.request.PassengerInfo;
import com.ujwal.response.TicketInfo;

@RestController
public class BudhaAirlinesRestController {
	
	@PostMapping(value="/bookticket",produces = {
			                                      "application/json",
	                                              "application/xml"
	                                            },
			                          consumes = {
			                        		      "application/xml",
			                        		       "application/json"
                                                    	  
			                                      }
			                           
	
			)
	public ResponseEntity<TicketInfo> getTicketDtls(@RequestBody   PassengerInfo pinfo){
		
		TicketInfo ticket=new TicketInfo();
		ticket.setFlightNumber(pinfo.getFligntNumber());
		ticket.setStatus("CONFIRMED");
		ticket.setName(pinfo.getPassengerName());
		ticket.setAge(pinfo.getPassengerAge());
		ticket.setFrom(pinfo.getFrom());
		ticket.setTo(pinfo.getTo());
		ticket.setTravelDate(pinfo.getTravelDate());
		ticket.setPrice(566.22);
		
	    return 	new ResponseEntity<TicketInfo>(ticket,HttpStatus.CREATED);
		
	}

}
