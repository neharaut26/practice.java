package com.practice.java.self;

public class IfStatementsPractice {

	public static void main(String[] args) {
		int a=20,b=30,c=20;
		//without body
		if(a==20)
			System.out.println("this will run");
		else
			System.out.println("this will not run");

		int j=12,d=4,e=40;
		//nested-if
		if(j==7) {
			
			if(d<e)
				System.out.println("this will execute");
			else
				System.out.println("this will fail");
			
			}
		else {
			System.out.println("this will not goig to run");
		}
		
		//if-else-if
		int s=10,v=20,h=10;
		if(s==20)
			System.out.println("this will correct");
		else if(v==10)
			System.out.println("this is wrong");
		else if(v<h)
			System.out.println("very true");
		else
			System.out.println("hiii");
		
	}
	
	
	

}
