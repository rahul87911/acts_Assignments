package com.app.fruits;

public class Orange extends Fruits {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return super.getColor();
	}

	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return super.getWeight();
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public boolean getFresh() {
		// TODO Auto-generated method stub
		return super.getFresh();
	}

	public Orange(String color, double weight, String name, boolean fresh) {
		super(color, weight, name, fresh);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String taste() {
		// TODO Auto-generated method stub
		return "sour";
	}
	
	public void juice() {
		System.out.println(super.getName()+super.getWeight()+" extracting Juice !"); 
	}

	

}
