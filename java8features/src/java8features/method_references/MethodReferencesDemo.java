package java8features.method_references;

@FunctionalInterface
interface Greet{
	void wish();
}

public class MethodReferencesDemo {
	
	//static method
	public static void hello() {
		System.out.println("Hello everybody.......");
	}	
	
	//instance method
	public void hii() {
		System.out.println("hii everyone.......");
	}
	
	//main
	public static void main(String[] args) {
		
		Greet g1 = () -> MethodReferencesDemo.hello();
		g1.wish();
		
		//static method with methodreferences.
		Greet g2 = MethodReferencesDemo :: hello;
		g2.wish();
		
		//static method with methodreferences.
		MethodReferencesDemo mr1 = new MethodReferencesDemo();
		Greet g3 = () -> mr1.hii();
		g3.wish();
		
		//static method with methodreferences.
		MethodReferencesDemo mr2 = new MethodReferencesDemo();
		Greet g4 = mr2 :: hii;
		g4.wish();
	}
}
