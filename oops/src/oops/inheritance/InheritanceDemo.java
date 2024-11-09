package oops.inheritance;

public class InheritanceDemo {
	public static void main(String[] args) {
		System.out.println("Mobile Class");
		Mobile m = new Mobile();
		m.sms();
		m.call();
		
		System.out.println("-------------------------------------------");
		System.out.println("SmartMobile Class");
		SmartMobile sm = new SmartMobile();
		sm.browse();
		sm.videoCall();
	}
}
