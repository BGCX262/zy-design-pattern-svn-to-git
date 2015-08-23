package com.zy.designpattern.decoratorpattern;

public abstract class Beverage {
	protected String description;
	protected double cost;
	
	public String getDescription() {
		return this.description;
	}
	
	public abstract double getCost();
}
