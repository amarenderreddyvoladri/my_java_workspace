package java_exceptions.user_exceptions;

// UncheckdException
class InvalidAgeException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	// constructor default
	public InvalidAgeException() {
		super();
	}

	// parameterized constructor.
	public InvalidAgeException(String message) {
		super(message);
	}
}

//CheckedException.
class InvalidIncomeException extends Exception {

	private static final long serialVersionUID = 1L;

	// constructor default
	public InvalidIncomeException() {
		super();
	}

	// parameterized constructor.
	public InvalidIncomeException(String message) {
		super(message);
	}
}

//working class.......
public class CustomizedExceptionDemo {

	// method 1
	public static void voteragecheck(int age) {
		if (age >= 18) {
			System.out.println("Your'e eligible to vote!");
		} else {
			throw new InvalidAgeException("Not eligible to vote!");
		}
	}

	// method 2
	public static void checkIncome(int income) throws InvalidIncomeException {
		if (income <= 40000) {
			System.out.println("Your'e eligible to marry!");
		} else {
			throw new InvalidIncomeException("Not eligible to marry!");
		}
	}

	// main method.....
	public static void main(String[] args) {

		voteragecheck(11);
//		checkIncome(39000);

		try {
			checkIncome(39000);
		} catch (InvalidIncomeException ie) {
			System.out.println(ie);
		}
	}
}
