package jdbc_app1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetAllEmployees {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String driver, url, user, password;
		
		driver = "com.mysql.cj.jdbc.Driver";
		url = "jdbc:mysql://localhost/db11976";
		user = "root";
		password = "root";
		
		// Query to be performed.
		String select = "Select * from employee";
		
		//1. Loading Driver.[optional]
		Class.forName(driver);
		
		//2. Establish Connection.
		Connection con = DriverManager.getConnection(url, user, password);
		
		// 3. Create statement Object. import from java.sql package only.
		// it is like a vehicle to carry as statement in mysql.
		Statement st = con.createStatement();
		
		// 4. Processs Query.
		ResultSet rs = st.executeQuery(select);
		
		if(rs != null) {
			while(rs.next()) {
				System.out.println(rs.getInt("eid")+"\t" +rs.getString("eName")+ "\t"+rs.getString("eSal"));
				System.out.println("-----------------------------------");
			}
		}
		else {
			System.out.println("No Data Found!!");
		}
		
		//5. Closing alll the resources.
		rs.close();
		st.close();
		con.close();
		
	}
}
