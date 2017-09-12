package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		List al = new ArrayList();

		al.add(123);
		al.add("Abc");
		al.add(234.56);
		al.add(234.56);
		al.add(234.56);

		System.out.println("Size:" + al.size());// 3

		System.out.println(al.get(2));

		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println("----------");
		for (Object o : al) {
			System.out.println(o);
		}
		System.out.println("-------------");
		Iterator it = al.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("-----------LI");

		ListIterator li = al.listIterator();

		while (li.hasNext()) {
			System.out.println(li.next());
		}

		System.out.println("-----------LI");

		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}

		System.out.println("Before :"+al);
		al.remove(1);
		System.out.println("After :"+al);
	}

}
