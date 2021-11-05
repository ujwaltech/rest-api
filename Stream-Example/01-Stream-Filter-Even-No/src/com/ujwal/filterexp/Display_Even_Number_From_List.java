package com.ujwal.filterexp;

import java.util.ArrayList;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Display_Even_Number_From_List {

	public static void main(String[] args) {

		List<Integer> list=new ArrayList();
		
		list.add(10);
		list.add(5);
		list.add(15);
		list.add(20);
		list.add(30);
		list.add(18);
		list.add(13);
		
		System.out.println(list);
		
		List<Integer> al=list.stream().filter(i->i%2==0 && i%6==0).collect(Collectors.toList());
		System.out.println(al);
		
		System.out.println("****************************************************");
		
		List<Integer> al2=(ArrayList<Integer>) list.stream().map(i->i+2).collect(Collectors.toList());
		System.out.println(al2);
	}

}
