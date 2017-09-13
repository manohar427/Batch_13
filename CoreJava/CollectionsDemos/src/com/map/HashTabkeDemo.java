package com.map;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTabkeDemo {

	public static void main(String[] args) {
		Map m = new Hashtable();

		m.put(1, "One");
		m.put("Y", 415.67);
		m.put("P", 450.67);
		m.put("I", 345.67);
		//m.put(null, 34345);
		m.put(1, "One1");
		//m.put(34, null);

		System.out.println("Map:" + m);

		System.out.println(m.get(34));

		Set s = m.keySet();

		System.out.println("----------");
		Iterator li = s.iterator();

		while (li.hasNext()) {
			System.out.println(m.get(li.next()));
		}
	}

}
