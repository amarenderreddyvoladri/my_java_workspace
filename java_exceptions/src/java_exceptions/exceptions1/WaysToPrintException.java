package java_exceptions.exceptions1;

public class WaysToPrintException {
	
	public static void m1() {
		System.out.println(10/0);
	}
	
	public static void m2() {
		m1();
	}
	
	public static void m3() {
		m2();
	}
	
	public static void main(String[] args) {
//		m3();
		
		try {
			m3();
		}
		catch(ArithmeticException e) {
			e.printStackTrace(); //exact complete exception stack trace.
			System.out.println("---------------------------------");
			System.out.println(e.toString());
			System.out.println("---------------------------------");
			System.out.println(e.getMessage()); //only description.			
		}
	}
	
}
