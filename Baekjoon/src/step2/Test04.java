package step2;

import java.util.Scanner;

/**
 * 날짜 : 2023/07/04
 * 이름 : 이현정
 * 내용 : 사분면 고르기  
 */
public class Test04 {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x>0 && y>0) {
			System.out.println("1");
		}else if(x<0 && y>0) {
			System.out.println("2");
		}else if(x<0 && y<0) {
			System.out.println("3");
		}else if(x>0 && y<0) {
			System.out.println("4");
		}
		
		

	}

}
