package com.yazici.creational.factory;

public class Client {

	public static void main(String[] args) {
		
		Sergeant sergeant=(Sergeant) SoldierFactory.getSoldier("John Doe", Rank.SERGEANT);
		
		Captain captain=(Captain) SoldierFactory.getSoldier("Jack Sparrow", Rank.CAPTAIN);
		
		captain.order();
		sergeant.obey();
		
		
	}

}
