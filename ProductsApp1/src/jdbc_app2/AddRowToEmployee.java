package jdbc_app2;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;

public class AddRowToEmployee {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String driver, url, user, password;
		
		driver = "com.mysql.cj.jdbc.Driver";
		url = "jdbc:mysql://localhost/db11976";
		user = "root";
		password = "root";
		
		// Query to be performed.
		String select = "insert into employee values(1009,'BringRaj','34000')";
		
		//1. Loading Driver.[optional]
		Class.forName(driver);
		
		//2. Establish Connection.
		Connection con = DriverManager.getConnection(url, user, password);
		
		// 3. Create statement Object. import from java.sql package only.
		// it is like a vehicle to carry as statement in mysql.
		Statement st = con.createStatement();
		
		// 4. Processs Query.
		int status = st.executeUpdate(select);
		
		if(status >= 0) {
			System.out.println("New Employee is Added!!");
		}
		else {
			System.out.println("Something went wrong!!");
		}
		
		//5. Closing alll the resources.		
		st.close();
		con.close();
		
	}
}

