package com.shamy1st.observer;

public class SpreadSheet implements Observer {
	
	@Override
	public void update(int value) {
		System.out.println("Spreadsheet notified: "+value);
	}
}
