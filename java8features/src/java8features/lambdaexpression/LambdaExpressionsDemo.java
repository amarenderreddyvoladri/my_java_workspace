package java8features.lambdaexpression;


// let create interface [Functionalinterface]

//method without arguments.
@FunctionalInterface
interface MyFunctionalInterface1 {
	void wish();
}

// method with 1 arguments.
@FunctionalInterface
interface MyFunctionalInterface2 {
	void findSquare(int num);
}

//method with 3 arguments.
@FunctionalInterface
interface MyFunctionalInterface3 {
	void findSum(int n1, int n2);
}

// to work with interface we just implement it to another class Hello.

class Hello implements  MyFunctionalInterface1, MyFunctionalInterface2,MyFunctionalInterface3 {

	@Override
	public void wish() {
		// TODO Auto-generated method stub
		System.out.println("Hello........");		
	}

	@Override
	public void findSquare(int num) {
		// TODO Auto-generated method stub		
	}

	@Override
	public void findSum(int n1, int n2) {
		// TODO Auto-generated method stub		
	}
	
	
}

// without implementation we can use interface using lambda expressions.


public class LambdaExpressionsDemo {
	
	public static void main(String[] args) {
		
		MyFunctionalInterface1 myfun1 = new Hello();
		myfun1.wish();
		
		MyFunctionalInterface2 myfun2 = new Hello();
		myfun2.findSquare(20);
		
		// lambda expresiion to implemetn wish  method.
		// anonymus method without arguments.
				
		// anonymus method without arguments.
		MyFunctionalInterface2 myfun21 = (x) -> x * x;
		myfun21.findSquare(21);
		
		// here functional interface has only one method to call.
		// so we can call without any name specified called anonymus method.
		
	}
}
