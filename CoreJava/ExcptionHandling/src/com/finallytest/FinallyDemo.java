package com.finallytest;

public class FinallyDemo {

	public static void main(String[] args) {
		int avg = 0;
		try{
			avg =100/0;//
			//System.out.println("Avg:"+avg);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Please provide valid data");
		}finally{//1
			System.out.println("Avg calculation is done with result:"+avg);
		}
		
		System.out.println("Avg calculation is done.");
		
		
		
		try{
			
		}finally{
			//2
		}
		
		try{
			
		}catch(Exception e){
			//3
		}
		
		
	}

}
