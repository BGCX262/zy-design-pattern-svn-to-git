package com.zy.designpattern.factorypattern;

public class SimplePizzaStore {
	private SimplePizzaFactory pizzaFactory;
	
	public SimplePizzaStore(SimplePizzaFactory pizzaFactory) {
		this.pizzaFactory = pizzaFactory;
	}
	
	public Pizza orderPizza(String type) {
		Pizza pizza = pizzaFactory.createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		System.out.println("Here is your " + pizza.getName() + ", Enjoy it!");
		return pizza;
	}
}
