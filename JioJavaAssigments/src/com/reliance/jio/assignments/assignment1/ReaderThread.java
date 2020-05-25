package com.reliance.jio.assignments.assignment1;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ReaderThread extends Thread {
	private ConcurrentHashMap<Integer, String> map;
	private String name;

	public ReaderThread(ConcurrentHashMap<Integer, String> map, String name) {
		super();
		this.map = map;
		this.name = name;
	}

	@Override
	public void run() {
		ConcurrentHashMap.KeySetView<Integer, String> keySetView = map.keySet();
		Iterator<Integer> iterator = keySetView.iterator();
		
		long time = System.currentTimeMillis();
		String output = time + ": " + name + ": ";
		
		while (iterator.hasNext()) {
			Integer key = (Integer) iterator.next();
			String value = map.get(key);
			output += key + "=>" +value+ "; ";			
		}
		
		System.out.println(output);
		
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
