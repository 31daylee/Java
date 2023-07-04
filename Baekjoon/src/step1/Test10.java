package step1;
/**
 * 날짜 : 2023/06/16
 * 이름 : 이현정
 * 내용 : 곱셈
 */
import java.util.Scanner;

public class Test10 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a*(b%10));
		System.out.println((a*((b%100)/10)));
		System.out.println((a*(b/100)));
		System.out.println(a*b);
		
		
		
		
	}

}
