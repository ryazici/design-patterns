package com.yazici.behavioral.observer;

public interface Subject {
	
	public void subscribe(Observer o);
    public void unrsubscribe(Observer o);
    public void notifyObservers();
	
}
