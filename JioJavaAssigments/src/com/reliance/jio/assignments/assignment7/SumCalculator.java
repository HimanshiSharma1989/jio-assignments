package com.reliance.jio.assignments.assignment7;

import java.util.concurrent.Callable;

/**This class represents a task that calculates sum of 1 to N numbers
 * @author HP
 *
 */
public class SumCalculator implements Callable<Integer> {
	private int number;
	
	public SumCalculator(int number) {
		this.number = number;
	}

	@Override
	public Integer call() throws Exception {
		int result = 0;
		for (int i = 1; i <= number; i++) {
			result = result + i;
		}
		
		try {
			Thread.sleep(200);
		}catch(InterruptedException ex) {
			ex.printStackTrace();
		}
		
		return result;
	}
	
	

}
