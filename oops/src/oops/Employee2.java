package oops;


public class Employee2 {
	
	// Instance Variables.
	int employeeId;
	String employeeName;
	String mobileNumber;
	Address employeeAddress; // Entity Reference.
	// Technically called Composition or Has-A relation.
	
	public Employee2(int employeeId, String employeeName, String mobileNumber, Address employeeAddress) {
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


class BankAccount1 {
	
	long accNo;
	String name;
	String ifsc;
	String branch;
	
	// constructor.
	public BankAccount1(long accNo, String name, String ifsc, String branch) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.ifsc = ifsc;
		this.branch = branch;
	}
	
	public void displayAccountDetails() {
		System.out.println("Account No : "+accNo);
		System.out.println("Bank Name : "+name);
		System.out.println("Bank IFSC code : "+ifsc);
		System.out.println("Branch : "+branch);		
	}	
	
}



