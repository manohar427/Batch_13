package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.map.Student;

public class SortList {

	public static void main(String[] args) {

		List s = new ArrayList();

		Student s1 = new Student("John", 50);
		Student s2 = new Student("Mike", 30);
		Student s3 = new Student("Paul", 90);
		Student s4 = new Student("Marry", 35);

		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);

		System.out.println("Before Sort:"+s);
		Collections.sort(s);
		System.out.println("After  Sort:"+s);
	}

}
