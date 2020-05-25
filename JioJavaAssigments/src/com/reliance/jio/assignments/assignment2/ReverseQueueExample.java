package com.reliance.jio.assignments.assignment2;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueueExample {
	
	static void printQueue(Queue<Integer> queue) {
		while (!queue.isEmpty()) {
			System.out.print(queue.peek()+ " ");
			queue.remove();
		}
	}

	static Queue<Integer> reverseQueue(Queue<Integer> queue){
		
		// base condition of recursive call
		if (queue.isEmpty()) {
			return queue;
		}
		
		Integer element = queue.poll();
		queue = reverseQueue(queue);
		queue.add(element);
		return queue;
	}
	
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		Queue<Integer> reversedQueue = new LinkedList<Integer>();
		for(int i=10; i<=100; i=i+10) {
			queue.add(i);
		}
		
		System.out.println(queue);
		reversedQueue = reverseQueue(queue);
		System.out.println(reversedQueue);

		//printQueue(queue);
		
	}

}
