package oops;

public class Car {
	
	String carNo;
	String carCompany;
	String carColour;
	String carFuelType;
	String carSeatingCapacity;
	int carWheels = 4;
	CarDriver[] carDriver;
	
	// constructor.
	public Car(String carNo, String carCompany, String carColour, String carFuelType, String carSeatingCapacity, CarDriver[] carDriver) {
		super();
		this.carNo = carNo;
		this.carCompany = carCompany;
		this.carColour = carColour;
		this.carFuelType = carFuelType;
		this.carSeatingCapacity = carSeatingCapacity;
		this.carDriver = carDriver;
	}
	
	public void displayCarDetails() {
		System.out.println("Car Number : "+carNo);
		System.out.println("Car Company : "+carCompany);
		System.out.println("Car Colour : "+carColour);
		System.out.println("Car Fuel Type : "+carFuelType);
		System.out.println("Car SeatingCapacity : "+carSeatingCapacity);
		System.out.println("Car Wheels : "+carWheels);
		System.out.println("---------------------------------------------------");
		
		for(CarDriver cd : carDriver) {
			cd.displayCarDrivers();
			System.out.println("------------------------------------------------");
		}
	}
	
	
}
