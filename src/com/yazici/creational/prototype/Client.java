package com.yazici.creational.prototype;

public class Client {
	public static void main(String[] args) throws CloneNotSupportedException {
	
		Original org=new Original();
		
		org.longProcess2LoadList();
		org.anotherLongProcess2LoadList();
		
		Original clone=(Original) org.clone();
		
		//original object
		System.out.println("Original object list");
		for (Object string : org.list) {
			System.out.println(string);
		}
		System.out.println("------------------------");
		//clone object
		System.out.println("Clone object list");
		for (Object string : clone.list) {
			System.out.println(string);
		}
		
		
	}
}
