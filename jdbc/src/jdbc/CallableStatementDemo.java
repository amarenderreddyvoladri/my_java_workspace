package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

// is for retriving data from database 
// first program to connect with jdbc

public class CallableStatementDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String driver, url, user, password;

		driver = "com.mysql.cj.jdbc.Driver";

		url = "jdbc:mysql://localhost:3306/edb12634";

		user = "root";

		password = "root";

		String procedureQuery = "{call getAllEmployees()}";

		// 1. Loading the driver.[Optional]

		Class.forName(driver);

		// 2. Establish the connection.[building bridge b/w java application and db]

		Connection con = DriverManager.getConnection(url, user, password);

		// 3. Create Statement Object.

		CallableStatement cst = con.prepareCall(procedureQuery);

		// 4. Process the query.[transcation]
		ResultSet rs = cst.executeQuery();

		while (rs.next()) {
			System.out.println(rs.getInt("id")); 
			System.out.println(rs.getString("name"));
			System.out.println(rs.getLong("salary"));
			System.out.println(rs.getString("gender"));
			System.out.println(rs.getString("city"));
		}

		// 5. Close the resources.
		con.close();
		rs.close();
		cst.close();

	}
}

/*
 * Mistakes : driver jdb no c port number 3307 - wrong. wrong db name : edb12635
 * mysql// not : incorrect table name : employe
 */
