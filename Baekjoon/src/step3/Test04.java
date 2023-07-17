package step3;

import java.util.Scanner;

/**
 * 날짜 : 2023/07/17
 * 이름 : 이현정
 * 내용 : 영수증
 */
public class Test04 {

	public static void main(String[] args) {	
		
		Scanner sc = new Scanner(System.in);
		int x, n;
		x = sc.nextInt();
		n = sc.nextInt();
		int[] arr = new int[n];
		
		
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[i]= a * b;
			
		}for(int k : arr) {
			if(k == x) {
				System.out.println("Yes");
			}else {
				System.out.println("");
			}
		}
	}

}
