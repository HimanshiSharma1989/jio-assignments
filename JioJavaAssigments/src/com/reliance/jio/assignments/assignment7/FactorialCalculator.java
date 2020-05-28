package com.reliance.jio.assignments.assignment7;

import java.util.concurrent.Callable;

/**This class represents a task that calculates factorial of number
 * @author HP
 *
 */
public class FactorialCalculator implements Callable<Integer> {
	private int number;
	
	public FactorialCalculator(int number) {
		this.number = number;
	}

	@Override
	public Integer call() throws Exception {
		int result=1;
		for (int i=1; i<=number; i++) {
			result = result*i;
		}
		System.out.println("Factorial Result for number "+number+" is: "+result);
		try {
			Thread.sleep(100);
		}catch(InterruptedException ex) {
			ex.printStackTrace();
		}
		return result;
	}

}
