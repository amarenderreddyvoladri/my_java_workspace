package date_api_java.pack1;

import java.time.Year;

public class YearDemo {
	public static void main(String[] args) {
		
		Year y = Year.now();
		
		Year y1 = Year.of(2022);
		
		System.out.println(y);
		
		System.out.println("-----------------------");
		
		System.out.println(y.length());
		
		System.out.println(y.isAfter(y1));
		
		System.out.println(y.isBefore(y1));
		
		System.out.println(y.isLeap());
		
		System.out.println(y);
	}
}
