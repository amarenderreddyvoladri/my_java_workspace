package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String driver, url, user, password;

		driver = "com.mysql.cj.jdbc.Driver";

		url = "jdbc:mysql://localhost:3306/edb12634";

		user = "root";

		password = "root";

		String updateQuery1 = "update accounts set balance = balance - 3000 where accno = 112233";

		String updateQuery2 = "update accounts set balance = balance + 3000 where accno = 445566";

		// Load Drivers.
		Class.forName(driver);

		Connection con = DriverManager.getConnection(url, user, password);

		// 1. set auto commit to false.

		con.setAutoCommit(false);

		Statement st = con.createStatement();

		// 2. Add to batch.
		st.addBatch(updateQuery1);
		st.addBatch(updateQuery2);

		// 3. Execute Batch.
		int[] result = st.executeBatch();

		if (result[0] == 1 && result[1] == 1) {
			con.commit();
			System.out.println("Transction Successfully commited!");
		} else {
			con.rollback();
			System.out.println("Transction Failed !");
		}

	}
}
