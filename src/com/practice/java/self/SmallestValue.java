package com.practice.java.self;
import java.util.Arrays;
import java.util.Collections;  
public class SmallestValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer  a[]= {40,28,56,2,3,9,7};
		System.out.println("the smallest value is"+ smallestValue(a,7));
		
	}
	public static int smallestValue(Integer [] a,int total) {
		Arrays.sort(a);
		Arrays.sort(a,Collections.reverseOrder()); 
		return a[total-1];
	}

}
