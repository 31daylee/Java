package ch01;

import java.util.Scanner;

/**
 * 날짜 : 2023/07/05
 * 이름 : 이현정
 * 내용 : 별
 */
public class Test01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		for(int i =1; i<=n; i++) {
			for(int j=n; j>0; j--) {
				if(i<j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			
			}
			System.out.println();
				
		}

	}
}
