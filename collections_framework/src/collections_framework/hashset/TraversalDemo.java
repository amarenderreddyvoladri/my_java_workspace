package collections_framework.hashset;



import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;

// TreeSet :
// 
// JVM generates the hashcode to store the hash code based values in hash set.
// here objects are stored based on their hash values and order.
// we cannot retrieve element at particular index.
// difference : 
// it has ordered[ascending order] set of elements.

import java.util.TreeSet;

public class TraversalDemo {
	
	public static void main(String[] args) {
		
		ArrayList<Double> salary = new ArrayList<Double>();
		salary.add(100.00);
		salary.add(500.00);
		salary.add(300.00);
		salary.add(400.00);
		salary.add(200.00);
		
		System.out.println(salary);
		salary.add(200.00);
		
		System.out.println(salary);
		// for loop is added in java 1.0V
		
		// for each() loop in java V1.5.
		
		// using listIterator.
		System.out.println(" using listIterator.");
		ListIterator<Double> itr = salary.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		Iterator<Double> itrr = salary.iterator();
		while(itr.hasNext()) {
			System.out.println(itrr.next());
		}
		
		// forEach() loop in java V1.8.
		salary.forEach(System.out :: println);		
		
		// using lambda expression.
		// lambda loop in java V1.8.
		salary.forEach((s) -> System.out.println(s));
		
	}
}
