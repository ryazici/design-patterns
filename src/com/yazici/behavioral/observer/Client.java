package com.yazici.behavioral.observer;

public class Client {

	public static void main(String[] args) {
		
		Store store = new Store();
		
		Observer discountHunter = new DiscountHunter(store);
		Observer bulkPurchaser = new BulkPurchaser(store);
		
	    
	    store.setPrice(4);
	    store.setStock(12);

	}

}
