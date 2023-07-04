package step2;

import java.util.Scanner;

/**
 * 날짜 : 2023/06/27
 * 이름 : 이현정
 * 내용 : 두 수 비교하기 
 */
public class Test01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		
		if(a > b ) {
			System.out.println(">");
			
		}else if (a < b){
			System.out.println("<");
			
		}else if (a == b){
			System.out.println("==");
		}
			

	}

}
