package com.reliance.jio.assignments.assignment9;

import java.util.Observable;
import java.util.Observer;

public class WeatherReportStarNews implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("**********WeatherReportStarNews**********");	
		System.out.println("Current temperature from WeatherReportStarNews is "+(Integer)arg);
				
	}

}
