package collections_framework;

import java.util.LinkedList;

//Both ArrayList and LinkedList are same and only 1 difference.
// LinkedList is implemented based on Double LinkedList Data Structure.
// Best Usage :
// If we prefer Frequent Operations like Insertion / Deletion.

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(100);
		ll.add(200);
		ll.add(300);
		ll.add(400);
		ll.add(500);
		
		System.out.println(ll);
		
	}
}
