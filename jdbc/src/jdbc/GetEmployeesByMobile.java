package jdbc;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

// is for retriving data from database 
// first program to connect with jdbc

public class GetEmployeesByMobile {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String driver, url, user, password;

		driver = "com.mysql.cj.jdbc.Driver";

		url = "jdbc:mysql://localhost:3306/edb12634";

		user = "root";

		password = "root";

		String selectQuery = "select * from Employee where mobile = ?";

		// Taking input from user.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee Mobile Number : ");
		Long mobile = sc.nextLong();
		sc.close();

		// 1. Loading the driver.[Optional]
		
		Class.forName(driver);

		// 2. Establish the connection.[building bridge b/w java application and db]
		
		Connection con = DriverManager.getConnection(url, user, password);

		// 3. Create Statement Object.
		// here if we want to take input from user then use PreparedStatement.
		PreparedStatement pst = con.prepareStatement(selectQuery);
		pst.setLong(1, mobile);
		
		// 4. Process the query.[SELECT]	
		// ResultSet rs = pst.executeQuery(selectQuery) here remove the selectQuery.
		ResultSet rs = pst.executeQuery();
		
		if (rs.next()) {
			System.out.println(rs.getInt("id"));
			System.out.println(rs.getString("name"));
			System.out.println(rs.getString("email"));
			System.out.println(rs.getLong("mobile"));
			System.out.println(rs.getInt("salary"));
			System.out.println("------------------------------");
		} else {
			System.out.println("No Employee Found with given name!");
		}

		// 5. Close the resources.
		rs.close();
		pst.close();
		con.close();

	}
}


