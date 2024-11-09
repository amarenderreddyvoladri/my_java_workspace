package jdbc_app2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class CreateDatabaseQuery1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String driver, url, user, password;

		driver = "com.mysql.cj.jdbc.Driver";
		url = "jdbc:mysql://localhost/";
		user = "root";
		password = "root";

		// Program to reading the values of the fields dynamically.
		Scanner in = new Scanner(System.in);

		// ---------------------------------------------
		System.out.println("Enter New Database name : ");
		String dbName = in.next();

		// --------------------------------------------------------

		// Query to be performed.
		String create = "create database ?"; // ? = positional paramenters.

		// 1. Loading Driver.[optional]
		Class.forName(driver);

		// 2. Establish Connection.
		Connection con = DriverManager.getConnection(url, user, password);

		// 3. Create Prepared statement Object.
		// used to handle speciallly for prepared statements.
		// import from java.sql package only.
		// it is like a vehicle to carry as statement in mysql.
		PreparedStatement ps = con.prepareStatement(create);
		ps.setString(1,dbName);

		//ps.setInt(1, get_e_id);
		//ps.setString(2, get_e_name);
		//ps.setFloat(3, get_e_sal);

		// 4. Processs Query.
		int status = ps.executeUpdate();

		if (status >= 0) {
			System.out.println("Successfully new Database created!!");

		} else {
			System.out.println("Sorry!, Excepted creation not performed!!");
		}

		// 5. Closing alll the resources.
		ps.close();
		con.close();
		in.close();

	}
}
