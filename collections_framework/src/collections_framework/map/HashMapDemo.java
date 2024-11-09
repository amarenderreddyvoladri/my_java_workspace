package collections_framework.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(1001, "Wills@gmail.com");
		hm.put(1004, "Jones@gmail.com");
		hm.put(1005, "Martin@gmail.com");
		hm.put(1003, "Smith@gmail.com");
		hm.put(1002, "Gaurav@gmail.com");

		System.out.println(hm);
		
		// duplicate keys are not allowed.
		hm.put(1002, "Sairam@gmail.com");
		System.out.println(hm);
		
		// duplicate values are allowed.
		hm.put(1006, "Wills@gmail.com");
		System.out.println(hm);
		
		// to call only keys use keySet() method.
		System.out.println(hm.keySet());
		
		// values return type is Collection type, so store the in a collection object.
		Collection<String> values = hm.values();
		System.out.println(values);
		
		//simple for each loop.
		// entry is a nested interface.
		// 
		for(Map.Entry<Integer, String> entry : hm.entrySet()) {
			System.out.println(entry);
			System.out.println(entry.getKey() +"-------"+entry.getValue());
		}

	}
}	
