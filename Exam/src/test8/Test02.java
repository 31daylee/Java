package test8;
/**
 * 날짜 : 2023/07/21
 * 이름 : 이현정
 * 내용 : 자바 총정리 연습문제
 */
public class Test02 {

	public static void main(String[] args) {
		
		String str1 = "Hello";
		String str2 = "World";
		
		System.out.println("str1 역순 : "+ reverseStr(str1));
		System.out.println("str2 역순 : "+ reverseStr(str2));
	}
	
	public static String reverseStr(String str) {
		StringBuilder sb = new StringBuilder();
		
		for(int i=str.length()-1; i>=0; i--) { //4,3,2,1,0 순으로 진행
			char ch = str.charAt(i); // 문자열에서 문자 추출 
			sb.append(ch);
		}
		return sb.toString();
	}

}
