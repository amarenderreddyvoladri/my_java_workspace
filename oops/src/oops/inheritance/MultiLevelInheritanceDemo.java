package oops.inheritance;

public class MultiLevelInheritanceDemo {
	public static void main(String[] args) {
		IPhone ip = new IPhone();
		ip.call();
		ip.camera();
		ip.videoCall();
		ip.browse();
		ip.sms();
	}
}
