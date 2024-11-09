package regular_expressions.pack1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PanNumberValidate {
	
	public static void main(String[] args) {
		
		String pan = "BVDPV8083K";
		
		String rex = "[A-Z]{5}[0-9]{4}[A-Z]{1}";
		
		Pattern p = Pattern.compile(rex);
		
		Matcher m = p.matcher(pan);
		
		
		if(m.find()) {
			System.out.println("Found Pan Number");
		}
		else {
			System.out.println("Pan not found");
		}
	}
}
