import java.util.Scanner;

public class ReverseNumber {
	
	public double findReverse(double num) {
		double rem = 0, sum=0;
		
		
		while(num != 0) {
			rem = num % 10;
			sum = (sum * 10)+rem;
			num = num / 10;
		}
		
		return sum;
	}
	public static void main(String[] args) {
		
		// finding the reverse number of given number.
		
		ReverseNumber rn = new ReverseNumber();
		
		System.out.println("Reverse of the Number is : "+rn.findReverse(67542.0));
		Scanner sc=  new Scanner(System.in);
		
		sc.close();
	}
}
