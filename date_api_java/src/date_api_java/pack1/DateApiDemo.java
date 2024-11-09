package date_api_java.pack1;

import java.time.LocalDate;

public class DateApiDemo {
	
	public static void main(String[] args) {
		
		 LocalDate date = LocalDate.now();
		 
		 LocalDate date2 = LocalDate.of(2021, 11, 26);
		 
		 System.out.println("Local Date : "+date);
		 
		 System.out.println(date.getDayOfWeek());
		 
		 System.out.println(date.getDayOfMonth());
		 
		 System.out.println(date.getDayOfYear());		 
		 
		 
		 System.out.println("---------------------------");
		 
		 System.out.println(date.getMonthValue());
		 
		 System.out.println(date.getMonth());
		 
		 System.out.println(date.lengthOfMonth());
		 
		 System.out.println("---------------------------");
		 
		 System.out.println("year : "+date.getYear());
		 
		 System.out.println("length of year : "+date.lengthOfYear());
		 
		 System.out.println("is leap year : "+date.isLeapYear());
		 
		 System.out.println("---------------------------");
		 System.out.println("Adding some days,weeks, months, years to date object.");
		 
		 System.out.println(date.plusDays(30));
		 System.out.println(date.plusMonths(1));
		 System.out.println(date.plusWeeks(4));
		 System.out.println(date.plusYears(1));
		 
		 System.out.println("---------------------------");
		 System.out.println("Subtracting some days,weeks, months, years to date object.");
		 
		 System.out.println(date.minusDays(30));
		 System.out.println(date.minusMonths(1));
		 System.out.println(date.minusWeeks(4));
		 System.out.println(date.minusYears(1));		 
		 
		 // It is used to combine this date with a time to create a LocalDateTime.
		 System.out.println("---------------------------");
		 System.out.println(date.atTime(18, 56, 34, 100));
		 
		 System.out.println("---------------------------");		 
		 System.out.println(date);
		 
		 System.out.println(date.compareTo(date2));
		 
		 
	}
}
