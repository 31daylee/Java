package sub2;

import java.util.Scanner;

/**
 * 날짜 : 2023/06/26
 * 이름 : 이현정
 * 내용 : Java Throws 실습하기  
 */ 

public class ThrowsTest {
	public static void main(String[] args) {
		
		try {
			myMethod1(10);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		System.out.println("프로그램 정상 종료...");

	}




	
	public static void myMethod1(int n1) throws Exception { //myMethod1을 처리하는 곳으로 떠넘기기 -> 메인클래스로 이동
		myMethod2(n1);
		
	}
	
	public static void myMethod2(int n1) throws Exception { // Exception으로 두어 모든 예외를 다 처리
		
		Scanner scan = new Scanner(System.in);
		System.out.println("n2 입력 :  ");
		int n2 = scan.nextInt(); //could be 예외 발생 1
		
		int result = n1/ n2;//could be 예외 발생 2
		
		System.out.println("result : " + result);
		
		
		
	}
}
	
	
	

