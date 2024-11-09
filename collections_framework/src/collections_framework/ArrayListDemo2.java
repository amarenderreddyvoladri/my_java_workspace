package collections_framework;

import java.util.*;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println(al);
		System.out.println("size : "+al.size());
		al.add(233);
		al.add(233);
		al.add(5789);
		al.add(33);
		al.add(3456);
		
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
		al.remove(200);
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
