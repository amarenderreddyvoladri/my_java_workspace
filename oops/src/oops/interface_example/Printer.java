package oops.interface_example;

@FunctionalInterface
public interface Printer {
	
	public abstract void printJob();
	// in interface only method should be decalred but not it's implementations.
	// without body method.
	// by default the interface methods are public + abstract methods.
	
//	public abstract void scan();
	
	// adding new method for 3rd time.
	default void tShirtPrinter() {
		System.out.println("Iam printer using tShirtMethod.");
	}	
	
	// adding new method for 3rd time.
		default void coffeeCupPrintJob() {
			System.out.println("Iam printer using coffeeCupPrintJob.");
		}
	
	// static methods can be accessible through interface name, but not its implementation classes.
	// from java 8+ version's.....
	static void threeDPrintJob() {
		System.out.println("Hello, iam from threeDPrintJob");
	}
}
