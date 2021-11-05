package com.ujwal.ms.restApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ujwal.ms.IHelloRestClient;

@RestController
public class HiRestControllerApi {
	
	@Autowired
	private IHelloRestClient helloRestController;

	@GetMapping("/hi/{name}")
	public String displayHii(@PathVariable   String name) {
	   String hiMsg="Hi ";
	   
	    String helloMsg = helloRestController.invokeHelloRestApi(name);
		return hiMsg+"    "+helloMsg;
	}
	
}
