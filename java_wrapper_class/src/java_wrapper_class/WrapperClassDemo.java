package java_wrapper_class;

public class WrapperClassDemo {
	public static void main(String[] args) {
		
		// wrapper classes
		
		//autoboxing.
		int num = 34;
		Integer n = (Integer)num;		
		System.out.println(n);		
		
		//auto-unboxing
		num = (int)n;		
		System.out.println(num);
		
		int r = n.valueOf(num);
		System.out.println(r);
		
	}
}
