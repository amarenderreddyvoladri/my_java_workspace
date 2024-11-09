package oops.overloading;

public class MyCalc {
	
	public static int findMax(int a, int b) {		
		return (a>b)? a:b;
	}
	
	public static long findMax(long a, long b) {		
		return (a>b)? a:b;
	}
	
	public static double findMax(double a, double b) {		
		return (a>b)? a:b;
	}
	
	// method with unknown arguments.
	public static void sum(int...a) {
		System.out.println("Iam from Display Method with unknown agguments....");
	}

}
