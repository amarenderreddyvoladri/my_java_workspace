package oops.interface_example;

public class HpPrinter implements Printer{

	@Override
	public void printJob() {
		// TODO Auto-generated method stub
		System.out.println("Print Job using Hp printer");
	}
	
	// rule here
		// whatever the abstract methods from Printer Class, they must be implemented.
	
	public void display() {
		System.out.println("Iam from Display Method...HpPrinter....");
	}

//	@Override
//	public void scan() {
//		// TODO Auto-generated method stub
//		
//	}
		

}
