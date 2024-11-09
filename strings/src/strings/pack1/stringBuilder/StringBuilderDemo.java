package strings.pack1.stringBuilder;

public class StringBuilderDemo {
	//not thread safe.
	
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Java");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
	}
}
