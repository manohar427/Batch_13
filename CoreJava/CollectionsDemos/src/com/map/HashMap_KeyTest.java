package com.map;

import java.util.HashMap;
import java.util.Map;

public class HashMap_KeyTest {

	public static void main(String[] args) {
        Customer c1 = new Customer("John",3456);
        Customer c2 = new Customer("John",3456);
        Customer c3 = new Customer("Lorry",453321);
        Customer c4 = new Customer("Mike",4432);
        
        Map m = new HashMap();
        m.put(c1, "C1");
        m.put(c2, "C2");
        m.put(c3, "C3");
        m.put(c4, "C4");
        
        System.out.println(m);
	}

}
