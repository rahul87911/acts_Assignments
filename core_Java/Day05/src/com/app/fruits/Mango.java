package com.app.fruits;

public class Mango extends Fruits {

	
	

	@Override
	public boolean getFresh() {
		// TODO Auto-generated method stub
		return super.getFresh();
	}

	public Mango(String color, double weight, String name, boolean fresh) {
		super(color, weight, name, fresh);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String taste() {
		// TODO Auto-generated method stub
		return "sweet";
	}

	public void pulp() {
	System.out.println(super.getName()+super.getColor()+" creating pulp !");
	}
	

}
