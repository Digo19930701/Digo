package tw.org.iii.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC01 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost/iii","");
			Statement stmt = conn.createStatement();
			int n = stmt.executeUpdate("INSERT INTO cust(cname,tel,birthday) VALUSE('peter','321','1999-03-04')");
			System.out.println(n);
//			 System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
