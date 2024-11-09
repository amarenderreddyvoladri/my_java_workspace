package java_exceptions.finalizepack;


class Employee{
	
	int employeeId;
	String employeeName;
	
	public Employee(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
	}
	
	@Override
	protected void finalize() {
		// TODO Auto-generated method stub.
		System.out.println("Finalize()");
	}
	
}
	
public class FinalizeDemo {
	public static void main(String[] args) {
		Employee e1 = new Employee(111, "Wills");
		Employee e2 = new Employee(222, "Smith");

		// REquest JVM to call Garbage Collector
		System.out.println(e1);
		System.out.println(e2);
		
		System.out.println("------------------------------");
		
		e1 = e2; //First Approach.Assigning one reference to another reference.
		
		System.out.println(e1);
		System.out.println(e2);
		
		//Anonymus Object.
		new Employee(444, "James Bond"); // second Approach. through Anonymous Object
		
		System.out.println("------------------------------");
		
		//third approach.
		Employee e3 = new Employee(333, "Rhod");
		System.out.println(e3);
		e3 = null; //3 . Nullifying Reference.
		System.out.println(e3);
		
		System.out.println("------------------------------");
		
		// REquest JVM to call Garbage Collector.
		System.gc();
		System.out.println("--------------");
		System.out.println(e1);
		
	}
}
