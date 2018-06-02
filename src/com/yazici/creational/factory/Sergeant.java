package com.yazici.creational.factory;

public class Sergeant extends Soldier {
	
	private Rank rank;

	public Sergeant(String name,Rank rank) {
		super.setName(name);
		this.rank=rank;
	}

	public void obey() {
		
		System.out.println(toString() +" and He/She performs orders");
	}
	
	@Override
	public String toString() {
		return super.getName() + " is a " + rank;
	}
}
