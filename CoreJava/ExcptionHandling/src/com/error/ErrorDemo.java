package com.error;

public class ErrorDemo {

	public static void main(String[] args) {

		//1.Stack Over flow error
		A ob = new A();
		//ob.m1();
		
		//2.Out of memory Error
		long maxMemSize = Runtime.getRuntime().maxMemory();
		
		int array[] = new int[(int)maxMemSize];
		
		for(int i=0;i<maxMemSize;i++){
			array[i]=i;
		}
	}

}

class A{
	
	public void m1(){
		m2();
	    System.out.println("m1()");
	}
	
	
	public void m2(){
		m1();
		System.out.println("m2()");
	}
	
}
