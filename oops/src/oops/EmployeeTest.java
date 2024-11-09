package oops;

public class EmployeeTest {
	// Running the Employee and address classes.
	
	public static void main(String[] args) {
		
		Address employeeAddress = new Address("Hyderabad","Telangana","India");
		
		Employee emp = new Employee(1001, "Mahesh Babu", "7569118704", employeeAddress);
		
		emp.displayEmployee();
	}
	
	
}
