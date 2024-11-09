package collections_framework;

import java.util.*;

public class ArrayListDemo3 {
	
	public static void main(String[] args) {
		
		ArrayList<String> courses = new ArrayList<String>();
		
		System.out.println(courses);
		System.out.println("size : "+courses.size());
		
		courses.add("Java");
		courses.add("Python");
		courses.add("angular");
		courses.add(".net");
		courses.add("Spring");
		
		System.out.println(courses);
		
		
		for(int i = 0 ; i < courses.size() ; i++) {
			System.out.println(courses.get(i));
		}
		
		System.out.println("---------------------------------------");
		
		System.out.println("for each loop used from java 1.5");
		for(String str : courses) {
			System.out.println(str);
		}
			
		System.out.println("---------------------------------------");
		
		Iterator<String> iter = courses.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
