package com.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
     Set s = new HashSet();
     
     s.add(34);
     s.add(678);
     s.add(789);
     s.add(789);
     s.add(789);
     s.add(7);
     
     
     System.out.println(s);
	}

}
