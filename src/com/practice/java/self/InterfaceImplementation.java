package com.practice.java.self;

public class InterfaceImplementation implements InterfacePractice ,Cow{

	public static void main(String[] args) {
		InterfaceImplementation n = new InterfaceImplementation();
		n.addition();
		n.sub();
		System.out.println(n.b);
	}

	@Override
	public void addition() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sub() {
		System.out.println("hiiiiiiiiiii");
		
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	

}
