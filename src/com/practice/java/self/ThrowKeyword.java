package com.practice.java.self;

public class ThrowKeyword {

	public static void main(String[] args) {
		
	method(19);
		
	}
	public static void method(int a) {
		if(a<18) {
			throw new ArithmeticException("you r not eligible for vote");
		}
		else {
			System.out.println("u r eligible");
		}
	}

}
