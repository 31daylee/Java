package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


/**
 * 날짜 : 2023/07/11
 * 이름 : 이현정
 * 내용 : Java PreparedStatement 실습하기
 */
public class PreparedInsertTest {

	public static void main(String[] args) {
		
		
		// DB 정보
		String host = "jdbc:mysql://localhost:3306/userdb";
		String user = "root";
		String pass = "1234";
		
		
		
		try {
			// 1단계- JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			// 2단계- 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host,user,pass);
			
			// 3단계- SQL 실행객체 생성
			String sql = "INSERT INTO `User2` VALUES (?,?,?,?)"; //쿼리 파라미터 
			PreparedStatement psmt = conn.prepareStatement(sql); //createStatement 와 다른 지점 
			psmt.setString(1, "j101");
			psmt.setString(2, "홍길동");
			psmt.setString(3, "010-1234-1001");
			psmt.setInt(4, 23);
			
			// 4단계- SQL 실행
			psmt.executeUpdate();
			
			// 5단계- 결과처리 
			
			
			// 6단계- 연결 해제 
			conn.close();
			psmt.close();
			
		} catch (Exception e) {
			
		} System.out.println("Insert 완료...");
		
	}

}
