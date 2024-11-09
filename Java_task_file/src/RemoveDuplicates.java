import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicates {
	
	public static String removeDuplicates(String str) {
		
		LinkedHashSet<Character> data = new LinkedHashSet<Character>();
		
		for(char c : str.toCharArray()) {
			data.add(c);
		}
		
		StringBuffer res = new StringBuffer();
		for(char c : data) {
			res.append(c);
		}
		
		return res.toString();		
		
	}
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the text : ");
		String text = sc.nextLine();
		
		String result = removeDuplicates(text);
		
		System.out.println(result);
		
		sc.close();
	}
}
