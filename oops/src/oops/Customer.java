package oops;

public class Customer {
	private int customerId;
	private String customerName;
	BankAccount[] customerBankAccounts;
	
	// constructor.
	public Customer(int customerId, String customerName, BankAccount[] customerBankAccounts) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerBankAccounts = customerBankAccounts;
	}
	
	public void displayCustomerDetails() {
		System.out.println("customerId : "+customerId);
		System.out.println("customerName : "+customerName);
		System.out.println("------------------------------------------------");
		System.out.println("Customer Bank Account : ");
		for(BankAccount bc : customerBankAccounts) {
			bc.displayAccountDetails();
			System.out.println("------------------------------------------------");
		}
	}
	
	
}
