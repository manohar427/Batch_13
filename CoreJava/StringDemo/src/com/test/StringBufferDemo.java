package com.test;

public class StringBufferDemo {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		sb.append("abc");//Mutable
		sb.append("def");
		
		String name = sb.toString();
		System.out.println(name.length());
		
		
		
	}
}
