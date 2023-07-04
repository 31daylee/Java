package step2;

import java.util.Scanner;

/**
 * 날짜 : 2023/07/04
 * 이름 : 이현정
 * 내용 : 오븐 시계
 */
public class Test06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		sc.close();
		
		if((b+c)-60 > 60) {
			b= (b + c)-60;
			a++;
			System.out.println(a +" "+ b);
		}if((b+c)-60 == 60) {
			a++;
			b=0;
			System.out.println(a +" "+ b);
		}else {
			
			System.out.println(a +" "+ (b+c));
			
		}

	}

}
