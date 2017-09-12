package com.list;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
 
		Stack s = new Stack();
		
		s.add("1234");
		s.add(4556);
		s.add(456);
		s.push(3344);
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
	}

}
