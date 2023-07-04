package step1;
/**
 * 날짜 : 2023/06/16
 * 이름 : 이현정
 * 내용 : 1998년생인 내가 태국에서는 2541년생?!
 */
import java.util.Scanner;

public class Test08 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int y = sc.nextInt();
		
		if (y >= 1000 && y <=3000) {
			
			System.out.println(y-543);
		}
		
		
	}

}
