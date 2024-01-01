package com.practice.java.self;
import java.util.Arrays;   
public class SortArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int array[]= {20,40,10,50,30,100};
	//use sort()method
	Arrays.sort(array); 
	
	System.out.println("values in ascending order");
	
	//1st method of printing ascending order values
	for(int i=0;i<array.length;i++) {
		System.out.print(array[i]+" ");
	}
	System.out.println();
	
	//anothr method to print the ascending order
		System.out.printf("ascending order values are"+Arrays.toString(array));
	}

}
