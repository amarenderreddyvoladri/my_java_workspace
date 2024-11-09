package myproject5;

//import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;

//if we get updated like deleted any filed or added any filed, then how to 
// add the new fields to the previous generating getters, setters, to string 
// method and constrictor.


//@AllArgsConstructor
//@Getter
//@Setter
//@NoArgsConstructor
//@ToString
@Data
public class Employee {
	
	//fields.
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	private long mobileNumber;
	
//	// constructor with arguments.
//	public Employee(int employeeId, String employeeName, double employeeSalary) {
//		super();
//		this.employeeId = employeeId;
//		this.employeeName = employeeName;
//		this.employeeSalary = employeeSalary;
//	}
//	
//	// getters & setters.
//	public int getEmployeeId() {
//		return employeeId;
//	}
//
//	public void setEmployeeId(int employeeId) {
//		this.employeeId = employeeId;
//	}
//
//	public String getEmployeeName() {
//		return employeeName;
//	}
//
//	public void setEmployeeName(String employeeName) {
//		this.employeeName = employeeName;
//	}
//
//	public double getEmployeeSalary() {
//		return employeeSalary;
//	}
//
//	public void setEmployeeSalary(double employeeSalary) {
//		this.employeeSalary = employeeSalary;
//	}
//
//	//toString() method.
//	@Override
//	public String toString() {
//		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
//				+ employeeSalary + "]";
//	}	
//	
	
	
	
}
