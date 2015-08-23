package com.zy.designpattern.abstractfactorypattern;

public class NYStylePizzaStore extends PizzaStore{

	PizzaIngredientFactory ingredientFactory; 
	public NYStylePizzaStore() {
		this.ingredientFactory = new NYStylePizzaIngredientFactory();
	}
	
	@Override
	public Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		Pizza pizza = null;
		if(type=="cheese") {
			pizza = new CheesePizza(this.ingredientFactory);
		}
		else if(type=="dough") {
			pizza = new VeggiePizza(this.ingredientFactory);
		}
		else if (type=="clam") {
			pizza = new ClamPizza(this.ingredientFactory);
		}
		
		return pizza;
	}

}
