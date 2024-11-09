package singleton_pattern;

public class Test {
	
	public static void main(String[] args) {
		
//		PrinterUtils pu = new PrinterUtils();
		// you cannot create object.
		
		PrinterUtils p1 = PrinterUtils.getInstance();
		PrinterUtils p2 = PrinterUtils.getInstance();
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		
		
		p1.printJob();
		p2.printJob();
	}
}
