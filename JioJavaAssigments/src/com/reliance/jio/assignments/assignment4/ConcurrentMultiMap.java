package com.reliance.jio.assignments.assignment4;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ConcurrentMultiMap extends ConcurrentHashMap {
	private ConcurrentHashMap<Employee, ArrayList<String>> map;
	private int top;
	private ReadWriteLock rwLock = new ReentrantReadWriteLock();
		
	public ConcurrentMultiMap() {
		this.map = new ConcurrentHashMap<Employee, ArrayList<String>>();
	}
	
	public int size() {
		return top;
	}
	
	public boolean isEmpty() {
		return top==0;
	}
	
	public void put(Employee e, ArrayList<String> tasks) {
		System.out.println(e.toString());
		System.out.println(tasks);
		Lock writeLock = rwLock.writeLock();
		writeLock.lock();
		
		try {
			map.put(e, tasks);		
		} finally {
			writeLock.unlock();
		}
		top++;
	}
	
	public ArrayList<String> get(Employee e){
		System.out.println(e);
		ArrayList<String> tasks = new ArrayList<String>();
		Lock readLock = rwLock.readLock();
		readLock.lock();
		System.out.println(map);
		try {
			tasks = map.get(e);	
		} finally {
			readLock.unlock();
		}
		return tasks;
	}
	
	public void remove(Employee e) {
		Lock writeLock = rwLock.writeLock();
		writeLock.lock();
		
		try {
			map.remove(e);		
		} finally {
			writeLock.unlock();
		}
		top--;
	}
}
