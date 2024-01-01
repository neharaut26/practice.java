package com.practice.java.self;

public class AbstractionPractice {

	public static void main(String[] args) {
		Bank n= new Sbi();
		System.out.println("rate of intrest of sbi is "+ n.rateOfIntrest()+"%");
		Bank b= new Pnb();
		System.out.println("rate of intrest of pnb is "+ b.rateOfIntrest()+"%");
	}
}
	 abstract class Bank{
		 
		 
		 abstract int rateOfIntrest();
		 
	 }
	 
	 class Sbi extends Bank{
		 int rateOfIntrest() {
			return 8;
			
		 }
	 }
		 
	class Pnb extends Bank{
	int rateOfIntrest() {
			return 9;
		}
	} 
		 
	 


