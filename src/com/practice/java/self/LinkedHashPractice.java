package com.practice.java.self;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashPractice {

	public static void main(String[] args) {
		Set<Integer> link = new LinkedHashSet<>();
		ArrayList<Integer> a =new ArrayList<>(link);
		link.add(123);
		link.add(876);
		link.add(876);
		link.add(null);
		
		LinkedHashSet<Integer> link1 = new LinkedHashSet<Integer>();
		link1.add(567);
		link1.add(678);
		link1.add(789);
		link1.add(null);
		
		link.addAll(link1);  
		Iterator<Integer> it = link.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
	}

}
