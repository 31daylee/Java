package step3;

import java.util.Scanner;

/**
 * 날짜 : 2023/07/05
 * 이름 : 이현정
 * 내용 : 구구단
 */
public class Test01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
	
			for(int j=1; j<10; j++) {
				System.out.println(n+ " * " + j + " = " + n*j);
		}

	}

}
