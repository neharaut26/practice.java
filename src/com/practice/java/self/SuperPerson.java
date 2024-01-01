package com.practice.java.self;

public class SuperPerson {
	String name;
	int age;
	float salary;
	public	SuperPerson(String name,int age){
		this.name=name;
		this.age=age;
	}
	public static void main(String[] args) {
		
		Person p=new Person("neha",5,2.5f);
		p.display();
	}
	}
	class Person extends SuperPerson{
		
	
	
	public Person(String name,int age,float salary) {
		super(name,age);
		this.salary=salary;
		
	}
	void display() {
		System.out.println(name+" "+age+" "+salary );
	}
	
		
	}


