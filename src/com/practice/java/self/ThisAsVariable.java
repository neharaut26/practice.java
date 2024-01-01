package com.practice.java.self;

public class ThisAsVariable {
int f;
int i;
String s;
	
	
public static void main(String []args) {
	ThisAsVariable v=new ThisAsVariable();
	v.addition(10, 20);
}   


public int addition(int i ,int f) {
	this.i=i ;
	this. f = f;
	int a=i+f;
	
	System.out.println(a);
	return a;	
	
}
}
