package com.app.cms;

import java.time.LocalDate;

public class CustomerAccount {
//Customer should be assigned system generated (auto increment) 
//customer id : int Store - first name, last name, email(string),
//password(string),
//registrationAmount(double),dob(LocalDate),plan(ServicePlan : enum)

	private static int  idcnt;
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private double regAmt;
	private LocalDate dob;
	private PlanType plan;
	private boolean sub;
	
	static {
		idcnt=1;
	}

	public CustomerAccount( String firstName,
			String lastName, String email, String password,
			double regAmt,LocalDate dob, PlanType plan) 
	{
		super();
		this.id = idcnt;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.regAmt = regAmt;
		this.dob = dob;
		this.plan = plan;
		this.sub=true;
		idcnt++;
	}
	
	public CustomerAccount(String email) {
		super();
		this.email = email;
	}
	
	

	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
	@Override
	public boolean equals(Object o)
	{
		if(o instanceof CustomerAccount)
		{
			CustomerAccount a = (CustomerAccount)o;
			return this.email.equals(a.email); // email is primary key
		}
		return false;
	}
	
	@Override
	public String toString()
	{
		return "CustomerAccount [Id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email+ ", password="+ password+ ", Registration Amount="+ regAmt + ", dob=" + dob +", Plan: "+plan
				+", "+(sub?"Subscribed":"Unsubscribed")+"]";
		
	}

	public void setSub() {
		this.sub = false;
	}
	
}
