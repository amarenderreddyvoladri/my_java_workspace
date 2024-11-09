package strings.pack1.demo;

public class StringDemo {
	public static void main(String[] args) {
		String s1 = "My name is Akaram";		
		String s2 = new String("My name is Akaram");
		
//		System.out.println("example : "+ = String y s2.toLowerCase()); //immutable
		s2.toLowerCase();
		System.out.println(s1);
		System.out.println(s2);
		
		//String Buffer
		
		StringBuffer s3 = new StringBuffer("My name is Akaram");
		System.out.println(s3);
		 //
		s3.append("Good"); //mutable
		System.out.println(s3);

		StringBuilder s4 = new StringBuilder("My name is Akaram");
		System.out.println(s4);
		
		

	}
	
}
