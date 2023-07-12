package sub5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * 날짜 : 2023/07/12
 * 이름 : 이현정
 * 내용 : Java CRUD-DAO 실습하기
 * 
 * DAO
 * - Data Access Object
 * - 데이터베이스 CRUD 처리 객체
 * 
 */
public class UserDAO {

	// 싱글톤
	private static UserDAO instance = new UserDAO();
	public static UserDAO getInstance() {
		return instance;
	}
	private UserDAO() {}
	
	//DB 정보 - 상수 변수로 변경 ; 변수는 대문자로 표기
	private final String HOST = "jdbc:mysql://localhost:3306/userdb";
	private final String USER = "root";
	private final String PASS = "1234";
	
	
	
	// Connection 
	private Connection getConnection() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(HOST, USER, PASS);
	}
	
	private Connection conn = null;
	private Statement stmt = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;
	
	public void insertUser(UserVO vo) {
		
		try {
			
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.INSERT_USER);
			psmt.setString(1, vo.getUid());
			psmt.setString(2, vo.getName());
			psmt.setString(3, vo.getHp());
			psmt.setInt(4, vo.getAge());
			
			psmt.executeUpdate();
			
			close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}
	public UserVO selectUser(String uid) {
		//UserVO 는 if 스코프내에만 있으면 정보가 날라감
		UserVO vo = new UserVO();
		
		try {
			conn = getConnection();
			psmt= conn.prepareStatement(SQL.SELECT_USER);
			psmt.setString(1, uid);
			ResultSet rs = psmt.executeQuery();
			
			if(rs.next()) {
				
				
				vo.setUid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setHp(rs.getString(3));
				vo.setAge(rs.getInt(4));
				
	
				
			}
			close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return vo;

		
	}
	
	
	
	
	
	
	
	public List<UserVO> selectUsers() {
		
		List<UserVO> users = new ArrayList<>();
		
		try {
			Connection conn = getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(SQL.SELECT_USERS);
			
			while(rs.next()) {
				
				UserVO vo = new UserVO();
				
				vo.setUid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setHp(rs.getString(3));
				vo.setAge(rs.getInt(4));
				
				users.add(vo);
				
			}
			close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return users; // List 가 사용되면 날라가므로 return 을 통해서 호출되는 곳으로 보내주기 (try-catch 끝난 후)
	}
	
	
	
	
	public int updateUser(UserVO vo) {
		
		int result = 0;
		
		try {
			
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.UPDATE_USER);
			psmt.setString(1, vo.getName());
			psmt.setString(2, vo.getHp());
			psmt.setInt(3, vo.getAge());
			psmt.setString(4, vo.getUid());
			
			
			result = psmt.executeUpdate();
			
			close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
		
		
	}
	public int deleteUser(UserVO vo) {
		
		int result = 0;
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.DELETE_USER);
			psmt.setString(1, vo.getUid());
			
			result = psmt.executeUpdate();
			
			close();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}return result;
		
		

	}
	

	
	// close() 반복적으로 사용하기 때문에 따로 정의해둠 
	public void close() throws SQLException {
		
		// 사용중일 때 close통해 해제 
		if(rs != null ) {
			rs.close();
		}
		
		if(stmt != null) {
			stmt.close();
		}
		
		if(psmt != null ) {
			psmt.close();
		}
		
		if(conn != null) {
			conn.close();
		}
	}
	
}
