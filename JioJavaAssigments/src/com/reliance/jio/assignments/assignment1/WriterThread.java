package com.reliance.jio.assignments.assignment1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

public class WriterThread extends Thread {
	private ConcurrentHashMap<Integer, String> map;
	private ArrayList<Integer> list1;
	private ArrayList<String> list2;

	private Random random;
	private String name;

	

	public WriterThread(ConcurrentHashMap<Integer, String> map, ArrayList<Integer> list1, ArrayList<String> list2,
			long randomSeed, String name) {
		super();
		this.map = map;
		this.list1 = list1;
		this.list2 = list2;
		this.random = new Random(randomSeed);
		this.name = name;
	}



	@Override
	public void run() {
		
		Iterator<Integer> iterator1 = list1.iterator();
		ListIterator<String> listIterator1 = list2.listIterator();
		
		while(iterator1.hasNext() && listIterator1.hasNext()) {
			Integer key = iterator1.next();
			String value = listIterator1.next();
			if(map.putIfAbsent(key, value) == null) { long time =
					System.currentTimeMillis(); String output =
					String.format("%d: %s has put [%d => %s]",time, name, key, value);
					System.out.println(output);
			}
		}
		
		Iterator<Integer> iterator2 = list1.iterator();
		ListIterator<String> listIterator2 = list2.listIterator();
		
		while(iterator2.hasNext() && listIterator2.hasNext()) {
			Integer keyToRemove = iterator2.next(); 
			String value = listIterator2.next();
			if (map.remove(keyToRemove, value)){ 
			 long time = System.currentTimeMillis(); String output =
			 String.format("%d: %s has removed [%d => %s]",time, name, keyToRemove,value); 
			 System.out.println(output); 
			}
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
