package com.practice.java.self;
import java.util.Arrays;  

public class LargestNoValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]		= {40,50,86,21,34,80};
		System.out.println("the largest no is="+LargestNoValue.GreatestValue(a,6));
		
		
	}
	public static int GreatestValue(int[] a,int total) {
		Arrays.sort(a);
		return a[total-1];
	}

}
