package com.set;

import java.util.Set;

public class LinkedHashSet {

	public static void main(String[] args) {
		Set s = new java.util.LinkedHashSet();
	     
	     s.add(34);
	     s.add(678);
	     s.add(789);
	     s.add(789);
	     s.add(789);
	     s.add(7);
	     
	     
	     System.out.println(s);
	}

}
