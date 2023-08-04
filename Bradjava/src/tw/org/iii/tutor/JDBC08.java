package tw.org.iii.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

import tw.org.iii.classes.BCrypt;

public class JDBC08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Account = ");
		String account = scanner.next();
		System.out.print("Password = ");
		String passwd = scanner.next();
		System.out.print("Name = ");
		String name = scanner.next();
		
		try {
			Properties prop = new Properties();
			prop.put("user", "root");
			prop.put("password", "root");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/:3306/iii",prop);
			
			String sqllogin = "SELECT * FROM member WHERE account = ?";
			PreparedStatement pstmtlogin = conn.prepareStatement(sqllogin);
			pstmtlogin.setString(1, account);
			ResultSet rs = pstmtlogin.executeQuery();
			if (rs.next()) {
				String hasPasswd =  rs.getString("passwd");
				if(BCrypt.checkpw(passwd, hasPasswd)){
					System.out.println("welcom," + rs.getString("cname"));
				}
				}else {
					System.out.println("ERR2");
				}
			else {
				System.out.println("ERR1");
			}
		
		} catch (Exception e) {
			System.out.println(e);
		}

		
		
	}


	}


