package test1;

import java.util.Scanner;

/**
 * 날짜 : 2023/06/13
 * 이름 : 이현정
 * 내용 : 자바 삼항연산자 연습문제
 */


public class Test06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("x값 입력 : ");
		int x = sc.nextInt();
		
		System.out.println("y값 입력 : ");
		int y = sc.nextInt();
		
		String result = x > y ? "x가 더 큽니다." : "y가 더 큽니다."; // 대입연산자 앞에는 무조건 변수- 변수는 타입선언 필수
		
		System.out.println(result);
				

	}

}
