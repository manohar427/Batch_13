package com.inface;

public class InterfaceDemo {

	public static void main(String[] args) {

		System.out.println(I1.age);
		
		//I1.age = 20;
		
		I2 im = new I11_Impl();
		int x = 10;
		//callDiff(im,x);
		
	}

	public static void callDiff(I1 y,int p){
		//y.diff();
	}
}
