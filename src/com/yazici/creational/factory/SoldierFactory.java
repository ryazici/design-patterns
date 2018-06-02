package com.yazici.creational.factory;

public class SoldierFactory {

	public static Soldier getSoldier(String name,Rank rank) {
		
		if(rank==Rank.CAPTAIN)
			return new Captain(name,rank);
		
		else if(rank==Rank.SERGEANT)
			return new Sergeant(name,rank);
		
		return null;
	}
	
	
	
}
