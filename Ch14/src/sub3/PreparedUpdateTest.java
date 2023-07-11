package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * 날짜 : 2023/07/11
 * 이름 : 이현정
 * 내용 : Java PreparedStatement 실습하기
 */
public class PreparedUpdateTest {

	public static void main(String[] args) {
		
		String host = "jdbc:mysql://localhost:3306/userdb";
		String user = "root";
		String pass = "1234";
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			String sql = "UPDATE `User2` SET `hp`=?, `age`=? WHERE `uid`=? ";
			
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, "010-1234-1111");
			psmt.setInt(2, 25);
			psmt.setString(3, "j101");
			
			psmt.executeUpdate();
			
			conn.close();
			psmt.close();
			
		} catch (Exception e) {
			
		}
		System.out.println("Update 완료...");
	}

}
