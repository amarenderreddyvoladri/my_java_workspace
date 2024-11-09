package java_exceptions.exceptions1;

public class StringIndexExceptionDemo {
	public static void main(String[] args) {
		String s = "java";
		
		try {
			char c = s.charAt(24);
			System.out.println("This line is not executed.....");
			// ** code after the exception wont gets executed.
		}
		catch(ArrayIndexOutOfBoundsException se) {
			System.out.println("no element to read....");
		}
		catch(StringIndexOutOfBoundsException se) {
			System.out.println("no charatcter to read....");
		}
	}
}
