package com.zy.designpattern.decoratorpattern;

public class Mocha extends CondimentDecorator {

	public Mocha(Beverage b) {
		//super(b);
		this.b = b;
		this.cost = 0.3;
		this.description = ", Mocha";
		// TODO Auto-generated constructor stub
	}
	
}
