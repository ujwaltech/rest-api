package com.ujwal.stu;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sort_Student_BasedOn_Marks {

	public static void main(String[] args) {
		
		List<Student> sList=new ArrayList();
		populate(sList);
		System.out.println(sList);
		
	//	List<Student> s1=(List<Student>) sList.stream().sorted((std1,std2)->std1.marks.compareTo(std2.marks));
		
	 List<Student> stuList = sList.stream().sorted((std1,std2)->-(std1.marks).compareTo(std2.marks)).collect(Collectors.toList());
	                      
	 //    List<Student> collect = sList.stream().sorted().collect(Collectors.toList());
		                  System.out.println(stuList);
	/*
		                  
		List<Integer> l1=new ArrayList();
		l1.add(50);
		l1.add(60);
		l1.add(20);
		l1.add(5);
		
		  List<Integer> collect = l1.stream().sorted().collect(Collectors.toList());
		  System.out.println(collect);
		  
		  List<Integer> collect2 = l1.stream().sorted((a1,a2)-> -a1.compareTo(a2)).collect(Collectors.toList());
		  System.out.println(collect2);
		  
    */
		
	}
	
	
	
	
	public static void populate(List<Student> slist) {
		
		slist.add(new Student(105,"ujwal",18));
		slist.add(new Student(110,"ravi",60));
		slist.add(new Student(108,"sohan",55));
		slist.add(new Student(106,"mohan",25));
		slist.add(new Student(103,"sudha",35));
		slist.add(new Student(125,"kundan",40));
		slist.add(new Student(101,"rahul",40));
		slist.add(new Student(103,"dimple",10));
	}

}
