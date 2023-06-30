package step2;

import java.util.Scanner;

/**
 * 날짜 : 2023/06/30
 * 이름 : 이현정
 * 내용 : 윤년 
 */
public class Test03 {

	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			
			
			if((a/400 == 0) && (a/100 != 0)) {
				System.out.println("1");
			}else if(a/400 != 0){
				System.out.println("0");
				
			}else if(a/400 == 0){
				System.out.println("1");
			}else if(a/400 != 0){
				System.out.println("0");
			}


	}

}
