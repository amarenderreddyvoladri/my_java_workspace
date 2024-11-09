package oops;

public class Test2 {
	public static void main(String[] args) {
		int x=56, y=88;
		
		if(true) {
//			int x = 89;
			x = 999;
		}
		else {
//			int y = 67; its wrong, declaration is not possible here...
			System.out.println("Helloooo");
			y = 666;
			
		}
		
		System.out.println(x);
		System.out.println(y);
		
		
	}
}
