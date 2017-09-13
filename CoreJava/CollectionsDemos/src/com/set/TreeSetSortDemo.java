package com.set;

import java.util.Set;
import java.util.TreeSet;

import com.map.Student;

public class TreeSetSortDemo {

	public static void main(String[] args) {
     Set s = new TreeSet();
     
     Student s1 = new Student("John", 50);
		Student s2 = new Student("Mike", 30);
		Student s3 = new Student("Paul", 90);
		Student s4 = new Student("Marry", 35);
		
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		
		System.out.println(s);
	}

}
