package java8features.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAPIDemo {
	
	public static void main(String[] args) {
		
		//Example - 1
		List<Double> salaries = Arrays.asList(34000.45,23000.89,21987.45, 31000.67,15000.56);
		
		Stream<Double> stream = salaries.stream();
		
		Predicate<Double> predicate = (value) -> value >= 20000;
		
		stream.filter(predicate).forEach(System.out :: println);
		
		System.out.println("---------------------------------------------");
		
		salaries.stream().filter( (sal) -> sal>=20000).forEach(System.out :: println);
		
		//Example - 2
		List<String> courses = Arrays.asList("Java", "Spring", "Angular", "Django");
		// filter courses sarts with J.
		System.out.println("---------------------------------------------");
		System.out.println("course characters length >= : 5");
		courses.stream().filter( (c) -> c.length() >=5 ).forEach(System.out :: println);;
		System.out.println("---------------------------------------------");

		// filter course name start with j.
		System.out.println("course starts with character : j");
		courses.stream().filter((c) -> c.toLowerCase().startsWith("j")).forEach(System.out :: println);
		
		
		
		// 2. MAP.
		//Example - 3
		System.out.println("---------------------------------------------");
		System.out.println("updating salary by 2000.");
		salaries.stream().map( (s) -> s+2000).forEach(System.out :: println);
		
		System.out.println("---------------------------------------------");
		System.out.println("updating salary by 10%.");
		salaries.stream().map( (s) -> s + s*0.10).forEach(System.out :: println);
		
		System.out.println("---------------------------------------------");
		System.out.println("sum of salaries : ");
		Double totalSalary = salaries.stream().reduce((sal1, sal2) -> sal1+sal2).get();
		System.out.println(totalSalary);
		// alternate
		Double totSalary = salaries.stream().mapToDouble((sal) -> sal).sum();
		System.out.println(totSalary);
		
		// in mapToDouble we have lot of methods to find average, max, 

	}
}
