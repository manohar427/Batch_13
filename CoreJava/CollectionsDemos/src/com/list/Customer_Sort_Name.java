package com.list;

import java.util.Comparator;

public class Customer_Sort_Name implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Customer c1 = (Customer)o1;
		Customer c2 = (Customer)o2;
		
		return c1.name.compareTo(c2.name);
	}
}
