package com.reliance.jio.assignments.assignment6;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SingletonClass {
	
	private static volatile SingletonClass singletonClassInstance;
	private int counter = 0;
	private ReadWriteLock rwLock = new ReentrantReadWriteLock();
	
	public static SingletonClass getInstance() {
		
		if (singletonClassInstance == null) {
			synchronized (SingletonClass.class) {
				if (singletonClassInstance == null) {
					singletonClassInstance = new SingletonClass();
				}
			}		
		}	
		return singletonClassInstance;
	}
	
	public void incrementCounter() {
		Lock writeLock = rwLock.writeLock();
		writeLock.lock();		
		try {
			System.out.println("Counter Value before increment: "+counter);
			counter++;
			System.out.println("Counter Value after increment: "+counter);
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			writeLock.unlock();
		}
		
	}
	
	public void displayCounter() {
		Lock readLock = rwLock.readLock();
		readLock.lock();
		try {
			System.out.println("Counter Value in displayCounter: "+counter);
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			readLock.unlock();
		}
	}
}
