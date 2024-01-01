package com.practice.java.self;

public class DefaultConstructor {
	int i = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DefaultConstructor test = new DefaultConstructor();

	}

	public DefaultConstructor() {

		//int i = 1;
		for (i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println("the even no are =" + i);
			} else {
				System.out.println("the odd numbers are=" + i);
			}
		}

		// System.out.println("test.DefaultConstructor");
	}
}

