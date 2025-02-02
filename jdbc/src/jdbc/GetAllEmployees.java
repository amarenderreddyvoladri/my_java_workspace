package jdbc;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// is for retriving data from database 
// first program to connect with jdbc

public class GetAllEmployees {
	
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
		// should  be dynamically loaded the drivers file from memory and it register with driver manager.
		// Loading Driver is Optional from java version 6.
		// When a Driver class is loaded, it should create an instance ofitself and register it with the DriverManager.
		// This means that auser can load and register a driver by calling.
		// for more info hover to Driver.
		Class.forName(driver);
		
		// 2. Establish the connection.[building bridge b/w java application and db]
		// import DriverManager from sql.DriverManager .
		// handle SQLException.[throws]
		// import Connection from sql.Connection.
		// DriverManager.getConnection() it returns connection object.
		// for more details hover on connection.
		// the url represents the database URL that specifies the location of the database to which you want to connect
		// The format of this URL varies depending on the type of database and the JDBC driver used.
		// DriverManager is a class in java.sql.DriverManager which returns a Connection Object.
		// Connection is an Interface.
		Connection con = DriverManager.getConnection(url, user, password);
		
		// 3. Create Statement Object.
		// import java.sql.Statement;
		// it act as vehicle from bridge.
		// con.createStatement() it returns Statement Object.
		// Statement is an Interface.
		Statement st = con.createStatement();
		
		// 4. Process the query.[SELECT]
		String selectQuery = "select * from Employee";		
		// Return type of executeQuery() method is ResultSet.
		// import java.sql.ResultSet;
		// st.executeQuery(selectQuery) is only for SELECT Query only.
		// ResultSet - just like cursor pointing to records.
		// ResultSet - interface.
		ResultSet rs = st.executeQuery(selectQuery);
		// to read records from object-rs.
		// for more hover on next() method..
		while(rs.next()) {
			System.out.println(rs.getInt("id"));
			System.out.println(rs.getString("name"));
			System.out.println(rs.getString("email"));
			System.out.println(rs.getLong("mobile"));
			System.out.println(rs.getInt("salary"));
		}
		
		// 5. Close the resources.
		rs.close();
		st.close();
		con.close();
		
	}
}


/*
 * Mistakes :
 * driver
 * jdb no including charatcer-c
 * port number 3307 - wrong.
 * wrong db name : edb12635
 * mysql// not :
 * incorrect table name : employe
 * */
