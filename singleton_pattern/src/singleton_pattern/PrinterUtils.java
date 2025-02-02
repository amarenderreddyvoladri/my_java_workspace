package singleton_pattern;

public class PrinterUtils {
	
	// just declaring this class instance for object creation.
	// it is static property because it is avaliable to all static methods in the class.
	private static PrinterUtils instance;
	
	private PrinterUtils() {}	
	// private constructor to avoid creating object outside the class.
	// to achieve singleton pattern.
	
	public static PrinterUtils getInstance() {
		// if it instace method it cannot be possible beacause no object is created. 
		
		if(instance == null) {
			instance = new PrinterUtils();
		}
		
		return instance;		
	}
	
	public void printJob() {
		System.out.println("printing ............");
	}
}
