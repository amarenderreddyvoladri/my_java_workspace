package oops.override;

public class Child extends Parent {
	
	@Override
	public void marry() {
		super.marry();
		System.out.println("Living Together.........");
	}
	
//	@Override
//	public void study() {
//		System.out.println("ITBT.........");
//	}
//	
	//Exception in thread "main" java.lang.IncompatibleClassChangeError: class 
	// oops.override.Child overrides final method oops.override.Parent.study()V
}
