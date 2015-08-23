package com.zy.designpattern.factorypattern;

public abstract class PizzaStore {
	
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		System.out.println("Here is your " + pizza.getName() + ", Enjoy it!");
		return pizza;
	}
	
	public abstract Pizza createPizza(String type);
}
