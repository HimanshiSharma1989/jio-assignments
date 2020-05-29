package com.reliance.jio.assignments.assignment9;

import java.util.Observable;

public class MumbaiWeather extends Observable{
	public void updateTempInMorning() {
		setChanged();
		notifyObservers(new Integer(25));
	}
	public void updateTempInNoon() {
		setChanged();
		notifyObservers(new Integer(30));
	}
	public void updateTempInEvening() {
		setChanged();
		notifyObservers(new Integer(27));
	}
	public void updateTempInNight() {
		setChanged();
		notifyObservers(new Integer(24));
	}
}
