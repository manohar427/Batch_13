package com.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemno {

	public static void main(String[] args) {
		Map m = new LinkedHashMap();

		m.put(1, "One");
		m.put("abc", 45.67);
		m.put(null, 34345);
		m.put(1, "One1");
		m.put(34, null);

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
