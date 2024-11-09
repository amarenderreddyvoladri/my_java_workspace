package jdbc_app2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteEmployeeDetail1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String driver, url, user, password;

		driver = "com.mysql.cj.jdbc.Driver";
		url = "jdbc:mysql://localhost/db11976";
		user = "root";
		password = "root";

		// Program to reading the values of the fields dynamically.
		Scanner in = new Scanner(System.in);

		// ---------------------------------------------
		System.out.println("Emter Employee ID to delete the record : ");
		int e_id = in.nextInt();
		// --------------------------------------------------------

		// Query to be performed.
		String update = "delete from employee where eid = ?"; // ? = positional paramenters.

		// 1. Loading Driver.[optional]
		Class.forName(driver);

		// 2. Establish Connection.
		Connection con = DriverManager.getConnection(url, user, password);

		// 3. Create Prepared statement Object.
		// used to handle speciallly for prepared statements.
		// import from java.sql package only.
		// it is like a vehicle to carry as statement in mysql.
		PreparedStatement ps = con.prepareStatement(update);
		ps.setInt(1, e_id);

		//ps.setInt(1, get_e_id);
		//ps.setString(2, get_e_name);
		//ps.setFloat(3, get_e_sal);

		// 4. Processs Query.
		int status = ps.executeUpdate();

		if (status >= 0) {
			System.out.println("Successfully Deleted!!");

		} else {
			System.out.println("Sorry!, Excepted Deletion not performed!!");
		}

		// 5. Closing alll the resources.
		ps.close();
		con.close();
		in.close();

	}
}
