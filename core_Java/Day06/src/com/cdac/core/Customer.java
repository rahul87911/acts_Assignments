package com.cdac.core;

public class Customer {
private int id;
private String name;
private String address;

public Customer(int id, String name, String address) {
	this.id = id;
	this.name = name;
	this.address = address;
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return "Id "+id+" Name "+name+" Address "+address;
	
}





}
