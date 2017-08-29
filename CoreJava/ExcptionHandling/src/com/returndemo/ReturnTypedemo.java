package com.returndemo;

public class ReturnTypedemo {

	public static void main(String[] args) {
 System.out.println(getAvg());
	}

	
	public static int getAvg(){
		
		int avg = 0; 
		try{
			avg = 100/0;
			return 50;//3
		}catch(ArithmeticException e){
			//return 1;
		}finally{
		//	return 1000;//2
		}
		return avg;//1
	}
}
