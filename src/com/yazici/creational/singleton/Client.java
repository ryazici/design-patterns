package com.yazici.creational.singleton;

public class Client {

	public static void main(String[] args) {
		
		Singleton instance1=Singleton.getInstance();
		Singleton instance2=Singleton.getInstance();

		BillPughSingleton instance3=BillPughSingleton.getInstance();
		BillPughSingleton instance4=BillPughSingleton.getInstance();
		
		if(instance1.equals(instance2))
			System.out.println("Same object in every object request");
		
	
		if(instance3.equals(instance4))
			System.out.println("Same object in every object request with Bill Pugh way");
		
		
		
	}

}
