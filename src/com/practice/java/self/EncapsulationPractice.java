package com.practice.java.self;

public class EncapsulationPractice {

	public static void main(String[] args) {
		Account b = new Account();
		b.setName("neha");
		b.setEmail("kakdeneha@gmail.com");
		b.setAccno(1234567890);
		b.setAmount(4000.50f);
		System.out.println(b.getName()+" "+b.getEmail()+" "+b.getAccno()+" "+b.getAmount());
	
	}
		}
class Account{
	private String name,email;//data hiding
	private long accno;
	private float amount;
	
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	//read
	public long getAccno() {
		return accno;
	}
	public float getAmount() {
		return amount;
	}
	//write
	public void setName(String name) {
		this.name=name;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public void setAccno(long accno) {
		this.accno=accno;
	}
	public void setAmount(float amount) {
		this.amount=amount;
	}
	
	
}

