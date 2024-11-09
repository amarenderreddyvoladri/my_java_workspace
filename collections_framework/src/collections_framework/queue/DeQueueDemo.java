package collections_framework.queue;

import java.util.ArrayDeque;


public class DeQueueDemo {
	
	public static void main(String[] args) {
		
		ArrayDeque<String> pq = new ArrayDeque<String>();
		// offer is old method.
		pq.offer("Java");
		pq.offer("Hibernate");
		pq.offer("Apring");
		pq.offer("Python");
		pq.offer("JDBC");
		// java 1.2 method.
		pq.add("HTML");
		
		System.out.println(pq);
		
		System.out.println(pq.poll());
		System.out.println(pq);
		
		pq.add("Akram");
		
		System.out.println(pq);
		
		pq.addFirst("frist");
		pq.addLast("Last");
		
		System.out.println(pq);
		
		pq.push("Pushed eleemnt");
		System.out.println(pq);
		
		
	}
}
