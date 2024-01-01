package com.practice.java.self;
import java.util.Arrays;  
import java.util.Collections;   
public class SortArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaration and instantiation of arrays
		Integer array[] = {20,40,10,50,30,100}; 
		
		//printing original order values
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	      System.out.println();  //to add next line
		
		//sort values in decending order
		Arrays.sort(array,Collections.reverseOrder()); 
		//print values
		System.out.println("values in descending order: " +Arrays.toString(array));   
		
		
		
	}

}
