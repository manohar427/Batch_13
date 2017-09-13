package com.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapSortDemo {

	public static void main(String[] args) {

		Student s1 = new Student("John", 50);
		Student s2 = new Student("Mike", 30);
		Student s3 = new Student("Paul", 90);
		Student s4 = new Student("Marry", 35);
		Map m = new TreeMap();
		m.put(s1, "S1");
		m.put(s2, "S2");
		m.put(s3, "S3");
		m.put(s4, "S4");
		
		System.out.println(m);
	}

}
