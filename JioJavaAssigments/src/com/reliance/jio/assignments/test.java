package com.reliance.jio.assignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.ConcurrentHashMap;

//Test file
public class test {
	
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<String> list2 = new ArrayList<String>();
		
		for (int i=1; i<=5; i++) {
			list1.add(i);
		}
		
		list2.add("Ankit");
		list2.add("Abhinav");
		list2.add("Anish");
		list2.add("Anuraag");
		list2.add("Arunesh");
		
		
		// iterating list1
		Iterator<Integer> iterator1 = list1.iterator();
		while(iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		
		// iterating list2
		ListIterator<String> listIterator2 = list2.listIterator();
		while(listIterator2.hasNext()) {
			System.out.println(listIterator2.next());
		}
		
		
		
	}
}
