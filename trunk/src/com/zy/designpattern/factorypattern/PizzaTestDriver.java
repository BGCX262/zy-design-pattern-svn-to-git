package com.zy.designpattern.factorypattern;

public class PizzaTestDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimplePizzaStore ps = new SimplePizzaStore(new SimplePizzaFactory());
		ps.orderPizza("veggie");
	}

}
