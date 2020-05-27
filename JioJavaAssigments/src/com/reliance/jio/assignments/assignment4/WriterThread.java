package com.reliance.jio.assignments.assignment4;

import java.util.ArrayList;
import java.util.Random;

public class WriterThread extends Thread {
	private ConcurrentMultiMap multiMap;
	private Random random;
	private String name;
	
	public WriterThread(ConcurrentMultiMap multiMap, long randomSeed, String name) {
		super();
		this.multiMap = multiMap;
		this.random = new Random(randomSeed);
		this.name = name;
	}

	@Override
	public void run() {
		ArrayList<String> taskList = new ArrayList<String>();
		taskList.add("abcde");
		taskList.add("fghijk");
		multiMap.put(new Employee(4, "Anish", 32), taskList);
		
	//	multiMap.remove(new Employee(1, "Himanshi", 30));
	}
	
	
	

}
