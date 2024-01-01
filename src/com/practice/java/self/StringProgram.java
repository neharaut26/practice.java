package com.practice.java.self;

public class StringProgram {

	public static void main(String[] args) {
		//split into diffrnt section and do each starting letter capital .
		String para="this is java session.i m new in programming.i will give my best in it";
		String array[]=para.split(".");
		
		for(int i=0;i<array.length;i++) {
			String first = array[i].substring(0,1);
			String rest = array[i].substring(1);
		String upper= first.toUpperCase() + rest;
			System.out.println(upper);
		}
		System.out.println("###############################");
		//reverse string
		String reverse = "hi this is neha ";
		for(int i=reverse.length()-1;i>=0;i--) {
			char store=reverse.charAt(i);
			System.out.print(store);
		}
		
		System.out.println(" ");
		
		//reverse each word
		String word="welcome to java";
		String array1[]=word.split(" ");
		
		for(int i=0;i<array1.length;i++) {
			for (int j=array1[i].length()-1;j>0;j--) {
				 char store1=array1[i].charAt(j);
				 System.out.print(store1);
			}
		System.out.print(" ");
		
		}
		
		String r= "1234j4534ABCddffg#$%&23";
		System.out.println(r.replaceAll("[0-9]",""));
		System.out.println(r.replaceAll("[^0-9a-z]",""));//caret ^ 
		System.out.println(r.replaceAll("[^0-9A-Za-z]",""));
		System.out.println(r.replaceAll("[0-9a-zA-Z]",""));
	}

}
