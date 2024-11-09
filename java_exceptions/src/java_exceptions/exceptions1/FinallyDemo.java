package java_exceptions.exceptions1;

public class FinallyDemo {
	public static void main(String[] args) {
		String str = null;
		
		System.out.println("hello");
		//java.lang.NullPointerException.
		try {
			System.out.println(str.charAt(0));
//			System.exit(0);
		}
		catch (NullPointerException ne) {
			// TODO: handle exception
			System.out.println("Nothing......");
		}
		catch (ArithmeticException ae) {
			// TODO: handle exception
			System.out.println("Arithmetic exception occured!!......");
		}
//		catch(Exception e) {
//			System.out.println("Exited...!!");
//			System.exit(0);
//		}
		finally {
			System.out.println("end.....");
			// finally is to clean up code.
			// closing the connections.
		}
		
		System.out.println("Program Terminated...!");
	}
}
