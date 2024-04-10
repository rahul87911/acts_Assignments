package com.app.fruits;

public class Apple extends Fruits {

	public Apple(String color, double weight, String name, boolean fresh) {
		super(color, weight, name, fresh);

	}

	@Override
	public String taste() {
		return "sweet n sour";
	}

	

	@Override
	public boolean getFresh() {
		// TODO Auto-generated method stub
		return super.getFresh();
	}

	public void jam() {
		System.out.println(super.getName()+" making Jam !");
	 }


}
