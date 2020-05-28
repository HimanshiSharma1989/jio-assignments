package com.reliance.jio.assignments.assignment7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableAndFutureExample {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		int number1=10;
		int number2=20;
		int number3=8;
		Future<Integer> factorialCalculatorFuture1  = executorService.submit(new FactorialCalculator(number1));
		Future<Integer> sumCalculatorFuture  = executorService.submit(new SumCalculator(number2));
		Future<Integer> factorialCalculatorFuture2  = executorService.submit(new FactorialCalculator(number3));
		
		try {
			int factorialCalculatorResult1 = factorialCalculatorFuture1.get();
			System.out.println("factorialCalculatorResult for number "+number1+" is: "+factorialCalculatorResult1);
			Integer sumCalculatorResult = sumCalculatorFuture.get();
			System.out.println("sumCalculatorResult for number "+number2+" is: "+sumCalculatorResult);
			Integer factorialCalculatorResult2 = factorialCalculatorFuture2.get();
			System.out.println("factorialCalculatorResult for number "+number3+" is: "+factorialCalculatorResult2);
			
			
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		List<Future<Integer>> futureResultList = new ArrayList<Future<Integer>>();
		Random random = new Random();
		for (int i=1; i<=5; i++) {
			Integer number = random.nextInt(10);
			Future<Integer> futureResult = executorService.submit(new FactorialCalculator(number));
			futureResultList.add(futureResult);
		}
		for (Future<Integer> futureResult : futureResultList) {
			try {
				Integer result = futureResult.get();
				System.out.println("future result is: "+result);
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		executorService.shutdown();
	}
}
