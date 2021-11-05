package com.ujwal.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ujwal.Binding.PassengerInfo;
import com.ujwal.response.TicketInfo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api("This is AirIndia book ticket API")
public class AirIndiaBookTicketRestController {
	
	@ApiResponses(value={
		@ApiResponse(code=201,message = "resource created"),
		@ApiResponse(code=500,message = "in server data is not found server error"),
		@ApiResponse(code=400,message = "plz hit right URL")
	})
	@PostMapping(value="/bookTicket",
			      produces = {
			    		  "Application/json",
			    		  "Application/xml"
			    		  },
			      consumes = {
			    		  "Application/json",
			    		  "Application/xml"
			           })
	@ApiOperation("this method is used to book Ticket")
	public ResponseEntity<TicketInfo> getTicketDtls(@RequestBody PassengerInfo pinfo){
		System.out.println(pinfo);
		
		TicketInfo ticket=new TicketInfo();
		ticket.setPnrNumber("TI565656");
		ticket.setTrainNumber(pinfo.getTrainNumber());
		ticket.setTicketStatus("CONFIRMED");
		ticket.setPassengerName(pinfo.getfName()+" "+pinfo.getLname());
		ticket.setFrom(pinfo.getFrom());
		ticket.setTo(pinfo.getTo());
		ticket.setTravelDate(pinfo.getJourneyDate());
		ticket.setTicketPrice(1564.00);
		
		return new ResponseEntity<TicketInfo>(ticket,HttpStatus.CREATED);
		
	}
	
	@ApiOperation("this is used to check PNR status")
	@GetMapping(value="/pnrstatus/{pnr}")
	public String getPnrStatus(@PathVariable("pnr") String pnrNumber) {
		return "CONFIRMED";
	}

}
