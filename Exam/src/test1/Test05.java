package test1;

import java.util.Scanner;

/**
 * 날짜 : 2023/06/13
 * 이름 : 이현정
 * 내용 : 자바 조건문 연습문제
 */


public class Test05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		
		System.out.println("입력한 점수는 " + score + "입니다.");
		
		switch(score / 10) {
		case 10: // 100점
		case 9: // 90점대 
			System.out.println("A 입니다.");
			break;
		case 8: // 80점대
			System.out.println("B 입니다.");
			break;
		case 7: // 70점대
			System.out.println("C 입니다.");
			break;
		case 6:
			System.out.println("D 입니다.");
			break;
		default:
			System.out.println("F 입니다.");
			break;
		}
		sc.close();
				
				

	}

}
