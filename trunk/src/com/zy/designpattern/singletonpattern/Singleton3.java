package com.zy.designpattern.singletonpattern;

public class Singleton3 {
	private static Singleton3 uniqueInstance;
	
	private Singleton3() {}
	
	public static Singleton3 getInstance() {
		if(uniqueInstance==null) {
			synchronized(Singleton3.class) {
				if(uniqueInstance==null) {
					uniqueInstance = new Singleton3();
				}
			}
		}
		return uniqueInstance;
	}
}
