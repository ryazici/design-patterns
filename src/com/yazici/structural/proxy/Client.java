package com.yazici.structural.proxy;

public class Client {
	public static void main(String[] args) {
		
		Operation operation=new OperationProxy();
		
		operation.doOperation();
	}

}
