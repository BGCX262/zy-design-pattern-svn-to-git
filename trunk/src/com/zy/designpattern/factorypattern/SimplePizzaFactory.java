package com.zy.designpattern.factorypattern;

public class SimplePizzaFactory {
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if(type=="cheese") {
			pizza = new CheesePizza();
		}
		else if(type=="veggie") {
			pizza = new VeggiePizza();
		}
		else if (type=="clam") {
			pizza = new ClamPizza();
		}
		else {
			System.out.println("Sorry, no such pizza...Please check your spell.");
		}
		return pizza;
	}
}
