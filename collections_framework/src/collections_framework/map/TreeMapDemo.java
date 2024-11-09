package collections_framework.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

// difference :
// it maintains ordered based on keys.

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		
		tm.put(1001, "Wills@gmail.com");
		tm.put(1004, "Jones@gmail.com");
		tm.put(1005, "Martin@gmail.com");
		tm.put(1003, "Smith@gmail.com");
		tm.put(1002, "Gaurav@gmail.com");

		System.out.println(tm);
		
		// duplicate keys are not allowed.
		tm.put(1002, "Sairam@gmail.com");
		System.out.println(tm);
		
		// duplicate values are allowed.
		tm.put(1006, "Wills@gmail.com");
		System.out.println(tm);
		
		// to call only keys use keySet() method.
		System.out.println(tm.keySet());
		
		// values return type is Collection type, so store the in a collection object.
		Collection<String> values = tm.values();
		System.out.println(values);
		
		//simple for each loop.
		// entry is a nested interface.
		// 
		for(Map.Entry<Integer, String> entry : tm.entrySet()) {
			System.out.println(entry);
			System.out.println(entry.getKey() +"-------"+entry.getValue());
		}

	}
}	
