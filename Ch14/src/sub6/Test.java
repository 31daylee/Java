package sub6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


class ConnectionTest {
	
	final String HOST= "jdbc:mysql://localhost:3306/userdb";
	final String USER= "root";
	final String PASS= "1234";
	
	
	public Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver.class");
		return DriverManager.getConnection(HOST,USER,PASS);
	}
	
}

public class Test {

	public static void main(String[] args) {
		
		Connection conn;
		Statement stmt;
	
	
		try {
			
			ConnectionTest ct = new ConnectionTest();
			
			
			conn = ct.getConnection();
			
			String sql = "Insert ``";
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
