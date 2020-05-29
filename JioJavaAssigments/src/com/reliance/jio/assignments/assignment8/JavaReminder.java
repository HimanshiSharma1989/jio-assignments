package com.reliance.jio.assignments.assignment8;

import java.util.Timer;
import java.util.TimerTask;

public class JavaReminder {
	Timer timer;

	public JavaReminder(int seconds) {
		timer = new Timer();
		timer.schedule(new RemindTask(), seconds*1000);
	}
	
	class RemindTask extends TimerTask{

		@Override
		public void run() {
			System.out.println("Reminder task is executed by timer");	
			timer.cancel();
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("Reminder is about to start!!!");
		JavaReminder javaReminder = new JavaReminder(5);
		System.out.println("Reminder task has been scheduled with java timer");
	}
}
