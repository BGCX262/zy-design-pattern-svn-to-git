package com.zy.designpattern.decoratorpattern;

public class StarBuzzCoffee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Beverage darkRoast = new DarkRoast();
		//System.out.print(darkRoast.getCost()+"\n");
		//darkRoast = new Whip(darkRoast);
		//darkRoast = new Mocha(darkRoast);
		
		Beverage darkRoast = new Mocha(new Mocha(new Whip(new DarkRoast())));
		System.out.println("the order is:"+ darkRoast.getDescription()+" and the cost is $ "+darkRoast.getCost());
	}

}
