package com.practice.java.self;
import java.util.Scanner;

public class Method {

	

	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//for loops
			//to print hellow
			/*int i=0;
			for(i=0;i<=4;i++) {
				System.out.println("heloow");
			}
			 int i=0;
			 for(i=1;i<11;i++){
				 System.out.println(i);
			 }
			   
			int i=0;
			int n=2;
			for(i=1;i<11;i++){
				
				 System.out.println(n*i);
			 }
			 int a=0;
	        while(i<=11) {
	        	System.out.println(i)
	        	i = i++;*/
			
			
			 
			//do while loop
			/*int i=12;
			do {
				System.out.println("apana college");
			}
			while(i<11);*/
			
			//print the sum of first natural no;
			 
			/*int i=0;
			int sum=0;
			
			for(i=1;i<=4;i++){
				sum = sum+i;
			}
			System.out.println("the sumof the natural no is ="+sum);*/
			
			
			//by giving input bu user
			Scanner sc = new Scanner(System.in);
			System.out.println("please enter the first 5 natural no=");
			int n = sc.nextInt();
			int sum = 0;
			int i = 0;
			
			for(i=1;i<=n;i++) {
				 sum = sum+i;
			}
			System.out.println("the sumof the first 5 natural no is="+sum);
	        
			/*
			 * Scanner sc = new Scanner(System.in); int n = sc.nextInt(); int i=0 ;
			 * 
			 * for(i=1; i<11; i++){
			 * 
			 * System.out.println(i * n); }
			 */
			
			
	       }

	}

