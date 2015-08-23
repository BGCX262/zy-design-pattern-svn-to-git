package com.zy.designpattern.singletonpattern;

public class Singleton4 {
	private static Singleton4 uniqueInstance = new Singleton4();;
	
	private Singleton4() {}
	
	public static Singleton4 getInstance() {
		return uniqueInstance;
	}
}
