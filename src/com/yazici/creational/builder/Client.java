package com.yazici.creational.builder;

public class Client {

	public static void main(String[] args) {
		
		
	  Software software=new Software.SoftwareBuilder(new String("obj1"))
								  .setObj2(new String("obj2"))
								  .build();
		
	  // Mandatory field
      System.out.println("Obj1 " + software.getObj1());
      // Optional field has set.
      System.out.println("Obj2 " + software.getObj2());	
      // Optional field didn't set.
      System.out.println("Obj3 " + software.getObj3());	

	}

}
