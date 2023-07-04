package step2;

import java.util.Scanner;

/**
 * 날짜 : 2023/07/04
 * 이름 : 이현정
 * 내용 : 알람 시계
 */
public class Test05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();

		sc.close();
		
		if(m < 45) {
			h--;
			m = 60 -(45-m);
			if(h < 0) {
				h = 23;
			}
			System.out.println(h + " "+ m);
		}else {
			System.out.println(h + " "+(m-45));
		}
		
		
		
	}

}
