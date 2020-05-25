package com.reliance.jio.assignments.assignment3;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class SpecialStack {
	private List<Integer> specialStack;
	private int top;
	
	public SpecialStack() {
		this.specialStack = new ArrayList<Integer>();
	}
	
	public int size() {
		return top;
	}
	
	public boolean isEmpty() {
		return top==0;
	}
	
	public void push(int number) {
		specialStack.add(number);
		top++;
	}
	
	public int pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		
		int number = specialStack.remove(size()-1);
		top--;
		return number;
	}
	
	public int peek() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		
		int number = specialStack.get(size()-1);
		return number;
	}
	
	public void printSpecialStack() {
		System.out.println("***********print stack elements start***************");
		for (int i=top-1; i>=0; i--) {
			System.out.print(specialStack.get(i)+ " ");
		}
		System.out.println();
		System.out.println("***********print stack elements end***************");
	}
}
