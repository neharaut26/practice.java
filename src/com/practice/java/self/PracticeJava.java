package com.practice.java.self;
import java.util.Scanner;


public class PracticeJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//simple even odd 
		for(int i=0;i<=30;i++) {
			if(i%2==0) {
				System.out.println("the even nos are="+i);
			}
			else {
				System.out.println("the odd no are="+i);
			}
			}
		System.out.println("#############################################");
		
		
		//by using scanner 
	Scanner sc	=new Scanner(System.in);
	System.out.println("please enter the no= ");
	int num =sc.nextInt();
	if(num%2==0){
		System.out.println("the no is even");
	}
		else {
			System.out.println("the no is odd");
		}
	System.out.println("#############################################");
	//by using calling method
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the no= ");
	int tum=scan.nextInt();
	 PracticeJava s1=new PracticeJava();
	 s1.evenOdd(tum);
	
	}
	//instance member function
	public void evenOdd(int tum) {
		if(tum%2==0) {
			System.out.println("the given no is even");
		}else {
			System.out.println("the given no is even");
		}
	}
	}


