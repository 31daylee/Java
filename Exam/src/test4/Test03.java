package test4;
/**
 * 날짜 : 2023/06/30
 * 이름 : 이현정
 * 내용 : 문자열 처리 연습문제  
 */
public class Test03 {

	public static void main(String[] args) {
		
		String fileName = "자바 프로그래밍.pdf";
		
		int idx = fileName.lastIndexOf("."); //확장자를 구할 때는 파일명에 (.) 이 들어갈 수 있으므로 뒤에서 부터 찾기 
		
		String title = fileName.substring(0, idx);
		String ext = fileName.substring(idx+1);
		
		System.out.println("파일명 : "+ title);
		System.out.println("확장자 : "+ ext);
		

	}

}
