package regular_expressions.pack1;

import java.util.regex.Matcher;

import java.util.regex.Pattern;

enum sd {};

public class EmailIdExtract {
	public static void main(String[] args) {
		// to find the email id present or not.
		
		/* Rules to define Email Id :
		 * 1. Only allowed a-z, 0-9, ., _
		 * 2. begin with alphabets
		 * 3. must contain @ charatcer.
		 * 4. end with .com, .in, .org, .edu
		*/ 
		
		String emailId1 = "My name is Amarender Reddy. And my email is amarender.reddy@gmail.com";
		String emailId2 = "amarender.reddy@gmail.com";
		
		String regexEmailId = "[a-z][a-z0-9._]*@[a-z]+[.][a-z]{2,3}";
		
		Pattern p = Pattern.compile(regexEmailId);
		
		p.hashCode();
		
		Matcher m = p.matcher(emailId2);
		
		if(m.find()) {
			System.out.println("Valid Email");
			System.out.println(m.find());
			System.out.println(m.group());
		}else {
			System.out.println("Invalid Email");

		}
	}
}
