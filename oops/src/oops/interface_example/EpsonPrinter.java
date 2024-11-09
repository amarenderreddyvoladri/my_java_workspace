package oops.interface_example;

public class EpsonPrinter implements Printer {

	@Override
	public void printJob() {
		// TODO Auto-generated method stub
		System.out.println("Print Job using Epson Printer!");
	}
	// rule here
	// whatever the abstract methods from Printer Class, they must be implemented.

//	@Override
//	public void scan() {
//		// TODO Auto-generated method stub
//		System.out.println("Scan Job is run using Epson Printer.");
//	}
	
	// here the interface default methods can be possible to overriden.
	@Override
	public void tShirtPrinter() {
		System.out.println("Iam printer using tShirtMethod can overiden!");
	}
	
	public void threeDPrintJob() {
		System.out.println("Iam from threeDPrintJob from EpsonPriner. ");
	}
	
	
	
	
}
