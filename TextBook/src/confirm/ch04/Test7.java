package confirm.ch04;

import java.util.Scanner;

/**
 * 날짜 : 2023/07/18
 * 이름 : 이현정
 * 내용 : 교재 p138
 */
public class Test7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int balance = 0;
		
		System.out.println("-------------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("------------------------------");
		System.out.println("선택> ");
		
		int answer = sc.nextInt();
		
		while(true) {
			
			if(answer == 1) {
				
				sc.nextLine();
			}
			
			
			if(answer == 4) {
				break;
			}
			
		}
		
	}
}
