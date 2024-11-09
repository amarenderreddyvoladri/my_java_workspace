package java_exceptions.exceptions1;

public class CheckedExceptionDemo {
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("hii....");
		
		Thread.sleep(3000);
		
		System.out.println("Program completed!");
		
		//bypass exception is not recommended.
		// main method is called dby JVM.
		// * we can bypass the exception by adding throws keyword followed by exception name to JVM.

	}
}
