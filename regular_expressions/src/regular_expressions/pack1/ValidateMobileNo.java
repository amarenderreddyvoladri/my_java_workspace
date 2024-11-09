package regular_expressions.pack1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateMobileNo {
	public static void main(String[] args) {
		String mobileNumber = "7569118704";
		
		String regexMobileNo1 = "[6-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]";
		
		String regexMobileNo2 = "[6-9][0-9]{9}";
		
		String regexMobileNo3 = "[6-9]\\d{9}";
		
		Pattern p;
		
		p = Pattern.compile(regexMobileNo1);
		
		Matcher m;
		
		m = p.matcher(mobileNumber);
		
//		System.out.println(m);
		
		if(m.find() && m.group().equals(mobileNumber)) {
			System.out.println("Valid Mobile Number");
		}else {
			System.out.println("In-valid Mobile Number");
		}
		
		
	}
}
