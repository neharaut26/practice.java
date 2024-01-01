package com.practice.java.self;

public class InstanceMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	InstanceMethod	sub=new InstanceMethod();
	sub.substraction(15,10);//calling of instance method
	System.out.print("this will run after method");
		
		
		
		
	}
	
	public void substraction(int a,int b) {
		
		int s= a-b;
		System.out.println("substraction of a number is ="+s);
		
	}
	

}
