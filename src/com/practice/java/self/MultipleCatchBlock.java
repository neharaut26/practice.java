package com.practice.java.self;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		String b ="123sdg";
		try {
				int i = Integer.parseInt(b);
				System.out.println(i);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("e");
		}
		catch(NumberFormatException e) {
			System.out.println("String should contain only integer for this method");
		}
		
		
		
	}

}
