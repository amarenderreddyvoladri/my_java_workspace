package oops.interface_example;

public class InterfaceDemo {
	public static void main(String[] args) {
//		Printer p = new Printer(); // Error object cannot be created for an interface.
		
		// creating objects for Canon, Samsung, Epson Printer.
		
		EpsonPrinter ep = new EpsonPrinter();
		ep.printJob();
		ep.tShirtPrinter();
		ep.coffeeCupPrintJob();
		// after new method is added from Printer Interrface.
//		ep.scan();
		CanonPrinter cp = new CanonPrinter();
		cp.printJob();
		cp.tShirtPrinter();
		cp.coffeeCupPrintJob();
		SamsungPrinter sp = new SamsungPrinter();
		sp.printJob();
		sp.tShirtPrinter();
		sp.coffeeCupPrintJob();
		HpPrinter hp = new HpPrinter();
		hp.printJob();
		hp.display();
		hp.tShirtPrinter();
		hp.coffeeCupPrintJob();
		
		// interface can hold the reference type, but not value.
		Printer p  = new EpsonPrinter();
		// Value Type = Reference type.
		
		Printer.threeDPrintJob();
		// static methods can be accessible through interface name, but not its implementation classes.
		// from java 8+ version's.....
		// it cannot be override.
				
	}
}
