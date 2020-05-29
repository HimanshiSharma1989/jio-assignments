package com.reliance.jio.assignments.assignment9;

import java.util.Observable;
import java.util.Observer;

public class WeatherReportNDTV implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("**********WeatherReportNDTV**********");	
		System.out.println("Current temperature from WeatherReportNDTV is "+(Integer)arg);
				
		
	}

}
