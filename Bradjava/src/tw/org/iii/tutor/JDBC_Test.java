package tw.org.iii.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class JDBC_Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);//讓使用者可以輸入
		System.out.println("你要第幾頁");
		int page = scanner.nextInt();
		int rpp= 10;
		int strat = (page-1)*rpp;
		
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");
		
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/iii", prop);
			Statement stmt = conn.createStatement();
			ResultSet rsTotal = stmt.executeQuery("SELECT count(*) total FROM food");
			rsTotal.next();
			int total = rsTotal.getInt("total");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
