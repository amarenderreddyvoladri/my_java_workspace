package date_api_java.pack1;

import java.time.LocalTime;

public class LocalTimeApiDemo {
	
	public static void main(String[] args) {
		
		LocalTime time = LocalTime.now();
		
		// create a time object.
		LocalTime t = LocalTime.of(23, 13);
		
		System.out.println(time);		
		
		System.out.println(time.getNano());

		System.out.println(time.getSecond());

		System.out.println(time.getMinute());
		
		System.out.println(time.getHour());
		
		System.out.println("-----------------------------");
		
		System.out.println(time.minusNanos(time.getNano()));
		
		System.out.println(time.minusSeconds(time.getSecond()));
		
		System.out.println(time.minusMinutes(time.getMinute()));
		
		System.out.println(time.minusHours(time.getHour()));
		
		System.out.println("-----------------------------");		

		System.out.println(time.plusNanos(time.getNano()));
		
		System.out.println(time.plusSeconds(time.getSecond()));
		
		System.out.println(time.plusMinutes(time.getMinute()));
		
		System.out.println(time.plusHours(time.getHour()));
		
		System.out.println("-----------------------------");

	}
}
