package com.practice.java.self;

public class PrimeNo {

	public static void main(String[] args) {
		//print prime no 1-100;
		int j;
		for(int i=1;i<=100;i++) {
			for(j=2;j<i;j++) {
				
				if(i%j==0)
					break;
			}
				if(i==j){
					System.out.println(i);
				
				}
		}
		
	}

}
