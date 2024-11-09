package strings.pack1;

public class StringDemo {
	
	
	public static void main(String[] args) {
		//using literal operator.
		String str1 = "Hello World";
		
		//using String new Operator.
		String s1 = new String("Python.");
		
		//using literal operator.
		String str2 = "Hello World";
				
		//using String new Operator.
		String s2 = new String("Python.");
		
		
		// str2 is created, but it points to the str1 in SCP.
		// for s2 is created, it created new object will be created in heap memory.
		
		// we can check through ==operator.
		System.out.println(str1 == str2);
		System.out.println(s1 == s2);
		
		System.out.println(str1.equals(str2));
		System.out.println(s1.equals(s2));
		
		System.out.println("---------------------------------------");
		
		System.out.println(s1.charAt(3));
		System.out.println(s1);
		
		
	}
}
