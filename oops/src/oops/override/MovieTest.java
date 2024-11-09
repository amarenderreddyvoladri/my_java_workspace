package oops.override;

public class MovieTest {
	
	public String toString() {
		super.toString();
		return "Hello";
	}
	
	public static void main(String[] args) {
		Movie m1 = new Movie(333, "Devara", "Koratala Shiva");
		Movie m2 = new Movie(555, "Bahubali", "SS Rajamouli");
		
		MovieTest mt = new MovieTest();
		System.out.println();
	
		
		System.out.println(m1);
		System.out.println(m2);
		
		System.out.println(m1 == m2);
		
		Movie m3 = m2;
		
		System.out.println(m3 == m2);
		
		System.out.println(m1.equals(m3));

	}
}
