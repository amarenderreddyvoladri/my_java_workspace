package jdbc;

import java.lang.reflect.Method;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

// is for retriving data from database 
// first program to connect with jdbc

public class GetEmployeesByEmail {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String driver, url, user, password;

		driver = "com.mysql.cj.jdbc.Driver";

		url = "jdbc:mysql://localhost:3306/edb12634";

		user = "root";

		password = "root";

		String insertQuery = "insert into employee values(?,?,?,?,?)";
		// here in ?'s sequence is mandatory.

		// Taking input from user.
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Employee Id : ");
		int iD = sc.nextInt();

		System.out.println("Enter Employee Name : ");
		String name = sc.next();
		sc.nextLine();

		System.out.println("Enter Employee Email : ");
		String email = sc.next();
		sc.nextLine();

		System.out.println("Enter Employee Mobile Number : ");
		Long mobile = sc.nextLong();

		System.out.println("Enter Employee Salary : ");
		int salary = sc.nextInt();

		sc.close();
		// 1. Loading the driver.[Optional]

		Class.forName(driver);

		// 2. Establish the connection.[building bridge b/w java application and db]

		Connection con = DriverManager.getConnection(url, user, password);

		// 3. Create Statement Object.
		// here if we want to take input from user then use PreparedStatement.
		// PreparedStatement used for dynamic queries only..
		PreparedStatement pst = con.prepareStatement(insertQuery);
		pst.setInt(1, iD); // here 1 refers to the first ? in query.
		pst.setString(2, name);
		pst.setString(3, email);
		pst.setLong(4, mobile);
		pst.setInt(5, salary);
		
		// 4. Process the query.[INSERT]
		// ResultSet rs = pst.executeQuery(selectQuery) here remove the selectQuery as we have already added selectQuery in preapredstatement..
		// for all DML queries should call executeUpdate() Method which returns integer.
		int status = pst.executeUpdate();
		
		if(status >= 1) {
			System.out.println("Successfully record is inserted.");
		}else {
			System.out.println("Failed to insert new record.");
		}
		
		// 5. Close the resources.
		
		pst.close();
		con.close();

	}
}
