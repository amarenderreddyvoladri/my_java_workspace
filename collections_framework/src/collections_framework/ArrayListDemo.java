package collections_framework;

import java.util.*;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList<>();
		System.out.println(al);
		System.out.println("size : "+al.size());
		
		al.add(233);
		al.add(233);
		al.add("one");
		al.add(33.4567);
		al.add(true);
		
		System.out.println("\n"+al);
		System.out.println("size : "+al.size());
		
		al.set(0, 100);
		System.out.println("\n"+al);
		System.out.println("size : "+al.size());
		
		al.set(1, 123);
		System.out.println("\n"+al);
		System.out.println("size : "+al.size());
		
		//Remove element based on Index / Element value.
		al.remove(0);
		System.out.println("\n"+al);
		System.out.println("size : "+al.size());
		
		//Remove element based on Index / Element value.
		al.remove("one");
		System.out.println("\n"+al);
		System.out.println("size : "+al.size());
		
		// clear will remove all the elements.
		al.clear();
		System.out.println("\n"+al);
		System.out.println("size : "+al.size());
		
		// IndexOutOfBoundsException.
		al.get(12);
		
	}
}
