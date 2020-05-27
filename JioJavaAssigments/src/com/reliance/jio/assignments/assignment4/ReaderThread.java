package com.reliance.jio.assignments.assignment4;

import java.util.ArrayList;
import java.util.List;

public class ReaderThread extends Thread {
	private ConcurrentMultiMap multiMap;
	private ArrayList<Employee> employeeList;
	private String name;
	
	public ReaderThread(ConcurrentMultiMap multiMap,  ArrayList<Employee> employeeList, String name) {
		super();
		this.multiMap = multiMap;
		this.employeeList = employeeList;
		this.name = name;
	}

	@Override
	public void run() {
	//	ConcurrentHashMap.KeySetView<Integer, String> keySetView = multiMap.keySet();
	//	Iterator<Integer> iterator = keySetView.iterator();
		
		long time = System.currentTimeMillis();
		String output = time + ": " + name + ": ";
		
	//	while (iterator.hasNext()) {
	//		Integer key = (Integer) iterator.next();
	//		String value = map.get(key);
	//		output += key + "=>" +value+ "; ";			
	//	}
		System.out.println(output);
		for (Employee e : employeeList) {
			System.out.println("Employee Details: "+e);
			System.out.println(e.getId()+ "-" +e.getName()+ "-"+e.getAge());
			ArrayList<String> taskList = multiMap.get(e);
			System.out.println("Employee Tasks:");
			System.out.println(taskList);
			for(String task : taskList) {
				System.out.print(task+" ");
			}
			System.out.println("***************************");
		}
	
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
