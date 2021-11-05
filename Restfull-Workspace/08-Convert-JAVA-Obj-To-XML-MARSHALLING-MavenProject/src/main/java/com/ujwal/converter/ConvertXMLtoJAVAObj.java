package com.ujwal.converter;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.ujwal.bindings.Student;

public class ConvertXMLtoJAVAObj {

	public static void main(String[] args) throws JAXBException {

		File xmlFile=new File("student.xml");
		
		JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
		
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		
		Student student =(Student) unmarshaller.unmarshal(xmlFile);
		
		System.out.println(student);
		
	}

}
