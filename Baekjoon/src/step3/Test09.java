package step3;

import java.util.Scanner;

/**
 * 날짜 : 2023/07/26
 * 이름 : 이현정
 * 내용 : 별 찍기 - 1
 */
public class Test09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}
