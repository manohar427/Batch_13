package com.set;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		Set s = new TreeSet(Collections.reverseOrder());
	     
	     s.add(34);
	     s.add(678);
	     s.add(789);
	     s.add(789);
	     s.add(789);
	     s.add(7);
	     
	     
	     System.out.println(s);
	}

}
