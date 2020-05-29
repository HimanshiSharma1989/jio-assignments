package com.reliance.jio.assignments.assignment9;

import java.util.Observable;
import java.util.Observer;

public class WeatherReportZeeNews implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("**********WeatherReportZeeNews**********");	
		System.out.println("Current temperature from WeatherReportZeeNews is "+(Integer)arg);
		
	}

}
