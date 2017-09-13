package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.list.Customer;

public class ComparatorDemo {

	public static void main(String[] args) {
       List l = new ArrayList();
       
       Customer c1 = new Customer("John",3456);
       Customer c2 = new Customer("John",3456);
       Customer c3 = new Customer("Abc",453321);
       Customer c4 = new Customer("Mike",4432);
       l.add(c1);
       l.add(c2);
       l.add(c3);
       l.add(c4);
       System.out.println("Before Sort:"+l);
       Collections.sort(l,new Customer_Sort_Name());
       System.out.println("After Sort:"+l);
       
       
       System.out.println("Before Sort:"+l);
       Collections.sort(l,new Customer_Sort_empId());
       System.out.println("After Sort:"+l);
       
	}

}
