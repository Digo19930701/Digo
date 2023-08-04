package tw.org.iii.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class JDBC09 {

	public static void main(String[] args) {
		String sql ="SELECT * FROM food";
		try {
			Properties prop = new Properties();
			prop.put("user", "root");
			prop.put("password", "root");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/:3306/iii",prop);
			PreparedStatement pstmtlogin = conn.prepareStatement(sql); 
			ResultSet rs = pstmtlogin.executeQuery();
			while(rs.first()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				System.out.printf("%s:%s\n",id , name);
				
				System.out.println("----------");
				rs.absolute(4);
				System.out.printf("%s:%s\n", rs.getString("id"),rs.getString("name"));
				
				
				
			}
	
	}catch{
		System.out.println("XX");
		}
	}

}
