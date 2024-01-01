package com.practice.java.self;

public class practiceThisVariable {
int rollno;
String 	name;

float fee;	
	public static void main(String[] args) {
		practiceThisVariable student=new practiceThisVariable(10,"neha",500);
		practiceThisVariable student2=new practiceThisVariable(11,"sneha",5000);
		student.display();
		student2.display();
	}
	
	practiceThisVariable(int rollno,String name,float fee){
		
		this.rollno = rollno;
		this.name =name ;
				this.fee=fee;
	}
void display() {
	System.out.println(rollno+" "+name+" "+fee);
}
}
