package tw.org.iii.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class JDBC05 {

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");
		try {
			Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost/iii", prop);
			String sql = "SELECT * FROM foods WHERE name LIKE ? OR addr LIKE ? OR tel LIKE ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + key + "%");
			ResultSet rs =  pstmt.executeQuery();
			
			while(rs.next()) {
			String id =	 rs.getString("id");//不是0; //型別轉換依照開發需求
			String name = rs.getString("name");
			System.out.println(String.format("%s;%s", id,name));
			}
			
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

}
