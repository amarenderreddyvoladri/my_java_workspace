package jdbc;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// is for retriving data from database 
// first program to connect with jdbc

public class AddEmployee {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String driver, url, user, password;
		
		driver = "com.mysql.cj.jdbc.Driver";
		
		url = "jdbc:mysql://localhost:3306/edb12634";
		
		user = "root";
		
		password = "root";
		
		// 1. Loading the driver.[Optional]
		// ClassNotFoundException.
		// should handle by user.[throws]
		// Checked Exception.
		// What is Loaidng Driver ?
		// should  be dynamicaally loaded from memory and it register with driver manager.
		// Loading Driver is Optional from java version 6.
		Class.forName(driver);
		
		// 2. Establish the connection.[building bridge b/w java application and db]
		
		Connection con = DriverManager.getConnection(url, user, password);
		
		// 3. Create Statement Object.
		
		Statement st = con.createStatement();
		
		// 4. Process the query.[SELECT]
		String selectQuery = "select * from Employee";		
		
		ResultSet rs = st.executeQuery(selectQuery);
		
		
		
		// 5. Close the resources.
		rs.close();
		st.close();
		con.close();
		
	}
}


/*
 * Mistakes :
 * driver
 * jdb no  c
 * port number 3307 - wrong.
 * wrong db name : edb12635
 * mysql// not :
 * incorrect table name : employe
 * */
