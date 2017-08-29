package com.exception;

public class ExceptionDemo2 {

	public static void main(String[] args) {

		
		
		try{
			int all[] = {12,34,56};
			
			System.out.println(all[3]);//ari
			
			int avg = 100/10;//ar
			
			String name = null;
			System.out.println(name.length());
			
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("There is no 3rd index element");
		}
		catch(ArithmeticException e){
			System.out.println("Cannot be divide by 0");
		}
		catch(Exception e){
			System.out.println("Some unknow exception");
		}
	}

}
