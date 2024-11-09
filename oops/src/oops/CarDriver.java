package oops;

public class CarDriver {
	private int driverId;
	private String driverName;
	// here driver has two address.
	DriverAddress[] driverAddress;
	private long mobileNumber;
	private String driverType;	
	
	// constructor.
	public CarDriver(int driverId, String driverName, DriverAddress[] driverAddress, long mobileNumber,
			String driverType) {
		super();
		this.driverId = driverId;
		this.driverName = driverName;
		this.driverAddress = driverAddress;
		this.mobileNumber = mobileNumber;
		this.driverType = driverType;
	}

	public void displayCarDrivers() {
		System.out.println("Driver ID : "+driverId);
		System.out.println("Driver Name : "+driverName);
		System.out.println("Driver Mobile Number : "+mobileNumber);
		System.out.println("Driver Type : "+driverType);
		System.out.println("---------------------------------------");
		
		for(DriverAddress da : driverAddress) {
			da.displayDriverAddress();
			System.out.println("------------------------------------------------");
		}
	}
	
	
}
