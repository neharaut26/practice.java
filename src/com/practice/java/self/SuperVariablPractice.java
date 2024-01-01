package com.practice.java.self;

public class SuperVariablPractice {
	String mobile ="oneplus";
	float price=35000.5f;
	int speed =34;	
	

	public static void main(String []args) {
		Superr v  = new Superr();
		v.feature()		;																					
	}
}
class Superr extends SuperVariablPractice{
	
	public void feature() {
		String mobile ="nokia";
		float price=20000.5f;
		int speed =67;
		System.out.println("mobile fetures are = "+mobile+" "+price+" "+speed);
		System.out.println("mobile fetures are = "+super.mobile+" "+super.price+" "+super.speed);

	}
}
