package sub5;

import java.util.List;
import java.util.Scanner;

/**
 * 날짜 : 2023/07/12
 * 이름 : 이현정
 * 내용 : Java CRUD 실습하기
 * 
 * CRUD
 * - Create, Read, Update, Delete 의미
 * - 데이터베이스의 기본 처리 기능을 의미 
 * - Insert, Select, Update, Delete 처리기능
 */
public class CRUDTest {

	public static void main(String[] args) {
		
		System.out.println("----------------");
		System.out.println("회원관리매니저 v1.0");
		System.out.println("----------------");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("종료:0, 입력:1, 조회:2, 검색:3, 수정:4, 삭제:5");
			System.out.println("선택: ");
			
			int answer = sc.nextInt();
			
			
			if (answer == 0) {
				break;
			}else if(answer == 1) {
				//입력
				// VO 객체 생성 및 초기화
				UserVO vo = new UserVO();
				
				System.out.print("아이디 입력: ");
				vo.setUid(sc.next());
				
				System.out.print("이름 입력: ");
				vo.setName(sc.next());
				
				System.out.print("휴대폰 입력: ");
				vo.setHp(sc.next());
				
				System.out.print("나이 입력: ");
				vo.setAge(sc.nextInt());
				
				UserDAO dao = UserDAO.getInstance();
				dao.insertUser(vo);
				
				System.out.println("Insert 완료...");
				
			}else if (answer == 2) {
				
				//조회
				
//				UserDAO dao = UserDAO.getInstance();   ...(1)
//				List<UserVO> users = dao.selectUsers(); ...(2)
				
				// (1)+(2) 한 줄로 만들기 
				List<UserVO> users = UserDAO.getInstance().selectUsers();
				
				System.out.println("------------ 전체조회 ------------");
				for(UserVO user : users) {
					System.out.println(user); // user는 toString 호출 
				}
				System.out.println("--------------------------------");
				
			}else if(answer == 3) {
				// 검색
				System.out.print("아이디 검색 : ");
				String uid = sc.next();
				
				UserVO user = UserDAO.getInstance().selectUser(uid);
				
				System.out.println("------------ 전체조회 ------------");
				System.out.println(user);
				System.out.println("--------------------------------");
				
			}else if(answer == 4) {
				//수정
				
				UserVO vo = new UserVO();
				System.out.print("수정 회원 아이디 입력 : ");
				vo.setUid(sc.next());
				
				System.out.println("수정 회원 이름 입력 : ");
				vo.setName(sc.next());
				
				System.out.println("수정 회원 휴대폰 입력 : ");
				vo.setHp(sc.next());
				
				System.out.println("수정 회원 나이 입력 : ");
				vo.setAge(sc.nextInt());
				
				int result = UserDAO.getInstance().updateUser(vo);
				
				if(result > 0) {
					System.out.println("수정 완료...");
				}else {
					System.out.println("수정할 사용자가 존재하지 않습니다.");
				}
				
			}else if(answer ==5) {
				//삭제
				
				UserVO vo = new UserVO();
				System.out.println("삭제 회원 아이디 검색 : ");
				vo.setUid(sc.next());
				
				int result = UserDAO.getInstance().deleteUser(vo);
				
				if(result> 0) {
					System.out.println("삭제 완료...");
				}else {
					System.out.println("삭제할 사용자가 존재하지 않습니다.");
				}
			}
			
			
			
		}
		System.out.println("회원관리매니저 종료...");
		
		
		
	} // main end

}
















