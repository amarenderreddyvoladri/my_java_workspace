package jdbc_app2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class AddRowToEmployee2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String driver, url, user, password;

		driver = "com.mysql.cj.jdbc.Driver";
		url = "jdbc:mysql://localhost/db11976";
		user = "root";
		password = "root";

		// Program to reading the values of the fields dynamically.
		Scanner in = new Scanner(System.in);
		System.out.println("Emter Employee ID : ");
		int e_id = in.nextInt();
		System.out.println("Emter Employee Name : ");
		String e_name = in.next();
		System.out.println("Emter Employee Salary : ");
		float e_salary = in.nextFloat();
		// --------------------------------------------------------

		// Query to be performed.
		String insert = "insert into employee values(?,?,?)"; // ? = positional paramenters.

		// 1. Loading Driver.[optional]
		Class.forName(driver);

		// 2. Establish Connection.
		Connection con = DriverManager.getConnection(url, user, password);

		// 3. Create Prepared statement Object.
		// used to handle speciallly for prepared statements.
		// import from java.sql package only.
		// it is like a vehicle to carry as statement in mysql.
		PreparedStatement ps = con.prepareStatement(insert);
		ps.setInt(1, e_id);
		ps.setString(2, e_name);
		ps.setFloat(3, e_salary);

		// 4. Processs Query.
		int status = ps.executeUpdate();

		if (status >= 0) {
			System.out.println("New Employee is Added!!");
		} else {
			System.out.println("Something went wrong!!");
		}

		// 5. Closing alll the resources.
		ps.close();
		con.close();
		in.close();

	}
}
