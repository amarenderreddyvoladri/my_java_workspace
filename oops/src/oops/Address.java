package oops;

public class Address {
	
	// example for Composition in java.
	String city, state, country;

	public Address(String city, String state, String country) {
		super(); // why super?
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
	public void displayAddress() {
		System.out.println("City : "+city);
		System.out.println("State : "+state);
		System.out.println("Country : "+country);
	}
	
}
