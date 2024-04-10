package com.cdac.staff;

import com.cdac.utility.Employee;

public class Programmer extends Employee {

	private String projectTitle;
	private int extraHours;
	private double chargesPerExtraHours;
	public Programmer(int extraHours, String projectTitle, double chargesPerExtraHours,int eid, double basicSalary, String name, int day, int month, int year) {
		super(eid, basicSalary, name, day, month, year);
		// TODO Auto-generated constructor stub
		this.projectTitle=projectTitle;
		this.extraHours=extraHours;
		this.chargesPerExtraHours=chargesPerExtraHours;
	}

	public double calculateSalary()
	{
		return basicSalary+(extraHours*chargesPerExtraHours);
	}
	public String toString() {
		return "Programmer :: "+super.toString()+"projectTitle=" + projectTitle + ", extraHours=" + extraHours + ", chargesPerExtraHours="
				+ chargesPerExtraHours + " salary = "+calculateSalary();
	}
}
