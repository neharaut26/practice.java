package com.practice.java.self;

public class AbsractPractice {

	public static void main(String[] args) {
		ChildAbstract f = new ChildAbstract();
		f.addition(10, 20);
		System.out.println(f.j);
	}
}

abstract class First {
	int j= 20;
	abstract  void addition(int a, int b);
	First(){
		System.out.println("mmm");
	}
	public static void sum() {
		System.out.println("gggg");
	}
}


class ChildAbstract extends First {

	

	

	void sub() {
		System.out.println("nnnnnnnnnnnnnn");
	}

	@Override
	void addition(int a, int b) {
		// TODO Auto-generated method stub
		
	}
	
	
}
