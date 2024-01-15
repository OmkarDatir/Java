package com.app.fruits;
public class Fruit {
	private String color;
	private double weight;
	private String name;
	private boolean fresh;
	
	public Fruit(String c, double w, String n, boolean f) {
		this.color = c;
		this.weight = w;
		this.name = n;
		this.fresh = f;
	}
	
	public String taste() {
		return "no specific taste";
	}
	public String getName() {
		return this.name;
	}
	public double getWeight() {
		return this.weight;
	}
	public String getColor() {
		return this.color;
	}
	public boolean getFresh() {
		return this.fresh;
	}
	public void setFreshStale() {
		 this.fresh = false;
	}
	public String toString() {
		return "name : " + this.name + ", color : " + this.color + ", weight : " + this.weight + "\n";
	}

}
