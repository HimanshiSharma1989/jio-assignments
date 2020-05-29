package com.reliance.jio.assignments.assignment8;

import java.util.Timer;

public class ScheduleTimer {	
	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.schedule(new IncrementCounterTask(), 1000, 2000);
	}
}
