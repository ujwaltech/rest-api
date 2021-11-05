package com.ujwal.client;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ujwal.request.PassengerInfo;

public class RestClientBudhaAirlines {

	public static void main(String[] args) {

		URL url;
		try {
			url = new URL("http://localhost:9595/bookticket");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			//set http method type
			conn.setRequestMethod("POST");
			//set headers
			
			conn.setRequestProperty("content-type", "application/json");
		//	conn.setRequestProperty("accept","application/json");
			conn.setRequestProperty("accept","application/xml");
			
			//set data to request body
			PassengerInfo pinfo=new PassengerInfo();
			pinfo.setFligntNumber("5689");
			pinfo.setPassengerName("sumit");
			pinfo.setPassengerAge(26);
			pinfo.setFrom("hyd");
			pinfo.setTo("delhi");
			pinfo.setTravelDate("27-sep-2021");
		//converting java obj to json	
	ObjectMapper mapper=new ObjectMapper();
	 String jsonstr = mapper.writeValueAsString(pinfo);
	 
	 conn.setDoOutput(true);
	 //write in request body
	 OutputStream os=conn.getOutputStream();
	 os.write(jsonstr.getBytes());
	 
	 //get response code
	 
	 int responseCode = conn.getResponseCode();
	 
	 if(responseCode==201) {
		 
		 InputStream is=conn.getInputStream();
		 
		 InputStreamReader isr=new InputStreamReader(is);
		 
		 BufferedReader br=new BufferedReader(isr);
		 
		 String line = br.readLine();
		 
		 if(line!=null) {
			 System.out.println(line);
			 line=br.readLine();
		 }
		 conn.disconnect();
	 }
	 
	 
	 
	 
	 
	 
	 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
