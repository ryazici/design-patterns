package com.yazici.behavioral.observer;

public class BulkPurchaser implements Observer {

	int stock;
	double price;
	Subject subject;
	
	{
		stock = 6;
		price = 5.5;
	}
	
	public BulkPurchaser(Subject subject) {
		this.subject=subject;
		this.subject.subscribe(this);
	}
	
	
	
	@Override
	public void update(int stock, double price) {
		if(stock >= 10 )
			System.out.println("I can buy more than 10.");
		
		this.stock=stock;
		this.price=price;
	}

}
