package com.cdac.utility;

public class Person {
	
	private String name;
	Date dateOfBirth;



	public Person(String name,int day,int month,int year) {
		this.name=name;
		dateOfBirth=new Date(day,month,year);
	}

	public String toString() {
		return " Name: "+name+" DOB: "+dateOfBirth.toString();
	}	

}
