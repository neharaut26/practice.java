package com.practice.java.self;

public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	show()	;	
	int a=20;
	int b=5;
		
	
		sub(a,b);

	}
	//static method
	static void show() {
		System.out.println("it is an example of static method");
	}
	 static void sub(int a, int b) {
		int s=a-b;
		System.out.println("the substraction of two no is="+ s);
	}

}
