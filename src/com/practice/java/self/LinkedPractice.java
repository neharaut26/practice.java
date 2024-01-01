package com.practice.java.self;

import java.util.LinkedList;

public class LinkedPractice {

	public static void main(String[] args) {
		LinkedList<String> n = new LinkedList<>();
		n.add("amit");
		n.add("neha");
		n.add("shantanu");
		n.add("krithya");
		n.add("krithya");
		System.out.println(n.indexOf("shantanu"));
		for(String s :n) {
			
			System.out.println(s);
		}
		
		

	}

}
