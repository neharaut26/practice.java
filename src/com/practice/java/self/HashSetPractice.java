package com.practice.java.self;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetPractice {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		set.add(123);
		set.add(456);
		set.add(789);
		set.add(123);
		set.add(null);
		HashSet<Integer> set1 = new HashSet<>();
		set1.add(4);
		set1.add(78);
		set1.add(90);
		set.addAll(set1);
		set.remove(123);
	//System.out.println(	set.contains(456));
	//System.out.println(set.toString());
	//System.out.println(set.hashCode());
		System.out.println(set.getClass());
		
	Iterator<Integer> v	=set.iterator();
		while(v.hasNext()) {
			System.out.println(v.next());
		}
	}

}
