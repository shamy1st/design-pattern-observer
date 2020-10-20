package com.shamy1st.observer;

public class DataSource extends Observable {

	//when this value changes the other objects must be notified
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
		super.notifyObservers(value);
	}
}
