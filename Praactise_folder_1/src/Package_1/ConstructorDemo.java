package Package_1;

public class ConstructorDemo {
	int age ;
	String name;	
	
	public ConstructorDemo(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public ConstructorDemo() {
		System.out.println("Iam from  Constructor. iam second called!");
	}
	
	public void display() {
		System.out.println("Iam from Display Method.");
	}
	
	public static void main(String[] args) {		
		
		System.out.println("Iam first called!.");
		
		ConstructorDemo cd = new ConstructorDemo();
		cd.display();
		
	}
}
