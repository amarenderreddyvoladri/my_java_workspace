package jdbc_app2;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Scanner;

public class Calling_Procedure1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String driver, url, user, password;

		driver = "com.mysql.cj.jdbc.Driver";
		url = "jdbc:mysql://localhost/db11976";
		user = "root";
		password = "root";

		// Program to reading the values of the fields dynamically.
		Scanner in = new Scanner(System.in);

		// ---------------------------------------------
		System.out.println("Enter ID : ");
		int id = in.nextInt();

		// --------------------------------------------------------

		// Query to be performed.
		String p_call = "call getEmployeeById(?) "; // ? = positional paramenters.

		// 1. Loading Driver.[optional]
		Class.forName(driver);

		// 2. Establish Connection.
		Connection con = DriverManager.getConnection(url, user, password);

		// 3. Create Prepared statement Object.
		// used to handle speciallly for prepared statements.
		// import from java.sql package only.
		// it is like a vehicle to carry as statement in mysql.
		CallableStatement cst = con.prepareCall(p_call);
		cst.setInt(1,id);

		//ps.setInt(1, get_e_id);
		//ps.setString(2, get_e_name);
		//ps.setFloat(3, get_e_sal);

		// 4. Processs Query.
		ResultSet rs = cst.executeQuery();

		if (rs.next()) {
			System.out.println(rs.getInt("Id"));
			System.out.println(rs.getString("Name"));
			System.out.println(rs.getFloat("Salary"));
			System.out.println(rs.getString("Gender"));
			System.out.println(rs.getString("City"));
		} 
		else {
			System.out.println("Sorry!, Excepted query not performed!!");
		}

		// 5. Closing alll the resources.
		cst.close();
		con.close();
		in.close();

	}
}
