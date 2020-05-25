package com.reliance.jio.assignments.assignment3;

public class SpecialStackExample {
	
	public static void main(String[] args) {
		SpecialStack specialStack = new SpecialStack();
		
		//isEmpty
		System.out.println("check whether stack is empty: "+specialStack.isEmpty());
		
		//size
		System.out.println("Stack size: "+specialStack.size());

		// push 
		specialStack.push(123);
		specialStack.push(456);
		specialStack.push(789);
		specialStack.push(101);
		
		//size
		System.out.println("Stack size: "+specialStack.size());

		specialStack.printSpecialStack();
		//peek
		System.out.println("Peeked Element: "+specialStack.peek());
		
		//size
		System.out.println("Stack size: "+specialStack.size());

		//pop
		System.out.println("Popped Element: "+specialStack.pop());
		specialStack.printSpecialStack();
		
		//size
		System.out.println("Stack size: "+specialStack.size());

		//isEmpty
		System.out.println("check whether stack is empty: "+specialStack.isEmpty());
		

		
	}
}
