package com.yazici.structural.proxy;

public class OperationProxy implements Operation {

	private Operation operation;
	private boolean authenticationCheck;
	private boolean authorizationCheck;
	
	{
		authenticationCheck=true;
		authorizationCheck=true;
	}
	
	
	public OperationProxy() {
		operation=new OperationImpl();
	}
	
	
	@Override
	public void doOperation() {
		if(authenticationCheck && authorizationCheck)
			operation.doOperation();
	}

}
