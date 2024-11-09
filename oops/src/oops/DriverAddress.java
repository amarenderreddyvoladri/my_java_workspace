package oops;

public class DriverAddress {
	private String street;
	private String city;
	private String state;
	private String country;
	
	//constructor.
	public DriverAddress(String street, String city, String state, String country) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
	public void displayDriverAddress() {
		System.out.println("Street : "+street);
		System.out.println("City : "+city);
		System.out.println("State : "+state);
		System.out.println("Country : "+country);
		System.out.println("------------------------------------------------");
	}
	
}
