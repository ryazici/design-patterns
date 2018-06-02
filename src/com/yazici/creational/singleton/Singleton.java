package com.yazici.creational.singleton;

public class Singleton {

	//lazy initialization 
	private static Singleton instance;

	//private constructor
	private Singleton() {}

	//double check thread safe get single object method
	public static Singleton getInstance() {

		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null)
					instance= new Singleton();
			}

		}
		return instance;
	}
	
}
