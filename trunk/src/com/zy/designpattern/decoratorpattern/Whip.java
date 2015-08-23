package com.zy.designpattern.decoratorpattern;

public class Whip extends CondimentDecorator{

	public Whip(Beverage b) {
		//super(b);
		this.b = b;
		this.description = ", Whip";
		this.cost = 0.5;
		// TODO Auto-generated constructor stub
	}

}
