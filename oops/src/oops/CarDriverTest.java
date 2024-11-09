package oops;

public class CarDriverTest {
	public static void main(String[] args) {
		
		// driver diff address array.
		DriverAddress da1 = new DriverAddress("Panjagutta", "Hyderabad", "Telangana", "India");
		DriverAddress da2 = new DriverAddress("Habsiguda", "cyberabad", "AndhraPradesh", "Kashmir");
		
		DriverAddress[] driverAddress1 = {da1,  da2};
		
		DriverAddress da3 = new DriverAddress("Kukatpally", "Hyderabad", "Karnataka", "Singapore");
		DriverAddress da4 = new DriverAddress("Kachiguda", "cyberabad", "AndhraPradesh", "Patna");
		
		DriverAddress[] driverAddress2 = {da3,  da4};
		
		// diff cardrivers array.
		CarDriver cd1 = new CarDriver(222, "Danush",driverAddress1, 7896554328L, "Full Time" );
		CarDriver cd2 = new CarDriver(333, "Prakash",driverAddress2, 9876453567L, "Part Time" );
		
		CarDriver[] carDrivers = {cd1, cd2};
		
		//
		Car c1 = new Car("AP 15 23456TS", "BMW", "Blue", "Petrol","9", carDrivers);
		c1.displayCarDetails();
		
	}
}
