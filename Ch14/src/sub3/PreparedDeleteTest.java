package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * 날짜 : 2023/07/11
 * 이름 : 이현정
 * 내용 : Java PreparedStatement 실습하기
 */
public class PreparedDeleteTest {

	public static void main(String[] args) {
		
		String host = "jdbc:mysql://localhost:3306/userdb";
		String user = "root";
		String pass = "1234";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			String sql = "DELETE FROM `User2` WHERE `uid` =?"; //?는 쿼리 파라미터
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, "j101");
			
			psmt.executeUpdate();
			
			conn.close();
			psmt.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		System.out.println("Delete 완료...");
		
		
		
		
	}

}
