package com.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		Map m = new TreeMap();

		m.put(1, "One");
		//m.put("Y", 415.67);
	//	m.put("P", 450.67);
		//m.put("I", 345.67);
		//m.put(null, 34345);
		m.put(1, "One1");
		m.put(3, null);
		m.put(304, null);
		m.put(4, null);

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
