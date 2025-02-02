package modifiers.pack1.staticblock;

public class StaticBlockExample {
	
	//static properties.
	static int num;
	
	//instance block
	{
		System.out.println("Iam from Instance Block called bofore constructor called.");
		// when it calls.
		// so if you want to perform any objectinitialization before the new object is creation then it is ised.
	}
	
	//static block
	static {
		num = 56;
		int s = 67;
		System.out.println("Iam from static block executes only once.");
		// before creating object, 
		// establishmemnt of conection , calling any api, discard prevoius connection.
	}
	
	//constructor
	private StaticBlockExample() {
		System.out.println("Iam from constructor called for every new object created.!");
	}
	
	//method
	public void display() {
		System.out.println("Iam from display Instace Method.");
	}
	
	//main method
	public static void main(String[] args) {
		
		System.out.println("Hello iam from main method.");
		System.out.println(num);
		StaticBlockExample sb = new StaticBlockExample();
		sb.display();
		
		new StaticBlockExample();
	}
	
}
