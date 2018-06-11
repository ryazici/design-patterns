package com.yazici.behavioral.observer;

public class DiscountHunter implements Observer {

	int stock;
	double price;
	Subject subject;
	{
		stock = 6;
		price = 5.5;
	}
	
	
	public DiscountHunter(Subject subject) {
		this.subject=subject;
		this.subject.subscribe(this);
	}
	
	
	@Override
	public void update(int stock, double price) {
		if(this.price > price)
			System.out.println("Discount hunted.Oh ye");
		
		this.stock=stock;
		this.price=price;
		

	}

}
