package sub5;

public class SQL {
	
	// 직접참조하기 위해서 static 으로 변경하고 public 으로 변경 + 상수변경
	public final static String INSERT_USER = "INSERT INTO `User3` VALUES (?,?,?,?)";
	
	public final static String SELECT_USERS = "SELECT * FROM `User3`";
	
	public final static String SELECT_USER = "SELECT * FROM `User3` WHERE `uid`=?";
	
	public final static String UPDATE_USER = "UPDATE `User3` SET "
											+ "`name` =?,"
											+ "`hp` =?,"
											+ "`age` =? "
											+ "WHERE `uid`=?";
	
	public final static String DELETE_USER = "DELETE FROM `User3` WHERE `uid`=?";
	
	
}
