package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

// is for retriving data from database 
// first program to connect with jdbc

public class UpdateEmployeeById {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String driver, url, user, password;

		driver = "com.mysql.cj.jdbc.Driver";

		url = "jdbc:mysql://localhost:3306/edb12634";

		user = "root";

		password = "root";

		String updateQuery = "update employee set name = ? where id = ?";

		// Taking input from user. 
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter employee ID to be updated : ");
		int iD = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter employee new name to be updated : ");
		String name = sc.next();

		sc.close();

		// 1. Loading the driver.[Optional] 

		Class.forName(driver);

		// 2. Establish the connection.[building bridge b/w java application and db] 

		Connection con = DriverManager.getConnection(url, user, password);

		// 3. Create Statement Object. 
		// here if we want to take input from user then use PreparedStatement. 
		PreparedStatement pst = con.prepareStatement(updateQuery);
		pst.setInt(2, iD);
		pst.setString(1, name);

		// 4. Process the query.[UPDATE] 
		int status = pst.executeUpdate();

		if (status >= 1) {
			System.out.println("Successfully updated the employee record.");
		} else {
			System.out.println("Something went wrong...!!");
		}

		// 5. Close the resources. 
		pst.close();
		con.close();

	}
}
