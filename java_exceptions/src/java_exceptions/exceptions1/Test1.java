package java_exceptions.exceptions1;

public class Test1 {

	public static void main(String[] args) {		
		int x = 0;
		System.out.println(x);
		
		try {
			System.out.println(10/0);			
		}
		catch(ArithmeticException ae) {
			System.out.println("Cannot divide by zero");
		}
		
		System.out.println("Program Terminated!");

	}

}
