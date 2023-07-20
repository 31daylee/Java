package step3;

import java.util.Scanner;

/**
 * 날짜 : 2023/07/20
 * 이름 : 이현정
 * 내용 : 영수증
 */
public class Test04 {

	public static void main(String[] args) {	
		
		Scanner sc = new Scanner(System.in);
		
		int sum = sc.nextInt(); // 물견 총합 
		int b = sc.nextInt(); // 물건 총개수
		
		int[] arr = new int[b]; // 물건 총개수 
		
	
		for(int i=0; i<b; i++) {
			int price = sc.nextInt();
			int num = sc.nextInt();
			
			sum = sum - (price * num);
			
		}
		if(sum == 0) 
			System.out.println("Yes");
		else
			System.out.println("No");
		
	}
}
