package java_exceptions.exceptions1;

public class ErrorDemoStackoverflow {
	public void m1() {
		m2();
		System.out.println("Java");
	}
	
	public void m2() {
		m1();
		System.out.println("Python");
	}
	
	public static void main(String[] args) {
		ErrorDemoStackoverflow err = new ErrorDemoStackoverflow();
		err.m1();
	}

}

//errors cannot be handled.
// StackOverflowError
// 3rd category of Exceptions.