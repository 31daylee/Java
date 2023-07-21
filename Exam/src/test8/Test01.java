package test8;

import java.util.StringTokenizer;

/**
 * 날짜 : 2023/07/21
 * 이름 : 이현정
 * 내용 : 자바 총정리 연습문제
 */
public class Test01 {

	public static void main(String[] args) {
		
		String[] arr1 = {"Apple","Banana","Grape","Orange"};
		String result1 = String.join("-", arr1);
		System.out.println("result1 : "+ result1);
		
		
		String[] arr2 = result1.split("-"); // - 기준으로 쪼개라 
		String result2 = String.join("", arr2);
		System.out.println("result2 : "+ result2);
		

		String[] arr3 = result2.split("(?=[A-Z])"); //대문자일 경우에 쪼개라 
		String result3 = String.join("^", arr3);
		System.out.println("result3 : "+ result3);
		
		StringTokenizer st = new StringTokenizer(result3,"^"); // 특정 구분자를 기준으로 쪼개라 
		StringBuilder sb = new StringBuilder();
		
		while(st.hasMoreTokens()) {
			sb.append(st.nextToken()); // StringBuilder에 append로 반복적으로 진행 
		}
		
		String result4 = sb.toString();
		System.out.println("result4 : "+ result4);
		
		
		
		
		
		
		
		
	}

}
