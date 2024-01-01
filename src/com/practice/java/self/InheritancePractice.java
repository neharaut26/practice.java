package com.practice.java.self;

public class InheritancePractice {

	
	public static void main(String[] args) {
		Child child =new Child();
		child.sum(10, 20);
		child.diff();
	}
	public void diff() {
		System.out.println("hi");
	}

}
class Child extends InheritancePractice{
	 public void sum(int a ,int b) {
		 System.out.println(a+b);
	 }
 }