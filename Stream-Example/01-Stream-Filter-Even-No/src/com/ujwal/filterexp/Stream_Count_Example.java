package com.ujwal.filterexp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_Count_Example {

	public static void main(String[] args) {

		ArrayList<String> list=new ArrayList();
		list.add("ujwal");
		list.add("ujwal jha");
		list.add("durga sir");
		list.add("HK");
		list.add("Natraj babu");
		list.add("sriman");
		
		List<String> l1=list.stream().filter(s->s.length()>5).collect(Collectors.toList());
		
		System.out.println(l1);
		
		long count=(int) list.stream().filter(s->s.length()>5).count();
		
		System.out.println("Count is:::"+count);
		
		List<String> l3=list.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(l3);
		
	}

}
