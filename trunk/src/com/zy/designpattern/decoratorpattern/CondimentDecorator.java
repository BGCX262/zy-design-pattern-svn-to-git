package com.zy.designpattern.decoratorpattern;

public class CondimentDecorator extends Beverage {
	Beverage b;
	
	//we are not suppose to instantiate a CondimentDecorator object, so it should not have a constructor
	/*public CondimentDecorator(Beverage b) {
		this.b = b;
		this.description = "unknown condiment.";
	}*/
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return b.getCost() + this.cost;
	}
	
	@Override
	public String getDescription() {
		return b.getDescription() + this.description;
	}
}
