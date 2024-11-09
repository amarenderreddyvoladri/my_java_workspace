package collections_framework.hashset;



import java.util.Comparator;

// TreeSet :
// 
// JVM generates the hashcode to store the hash code based values in hash set.
// here objects are stored based on their hash values and order.
// we cannot retrieve element at particular index.
// difference : 
// it has ordered[ascending order] set of elements.

import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> s = new TreeSet<Integer>(Comparator.reverseOrder());
		s.add(100);
		s.add(500);
		s.add(300);
		s.add(400);
		s.add(200);
		
		System.out.println(s);
		s.add(200);
		
		System.out.println(s);
		
		//we cannot add null values into TreeSet.
//		s.add(null);
//		s.add(null);		
//		
		// check the value contained or not.
//		System.out.println(s.contains(300));
		
		System.out.println(s.isEmpty());
		
		System.out.println(s.remove(102));
		System.out.println(s.remove(100));
		System.out.println(s);
		
		
		
		
		
		
	}
}
