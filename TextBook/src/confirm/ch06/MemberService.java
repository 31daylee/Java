package confirm.ch06;
/**
 * 날짜 : 2023/07/19
 * 이름 : 이현정
 * 내용 : Java 교재 p274 15번/14번
 */

public class MemberService {
	
	//15번
	public static boolean login(String id, String password) {
		
		if(id.equals("hong") && password.equals("12345")) {
			return true;
			
		}else {
			return false;
		}
	}
			
	public static void logout(String id) {
		
	}
	
	
	public static void main(String[] args) {
		
			
		MemberService ms = new MemberService();
		boolean result = MemberService.login("hong","12345");
		
		if(result) {
			System.out.println("로그인 되었습니다.");
			MemberService.logout("hong");
		}else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}

}


	