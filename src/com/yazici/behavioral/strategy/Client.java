package com.yazici.behavioral.strategy;

public class Client {

	public static void main(String[] args) {
		
		Strategy conventional = new Strategy();
		
		
		conventional.operation(new ConventionalOperation());
		
		
		conventional.operation(new ModernOperation());

	}

}
