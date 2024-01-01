package com.practice.java.self;

public class Addition {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int a=10;
		int b=15;
		Addition.add(a,b);
		
		
		
		

	}
	//user define method
	//static member function/method
	public static int add(int n1, int n2) {
		int s;
		s=n1+n2;
		System.out.println("addition of two no is ="+s);
		return s;//return sum;
		
	}
		
	

}
