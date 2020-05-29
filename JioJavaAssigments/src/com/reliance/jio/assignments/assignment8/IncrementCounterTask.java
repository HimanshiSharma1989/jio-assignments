package com.reliance.jio.assignments.assignment8;

import java.util.TimerTask;

public class IncrementCounterTask extends TimerTask{
	private int counter=0;
	@Override
	public void run() {
		System.out.println("Counter value before increment: "+counter);
		counter++;
		System.out.println("Counter value after increment: "+counter);
	}
}
