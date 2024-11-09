package custom_exceptions_in_java.pack1;

class MyException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyException(String message) {
		super(message);
		
		// zero argument constructor.
	}
}


class MyException2 extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyException2(String message) {
		super(message);
	}
}

class MyException3 extends Throwable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyException3(String message) {
		super(message);
	}
}

public class ExceptionDemo  {
	
	public static void main(String[] args) throws MyException3 {
		
		try {
		throw new MyException("This is an Exception!");
		}catch(MyException me) {
			System.out.println(me);			
		}
		
		
		System.out.println("----------------------------------------------------");
		
		try {
			throw new MyException2("This is RuntimeEXception 2");
		}catch(MyException2 me2) {
			System.out.println(me2);
		}
		
		System.out.println("----------------------------------------------------");
		
		try {
			throw new MyException3("This is from Throwable Class");
		}catch(MyException3 me3) {
			System.out.println(me3);
		}
		
		System.out.println("----------------------------------------------------");


	}
	
}
