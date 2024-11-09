package regular_expressions.w3resources;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateDemo {
	
	public static void main(String[] args) {

		String pas = "Amarender@65";

//		String str = "^[a-zA-Z0-9]";
		String str = "pq*";

//		String str = "[a-zA-Z0-9_#@]{8,12}";

		Pattern p = Pattern.compile(str);

		Matcher m = p.matcher(pas);

		if (m.find()) {
			System.out.println("Valid Password Number");
		} else {
			System.out.println("inValid Password not found");
		}
	}
}
