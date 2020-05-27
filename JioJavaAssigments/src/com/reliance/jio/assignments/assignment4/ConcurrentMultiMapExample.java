package com.reliance.jio.assignments.assignment4;

import java.util.ArrayList;

public class ConcurrentMultiMapExample {
	
	public static void main(String[] args) {
		ConcurrentMultiMap multiMap = new ConcurrentMultiMap();
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		
		Employee e1 = new Employee(1, "Himanshi", 30);
		employeeList.add(e1);
		Employee e2 = new Employee(2, "Ankit", 35);
		employeeList.add(e2);
		Employee e3 = new Employee(3, "Abhinav", 33);
		employeeList.add(e3);
		
		ArrayList<String> tasksList1 = new ArrayList<String>();
		tasksList1.add("task1");
		tasksList1.add("task2");
		tasksList1.add("task3");
		
		ArrayList<String> tasksList2 = new ArrayList<String>();
		tasksList2.add("task4");
		tasksList2.add("task5");
		tasksList2.add("task6");
		
		ArrayList<String> tasksList3 = new ArrayList<String>();
		tasksList3.add("task7");
		tasksList3.add("task8");
		tasksList3.add("task9");
		
		multiMap.put(e1, tasksList1);
		multiMap.put(e2, tasksList2);
		multiMap.put(e3, tasksList3);

		new WriterThread(multiMap, 1, "Writer-1").start();
		new WriterThread(multiMap, 2, "Writer-2").start();
		
		for (int i=1; i<=1; i++) {
			new ReaderThread(multiMap, employeeList, "Reader-"+i).start();
		}
	}
}
