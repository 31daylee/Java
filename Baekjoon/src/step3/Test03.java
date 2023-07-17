package step3;

import java.util.Scanner;

/**
 * 날짜 : 2023/07/17
 * 이름 : 이현정
 * 내용 : 합
 */
public class Test03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int sum = 0;
		
		for(int i=1; i<=n; i++) {
			sum += i;
		}System.out.println(sum);
		
	}

}
