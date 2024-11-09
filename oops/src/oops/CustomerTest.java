package oops;


public class CustomerTest {
	
	// Instance Variables.
	int employeeId;
	String employeeName;
	String mobileNumber;
	Address employeeAddress; // Entity Reference.
	// Technically called Composition or Has-A relation.
	
	public CustomerTest(int employeeId, String employeeName, String mobileNumber, Address employeeAddress) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.mobileNumber = mobileNumber;
		this.employeeAddress = employeeAddress;
	}
	
	public void displayEmployee() {
		System.out.println("Employee Id : "+employeeId);
		System.out.println("Employee Name : "+employeeName);
		System.out.println("Employee Number : "+mobileNumber);
		employeeAddress.displayAddress();
	}
	
	
	
	
}
