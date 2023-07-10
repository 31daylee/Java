package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜 : 2023/07/10
 * 이름 : 이현정
 * 내용 : Java Delete 실습하기 
 * 
 * */
public class DeleteTest {

	public static void main(String[] args) {
		
		String host = "jdbc:mysql://localhost:3306/userdb";
		String user = "root";
		String pass = "1234";
		
		try {
			// 1단계
			Class.forName("com.mysql.cj.jdbc.Driver");
					
			// 2단계
			Connection conn = DriverManager.getConnection(host,user,pass);
			
			// 3단계
			Statement stmt = conn.createStatement();
			
			// 4단계
			String spl = "DELETE FROM `User1` WHERE `uid`='j101' ";
			
			stmt.executeUpdate(spl);
			
			// 5단계
			// 6단계
			stmt.close();
			conn.close();
			
			
			
		} catch (Exception e) {
		}
		
		System.out.println("Delete 완료...");
	}
	
	

}
