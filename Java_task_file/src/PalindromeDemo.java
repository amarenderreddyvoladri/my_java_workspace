import java.util.Scanner;

public class PalindromeDemo {

	// To check whether the given number is Palindrome or not.
	public boolean isPalindrome(int n) {
		
		int r = 0, sum = 0, temp = n;

		// logic.
		while (n != 0) {
			r = n % 10;
			sum = (sum * 10) + r;  
			n = n / 10;
		}

		if (sum != temp) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {

		PalindromeDemo pd = new PalindromeDemo();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int num = sc.nextInt();

		boolean result = pd.isPalindrome(num);

		if(result) {
			System.out.println("The given Number is Palindrome.");
		} else {
			System.out.println("The given Number is not a Palindrome.");
		}
		
		// closing the scanner.
		sc.close();

	}
}
