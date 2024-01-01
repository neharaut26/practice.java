package com.practice.java.self;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetPractice {

	public static void main(String[] args) {
	Set<String> set = new TreeSet<>();
	set.add("neha");
	set.add("amit");
	set.add("krithu");
	set.add("shan");
	//set.add(null);
	
	Set<String> set1 = new TreeSet<>();
	set1.add("neha");
	set1.add("sachin");
	set1.add("minal");
	set1.add("tak");
	
	System.out.println(set.containsAll(set1));
	System.out.println(set.contains("neha"));
	set.addAll(set1);
	System.out.println(set.equals(set1));
	Iterator<String> it =set.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	}

}
