package java_exceptions.exceptions1;

public class UnCheckedExceptionDemo {
	public static void main(String[] args) {
		int[] a = {10,20,30,40,50};
		
		try {
			System.out.println(a[5]);
			
		}catch(ArrayIndexOutOfBoundsException aiob) {
			System.out.println("no element is existed.");
		}
	}
}
