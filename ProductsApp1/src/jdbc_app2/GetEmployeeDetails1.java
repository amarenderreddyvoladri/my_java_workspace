package jdbc_app2;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class GetEmployeeDetails1 {
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
		
		// --------------------------------------------------------

		// Query to be performed.
		String select = "select * from employee where eid = ?"; // ? = positional paramenters.

		// 1. Loading Driver.[optional]
		Class.forName(driver);

		// 2. Establish Connection.
		Connection con = DriverManager.getConnection(url, user, password);

		// 3. Create Prepared statement Object.
		// used to handle speciallly for prepared statements.
		// import from java.sql package only.
		// it is like a vehicle to carry as statement in mysql.
		PreparedStatement ps = con.prepareStatement(select);
		ps.setInt(1, e_id);
		

		// 4. Processs Query.
		ResultSet rs = ps.executeQuery();

		if (rs.next()) {
			System.out.println(rs.getInt("eid"));
			System.out.println(rs.getString("ename"));
			System.out.println(rs.getFloat("esal"));
			
		} else {
			System.out.println("Sorry!, Excepted Details not found!!");
		}

		// 5. Closing alll the resources.
		ps.close();
		con.close();
		in.close();

	}
}
