package oops;

public class BankAccount {
	long accNo;
	String name;
	String ifsc;
	String branch;
	
	// constructor.
	public BankAccount(long accNo, String name, String ifsc, String branch) {
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
