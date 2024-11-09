package java8features.foreach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachDemo {

	public static void main(String[] args) {

		List<String> courses = Arrays.asList("Java", "Angular", "Python");

		// 1. define consumer then call forEach() method on it.
		Consumer<String> consumer = (value) -> System.out.println(value);
		courses.forEach(consumer);

		System.out.println("------------------------------------------------");

		// 2. directly implement logic inside the forEach Method.
		courses.forEach((value) -> System.out.println(value));

		System.out.println("------------------------------------------------");

		// 3. using the method references.
		courses.forEach(System.out::println);

		System.out.println("------------------------------------------------");

		// Example - 2.
		List<Double> salaries = Arrays.asList(25000.34, 32999.43, 54789.212, 30000.000001);

		// define consumer using forEach method.
		// create consumer logic here using Consumer class.
		Consumer<Double> consumer2 = (sal) -> System.out.println(sal > 30000 ? sal : 0);
		salaries.forEach(consumer2);

		System.out.println("------------------------------------------------");

		salaries.forEach((s) -> System.out.println(s > 30000 ? s : 0));

		System.out.println("------------------------------------------------");

		// using method reference.
		// without salary logic constraints.
		salaries.forEach(System.out::println);

		System.out.println("------------------------------------------------");

		// here we use to store the filtered salaries > 30000 into another list.

		List<Double> filteredSalaries = new ArrayList<Double>();

		for (double s : salaries) {
			if (s > 40000) {
				filteredSalaries.add(s);
			}
		}

	}
}
