package com.practice.java.self;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLiatPractice {

	public static void main(String[] args) {
		ArrayList<Integer> array1=new ArrayList<>();
		array1.add(100);
		array1.add(20);
		array1.add(50);
		array1.add(200);
		array1.add(50);
		array1.add(null);
		//array1.clear();
		ArrayList<Integer> array2=new ArrayList<>();
		array2.add(10);
		array2.add(20);
		array2.add(50);
		array2.add(30);
		array2.add(40);
		array2.add(null);
		array1.addAll(array2);
		//array1.remove(array2);
		//System.out.println(array1.contains(400));
		//System.out.println(array1.get(5));
		System.out.println(array1.indexOf(50));
		
		//System.out.println(array1.size());
	//System.out.println(	array1.contains(null));
	
		if(array1.get(4)>array2.get(3)) {
			System.out.println("hiiii");
		}
		else {
			System.out.println("bye");
		}
		for(Integer e:array1) {
			System.out.println(e);
		}
		
		
		
		
		
	}

}
