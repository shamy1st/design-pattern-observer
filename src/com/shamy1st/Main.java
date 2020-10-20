package com.shamy1st;

import com.shamy1st.observer.Chart;
import com.shamy1st.observer.DataSource;
import com.shamy1st.observer.SpreadSheet;

public class Main {

	public static void main(String[] args) {

		DataSource datasource = new DataSource();
		SpreadSheet sheet1 = new SpreadSheet();
		SpreadSheet sheet2 = new SpreadSheet();
		Chart chart = new Chart();
		
		datasource.addObserver(sheet1);
		datasource.addObserver(sheet2);
		datasource.addObserver(chart);
		
		datasource.setValue(100);
	}

}
