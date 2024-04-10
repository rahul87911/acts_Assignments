package com.cdac.staff;

import com.cdac.utility.Employee;

public class Administrator extends Employee {

	private double allowance;
	public Administrator(double allowance, int eid, double basicSalary, String name, int day, int month, int year) {
		super(eid, basicSalary, name, day, month, year);
		// TODO Auto-generated constructor stub
		this.allowance=allowance;
	}
	
	public double calculateSalary()
	{
		return basicSalary+allowance;
	}

	@Override
	public String toString() {
		return "Administrator ::"+super.toString()+" allowance=" + allowance + " salary =  "+calculateSalary();
	}

}
