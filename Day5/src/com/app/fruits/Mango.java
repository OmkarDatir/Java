package com.app.fruits;

public class Mango extends Fruit{

	public Mango() {
		super("Yellow", 150.9, "Mango", true);
	}
	public String taste() {
		return "sweet";
	}
	public String toString() {
		return  super.toString();
	}
	public void pulp() {
		System.out.println(this.getName() + ", color: "+this.getColor() +" craeting pulp" );
	}

}