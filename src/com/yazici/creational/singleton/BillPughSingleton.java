package com.yazici.creational.singleton;

public class BillPughSingleton {

	//private&only constructor
	private BillPughSingleton() {};
	
	//inner static class for lazy loading and constant object 
	private static class InnerSingletonClass{
		private static final BillPughSingleton instance=new BillPughSingleton();
	}
	//get single object method
	public static BillPughSingleton getInstance() {
		return InnerSingletonClass.instance;
	}
}
