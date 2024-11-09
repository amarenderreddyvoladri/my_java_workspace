package strings.pack1.stringbuffer;

public class StringBufferDemo {
	
	public static void main(String[] args) {
		
		StringBuffer str1 = new StringBuffer("Java");
		System.out.println(str1);
		
		str1.reverse();
		System.out.println(str1);
		
		StringBuffer s1 = new StringBuffer("Python");
		StringBuffer s2 = new StringBuffer("Python");
		
		System.out.println(s1 == s2);
		//object class .equals() methods not overriden.
		// it is for reference comparison.
		System.out.println(s1.equals(s2));
		
	}
}
