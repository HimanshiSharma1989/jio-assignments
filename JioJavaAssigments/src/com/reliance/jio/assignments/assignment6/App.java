package com.reliance.jio.assignments.assignment6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Worker implements Runnable{
	public String workerName;
	
	public Worker(String workerName) {
		this.workerName = workerName;
	}

	@Override
	public void run() {
		System.out.println("-----Thread workerName: "+workerName+" started------");	
		SingletonClass singletonClassInstance = SingletonClass.getInstance();
		System.out.println("singletonClassInstance: "+singletonClassInstance);
		System.out.println("-----Thread workerName: "+workerName+" call incrementCounter ------");
		singletonClassInstance.incrementCounter();
		System.out.println("-----Thread workerName: "+workerName+" call displayCounter ------");
		singletonClassInstance.displayCounter();
		System.out.println("-----Thread workerName: "+workerName+" ended------");	
	}
	
}



public class App {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		for(int i=1; i<=5; i++) {
			executorService.execute(new Worker("Worker-"+i));
		}
		executorService.shutdown();
	}
}
