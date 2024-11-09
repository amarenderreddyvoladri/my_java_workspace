package oops.superkeyword;

public class Orange extends Fruit{
	
	public void color() {
		super.price();
		System.out.println("Iam Orange Color!");
	}
	
	public void price() {
		System.out.println("Iam cost $56");
	}
	
	public static void main(String[] args) {
		// main method.
		
		Orange o1 = new Orange();
		o1.color();		
	}
}
