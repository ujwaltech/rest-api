package com.ujwal.converter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.ujwal.bindings.Student;

public class ConvertJavaObjToXmlFormate {

	public static void main(String[] args) throws JAXBException, FileNotFoundException {

		Student s=new Student();
		s.setSid(101);
		s.setsName("Kabir");
		s.setGender("m");
		s.setCity("Delhi");
	    s.setStandard("9th");

	//first We need to create JAXBContext object to work with JAX-B
		
		JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
		
	//create marshaller to convert java object to xml formate
		
		Marshaller marshaller = jaxbContext.createMarshaller();
	//to make xml is well formate
		marshaller.setProperty(marshaller.JAXB_FORMATTED_OUTPUT,true);
		
	//	to convert java obj to xml call the marshal method and print on CONSOLE
		marshaller.marshal(s, System.out);
		
	//if you want to save output on xml file than 
		marshaller.marshal(s, new FileOutputStream("student.xml"));
	}

}
