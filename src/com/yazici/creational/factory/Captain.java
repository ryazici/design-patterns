package com.yazici.creational.factory;

public class Captain extends Soldier {
	
	private Rank rank;
	
	public Captain(String name,Rank rank) {
		super.setName(name);		
		this.rank=rank;
	}
	
	public void order() {
		System.out.println(toString() +" and He/She gives orders");
		
	}

	@Override
	public String toString() {
		return super.getName() + " is a " + rank;
	}
	

}
