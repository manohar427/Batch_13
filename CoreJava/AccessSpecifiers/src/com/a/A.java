package com.a;

public class A extends A1{

	public void getCC()
	{
		System.out.println(name);
		System.out.println(phNo);
	}
	public static void main(String[] args) {
     
		A1 a1 = new A1();
		
		String name  = a1.name;
		long phNo = a1.phNo;
	}

}
