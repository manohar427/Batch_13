package com.exception;

public class ExceptionDemo {

	public static void main(String[] args) {

		try{
			int avg = 100/10;
			System.out.println("Avg:"+avg);
		}catch(ArithmeticException e){
			System.out.println("Please provide valid data /cannot divide by 0");
		}

		System.out.println("Avg calculation is done");
		
	}

}
