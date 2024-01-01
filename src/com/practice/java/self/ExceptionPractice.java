package com.practice.java.self;

import java.io.File;
import java.io.FileInputStream;

public class ExceptionPractice {

	public static void main(String[] args) {
				File file = new File("C:\\Users\\ABC\\Desktop\\krithya\\Neha Resume.docx");
				//FileInputStream stream = new FileInputStream(file);
				
				
				String n =null;
				//System.out.println(n);
				try {
			System.out.println(n.length());
			}catch(Throwable e) {
				System.out.println("object is null ");
			}
				
			
			int c = 10*10;
			System.out.println(c);
			String b = "123avs";
			try{int g = Integer.parseInt(b);
			System.out.println(g);}
			catch(NumberFormatException h){
				System.out.println("string should only contains integer value here");
			}//NumberFormatException.
			int array[] = new int[5];
			try{
				System.out.println(array[6]);
			}
			catch(NullPointerException u) {
				System.out.println("string should not be null");
			}
			catch(ArithmeticException a){
				System.out.println("dccdcd");
			}
			catch(ArrayIndexOutOfBoundsException k){

			}
			catch(Exception j) {
				System.out.println("hiiiiiii");
			}
			//Arrayindexoutofbond exception.
			/*
			 * String m ="12345"; System.out.println( m.charAt(5));
			 */
		//StringIndexOUtOFboundsException.
					
					
				
	}

}
