package oops.overloading;

public class OverLoadingDEmo {
	public static void main(String[] args) {
		
		int maxInt = MyCalc.findMax(100, 200);
		System.out.println(maxInt);
		
		MyCalc.findMax(7569118704L, 4536278998L);
		
		MyCalc.findMax(3.14, 1.14);
		
		MyCalc.sum(new int[22,44,66,88,,99,34]);
	}
}
