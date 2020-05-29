package com.reliance.jio.assignments.assignment9;

import java.util.Observable;
import java.util.Observer;

public class WeatherReportAajTak implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("**********WeatherReportAajTak**********");	
		System.out.println("Current temperature from WeatherReportAajTak is "+(Integer)arg);
						
	}

}
