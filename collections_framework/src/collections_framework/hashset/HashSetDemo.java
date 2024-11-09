package collections_framework.hashset;

import java.util.HashSet;
import java.util.Iterator;
// HashSet :
// 
// JVM generates the hashcode to store the hash code based values in hash set.
// here objects are stored based on their hash values.
// we cannot retrieve element at particular index.

public class HashSetDemo {
	
	public static void main(String[] args) {
		
		HashSet<Integer> s = new HashSet<Integer>();
		s.add(100);
		s.add(200);
		s.add(300);
		s.add(400);
		System.out.println(s);
		s.add(500);
		
		System.out.println(s);
		s.add(200);
		
		System.out.println(s);
		
		//we can add only 1 null value.
		s.add(null);
		s.add(null);		
		
		// check the value contained or not.
		System.out.println(s.contains(300));
		
		System.out.println(s.isEmpty());
		
		System.out.println(s.remove(102));
		System.out.println(s.remove(100));
		System.out.println(s);
		
		Iterator<Integer> ir = s.iterator();
		
		
	}
}
