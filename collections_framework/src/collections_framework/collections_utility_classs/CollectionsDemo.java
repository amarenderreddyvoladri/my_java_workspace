package collections_framework.collections_utility_classs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsDemo {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(44,55,77,22,99,11);
		System.out.println(list);
		
		// to sort in ascending order.
		Collections.sort(list);
		System.out.println(list);
		
		// to sort in reverse order.
		Collections.sort(list, Comparator.reverseOrder());
		System.out.println(list);
		
		int index  = Collections.binarySearch(list, 99);
		System.out.println(index);
		
		// collections vs Collection vs Collection.
		
//		Iterator<Integer> ir = index.iterator();
		
	
	}
}
