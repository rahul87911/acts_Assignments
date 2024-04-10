package com.cdac.utility;

public class Employee extends Person {

	private int eid;
	protected double basicSalary;
	
	public Employee(int eid,double basicSalary,String name, int day, int month, int year) {
		super(name, day, month, year);
		// TODO Auto-generated constructor stub
		this.eid=eid;
		this.basicSalary=basicSalary;
	}
	
	public double calculateSalary()
	{
		return basicSalary;
	}
	public String toString() {
		return super.toString()+ " Employee id : "+eid+" Basic Salary: "+basicSalary;
		//super.toString()+
	}

}
