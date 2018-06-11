package com.yazici.behavioral.observer;

import java.util.ArrayList;

public class Store implements Subject {

	int stock;
	double price;
	
	ArrayList<Observer> observerList;
	
	
	public Store() {
		observerList = new ArrayList<Observer>();
	}
	
	@Override
	public void subscribe(Observer o) {
		observerList.add(o);
	}

	@Override
	public void unrsubscribe(Observer o) {
		observerList.remove(observerList.indexOf(o));
	}

	@Override
	public void notifyObservers() {
		for(Observer o:observerList) {
			o.update(stock, price);
		}

	}

	public int getStock() {
		return stock;
	
	}

	public void setStock(int stock) {
		this.stock = stock;
		notifyObservers();
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
		notifyObservers();
	}
	
	

}
