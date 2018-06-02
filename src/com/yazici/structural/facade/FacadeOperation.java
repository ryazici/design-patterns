package com.yazici.structural.facade;

public class FacadeOperation {

	public void doOperation() {

		Operation op = new Operation();
		boolean checkOperation = new CheckOperation(true).isCheck();
		String arg = new PrepArgument().prepareArg();

		if (checkOperation)
			op.opetaion(arg);

	}

}
