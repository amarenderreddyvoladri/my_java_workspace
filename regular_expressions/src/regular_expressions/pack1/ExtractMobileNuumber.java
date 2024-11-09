package regular_expressions.pack1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractMobileNuumber {
	
	public static void main(String[] args) {
		
		String text = "This is Smith. My contact number is 9988776655";
		
		String pattern1 = "[6-9][0-9]{9}";
		
		Pattern p = Pattern.compile(pattern1);
		
		Matcher m;
		
		m = p.matcher(text);
		
		if(m.find()) {
			System.out.println("Mobile Number Found!");
			System.out.println(m.group());
		}
		else {
			System.out.println("Mobile not Number Found!");
		}
		
	}
}
