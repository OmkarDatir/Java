package com.app.fruits;

public class Orange extends Fruit{
	
	public Orange() {
		super("Orangish", 80.2, "Orange", true);
	}
	
	public String taste() {
		return "sour";
	}
	public String toString() {
		return  super.toString();
	}
	public void juice() {
		System.out.println(this.getName()+", weight: "+this.getWeight()+" making extracting juice");
	}


}