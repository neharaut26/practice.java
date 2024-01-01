package com.practice.java.self;

public class ThisAsaConstructor {
	
	public static void main(String[] args) {
		ThisAsaConstructor v =new ThisAsaConstructor(10);
		ThisAsaConstructor v1 =new ThisAsaConstructor();
		
}

ThisAsaConstructor(int a){
	System.out.println("calling parameterrizes constructor");
}
ThisAsaConstructor(){
	this(10);
	System.out.println("Constructor called");
	
}

}