package oops.abstrac;

interface Vehicle{
	public abstract void wheels();
	void start();
	void move();
	void stop();
		
}
abstract class MyVehicle implements Vehicle{
	
	
	public void  start() {
		System.out.println("Starting ....... ");
	}
	
	public void  move() {
		System.out.println("moving ....... ");
	}
	
	public void  stop() {
		System.out.println("stopping ....... ");
	}
	
	public abstract void  wheels();
}

class Car extends MyVehicle{
	// here we cannot create object to abstract class, but can 
	// be achieved through extending the class with another class and create object.
	@Override
	public void wheels() {
		// TODO Auto-generated method stub
		System.out.println("4_wheels!");
	}	
}

class Bike extends MyVehicle{
	// here we cannot create object to abstract class, but can 
	// be achieved through extending the class with another class and create object.
	@Override
	public void wheels() {
		// TODO Auto-generated method stub
		System.out.println("2_wheels!");
	}	
}


public class AbstractClassDemo {
	public static void main(String[] args) {
		Bike b = new Bike();
		b.wheels();
		
		b.start();
		b.move();
		b.stop();
		
		System.out.println("------------------------------");
		
		Car c = new Car();
		c.wheels();
		c.start();
		c.move();
		c.stop();
	}
	
}
