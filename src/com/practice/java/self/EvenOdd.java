package com.practice.java.self;
import java.util.Scanner;  

public class EvenOdd {

	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner(System.in);  
		System.out.print("Enter the number: ");  
		//reading value from user  
		int num=scan.nextInt();  
		//instance method calling 
		EvenOdd a=new EvenOdd();
		a.findEvenOdd(num);
		// TODO Auto-generated method stub
		
	}
	//instance method
	public  void findEvenOdd(int num)  
	{  
	//method body  
	if(num%2==0)  { 
	System.out.println(num+" is even");  
	}
	else   
	System.out.println(num+" is odd");  
	}  

}

