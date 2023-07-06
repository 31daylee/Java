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
		
		int min = 60 * a + b;
		min += c;
		
		int hour = (min/60) %24;
		int minute = min % 60;
		
		System.out.println(hour + " "+ minute);
		
	}
	

}
