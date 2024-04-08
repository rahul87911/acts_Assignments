package com.app.fruits;

public abstract class Fruits {
	private String color;
	private double weight;
	private String name;
	private boolean fresh;
	public Fruits(String color, double weight, String name, boolean fresh) {
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.fresh = fresh;
	}
	
	public String getColor() {
		return color;
	}

	public double getWeight() {
		return weight;
	}

	public String getName() {
		return name;
	}
	
	public boolean getFresh() {
		return fresh;
	}

	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+" "+color+" "+weight;
	}
	
	public abstract String taste();
	
}