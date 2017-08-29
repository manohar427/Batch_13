package com.sample;

public class ExceptionDemo {

	public static void main(String[] args) {
           
		//int avg = new Integer(args[0])/new Integer(args[1]);
		
		//System.out.println("Avg:"+avg);
		
		/*int marks[] = {10,20,30};
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		
		System.out.println("Array data display completed.");*/
		
		String name = null;
		
		if(name != null){
			System.out.println(name.length());
		}else{
			System.out.println("No valid object");
		}
		
	}

}
