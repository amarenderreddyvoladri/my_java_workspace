package regular_expressions.pack1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Constraints to validate the password.
 * 1. contains atleast one lowercase, uppercase, digit, special character.
 * 2. size range b/w 8 - 12
 * 3. white spaces are not allowed
*/

public class PasswordValidater {

	public static void main(String[] args) {

		String pas = "Amarender@65";

		String str = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,12}$";

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
