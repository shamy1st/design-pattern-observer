package com.shamy1st.observer;

import java.util.ArrayList;
import java.util.List;

//Subject
public class Observable {

	private List<Observer> observers = new ArrayList<>();
	
	public void addObserver(Observer observer) {
		observers.add(observer);
	}
	
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}
	
	public void notifyObservers(int value) {
		observers.forEach(observer -> observer.update(value));
	}
}
